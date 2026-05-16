# Icons

`gwt-fusion-ui` provides an SVG-first icon foundation under `org.gwtfusion.ui.component.icon`.

`Icon` is a `UiComponent`. Its root is a lightweight `span` so it fits the existing `HTMLElement element()` contract, and the rendered graphic is an inline SVG child.

## Basic Usage

```java
LucideIcons.check()
    .variant(IconVariant.PRIMARY)
    .ariaLabel("Confirmed");
```

Use `decorative()` when the icon is only visual and nearby text already describes the action or state.

```java
LucideIcons.search().decorative();
```

## Sizing And Stroke

```java
LucideIcons.x()
    .size(IconSize.LG)
    .strokeWidth(1.5);
```

`size(int)` is available for exact pixel sizes.

## Button Composition

```java
Button.create("Save")
    .icon(LucideIcons.check());

Button.create("")
    .size(ButtonSize.ICON)
    .icon(LucideIcons.search())
    .aria("label", "Search");
```

`Button.icon(Icon icon)` treats the icon as decorative because the button text or button ARIA label should provide the accessible name.

## Providers

`IconProvider` and `IconRegistry` keep icon packs explicit and avoid global registration side effects.

```java
IconRegistry registry = IconRegistry.create()
    .register("lucide", LucideIcons.provider());

registry.icon("lucide", "search")
    .ariaLabel("Search");
```

The current Lucide support is a small proof of concept. Larger icon packs should move into optional modules and may be generated from source data.
