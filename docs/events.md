# Event Listener

`gwt-fusion-ui` uses a small Elemental2-oriented event API instead of depending on classic GWT widget handlers.

## Listener Registration

`ListenerRegistration` is the lightweight equivalent to GWT `HandlerRegistration`:

```java
ListenerRegistration registration = component.listen("click", event -> {
    // DOM event
});

registration.remove();
```

`close()` is available as a convenience alias for `remove()`.

## Semantic Value Changes

Interactive components should expose semantic listener methods when the raw DOM event is not the best public API.

```java
Slider slider = Slider.create()
    .min(0)
    .max(100)
    .step(1)
    .value(65);

slider.onValueChange(value -> {
    // Fires on DOM input while dragging.
});

slider.onValueCommit(value -> {
    // Fires on DOM change when the value is committed.
});
```

Programmatic setters such as `Slider.value(double)` update component state but do not fire listeners implicitly. This follows browser DOM behavior and keeps controlled updates explicit.

Current semantic listener methods include:

- `Checkbox.onCheckedChange(ValueChangeListener<Boolean>)`
- `Switch.onCheckedChange(ValueChangeListener<Boolean>)`
- `RadioGroup.onValueChange(ValueChangeListener<String>)`
- `Slider.onValueChange(ValueChangeListener<Double>)`
- `Slider.onValueCommit(ValueChangeListener<Double>)`
- `Tabs.onValueChange(ValueChangeListener<String>)`
- `Toggle.onPressedChange(ValueChangeListener<Boolean>)`
- `ToggleGroup.onValueChange(ValueChangeListener<String>)` for single-selection groups
- `ToggleGroup.onValuesChange(ValueChangeListener<List<String>>)`
- `Collapsible.onOpenChange(ValueChangeListener<Boolean>)`
- `Accordion.onValueChange(ValueChangeListener<String>)`
