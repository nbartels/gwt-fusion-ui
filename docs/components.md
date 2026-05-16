# Komponenten

## Implementiert

- Button
- Badge
- Card
- Alert
- Input
- Label
- Separator
- Checkbox
- Switch
- Textarea
- RadioGroup
- FormField
- FormLabel
- FormDescription
- FormMessage
- NativeSelect
- InputGroup
- Slider
- Tabs
- CodeBlock
- Accordion
- Collapsible
- AspectRatio
- ButtonGroup
- Breadcrumb
- Pagination
- ScrollArea
- Toggle
- ToggleGroup
- Typography
- Icon

## Naechste Kandidaten

- InputOtp
- Select
- NavigationMenu
- Sidebar
- Menubar
- Dialog
- Dropdown
- Tooltip

## Komponentenvertrag

- Komponente implementiert `UiComponent`.
- Root-Element kommt ueber `element()`.
- Varianten und Groessen werden ueber Enums modelliert.
- Tailwind-Klassen sind statisch oder safelisted.
- Accessibility-Attribute gehoeren in die Komponente, wenn sie fuer korrektes Verhalten notwendig sind.
