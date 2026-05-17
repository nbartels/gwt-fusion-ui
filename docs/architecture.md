# Architecture

`gwt-fusion-ui` is designed as a DOM-based component library. Each component exposes an `HTMLElement` through `UiComponent.element()`. This keeps the library closer to J2CL and avoids classic GWT widget dependencies.

## Packages

- `org.gwtfusion.ui`: Base API.
- `org.gwtfusion.ui.component`: Components.
- `org.gwtfusion.ui.css`: Tailwind/CSS helpers.
- `org.gwtfusion.ui.overlay`: Overlay, focus, keyboard, portal, and ARIA helpers.
- `org.gwtfusion.ui.theme`: Theme model and `ThemeManager`.

## Styling

Tailwind classes are kept statically in Java enums and component classes. Theme colors use CSS variables such as `--primary`, `--background`, and `--foreground`.

## Code-Splitting

The library itself does not enforce code splitting. Applications can lazy-load component areas. The demo uses `GWT.runAsync` to make this approach visible in the repository.

## Overlays

Overlay infrastructure intentionally stays small and explicit. `Portal`, `OutsideClick`, `FocusManager`, `Keyboard`, `IdGenerator`, `Aria`, and `OverlayLayer` form the shared base for components such as `Dialog`, `Popover`, `Tooltip`, `DropdownMenu`, and the richer `Select`.

Utilities should not create global DOM containers or listeners when their classes load. DOM-side effects only happen when a component registers them explicitly.
