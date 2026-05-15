# Milestones

This file turns the roadmap into concrete, checkable implementation milestones. Each milestone should leave the project in a buildable state and keep the demo up to date.

## Milestone 1: Form Foundation

- [x] Implement `Checkbox` component.
- [x] Add `Checkbox` checked, unchecked, disabled, and invalid examples to the demo.
- [x] Add `Checkbox` enum/class mapping tests.
- [x] Implement `Switch` component.
- [x] Add `Switch` checked, unchecked, and disabled examples to the demo.
- [x] Add `Switch` enum/class mapping tests.
- [x] Implement `Textarea` component.
- [x] Add `Textarea` default, disabled, and placeholder examples to the demo.
- [x] Add `Textarea` API tests where possible.
- [x] Implement `RadioGroup` component.
- [x] Add `RadioGroup` horizontal, vertical, disabled, and selected-state examples to the demo.
- [x] Add `RadioGroup` enum/class mapping tests.
- [x] Verify `mvn -Dskip.tailwind=true verify`.
- [x] Verify `mvn -Pdemo -pl gwt-fusion-ui-demo -am -Dskip.tailwind=true package`.

## Milestone 2: Form Composition

- [x] Define whether form controls should share a small `FormControl` interface.
- [x] Implement `FormField`.
- [x] Implement `FormLabel` or align existing `Label` with form-field composition.
- [x] Implement `FormDescription`.
- [x] Implement `FormMessage`.
- [x] Implement `NativeSelect` as the simple native select option.
- [x] Implement `Select` as the richer styled select option or document why it depends on overlays.
- [x] Implement `InputGroup` as a composition primitive for `Input`, `Button`, icons, and addons.
- [x] Implement `Slider`.
- [x] Add combined form examples to the demo.
- [x] Add validation-state examples to the demo.
- [x] Verify Tailwind safelist/content coverage for all new classes.
- [x] Verify `mvn -Dskip.tailwind=true verify`.
- [x] Verify demo GWT compile.

## Milestone 3: Demo Experience Upgrade

- [ ] Implement `Tabs`.
- [ ] Add keyboard support for `Tabs`.
- [ ] Add `Tabs` tests for enum/class mappings and state helpers.
- [ ] Use `Tabs` in the demo for component examples where useful.
- [ ] Decide whether preview/code should stay as two columns, tabs, or both depending on screen size.
- [ ] Implement `CodeBlock` for Java snippets.
- [ ] Replace raw `pre` snippets in the demo with `CodeBlock`.
- [ ] Create reusable demo example descriptors if string snippets become hard to maintain.
- [ ] Verify mobile layout for demo component examples.
- [ ] Verify `mvn -Dskip.tailwind=true verify`.
- [ ] Verify demo GWT compile.

## Milestone 4: Layout And Navigation Components

- [ ] Implement `Accordion`.
- [ ] Decide whether `Collapsible` should be implemented before or inside `Accordion`.
- [ ] Implement `Collapsible` if reusable.
- [ ] Implement `AspectRatio`.
- [ ] Implement `ButtonGroup`.
- [ ] Implement `Breadcrumb`.
- [ ] Implement `Pagination`.
- [ ] Implement `ScrollArea`.
- [ ] Implement `Toggle`.
- [ ] Implement `ToggleGroup`.
- [ ] Implement `Typography` styles/components.
- [ ] Add navigation and layout examples to the demo.
- [ ] Verify keyboard behavior for `Accordion`, `ToggleGroup`, and menu-like components.
- [ ] Verify `mvn -Dskip.tailwind=true verify`.
- [ ] Verify demo GWT compile.

## Milestone 5: Icon System Foundation

- [ ] Define `Icon` as a `UiComponent`.
- [ ] Define `IconProvider`.
- [ ] Define `IconRegistry`.
- [ ] Define `IconTheme`.
- [ ] Define `IconVariant`.
- [ ] Define `IconSize`.
- [ ] Implement SVG-first rendering with inline SVG.
- [ ] Support `size(int)`.
- [ ] Support `strokeWidth(double)`.
- [ ] Support inherited `currentColor`.
- [ ] Support `classes(String)`.
- [ ] Support `ariaLabel(String)`.
- [ ] Support `decorative()`.
- [ ] Add a small Lucide proof of concept.
- [ ] Add `Button.icon(Icon icon)` after the base icon API is stable.
- [ ] Add icon examples to the demo.
- [ ] Add accessibility examples for decorative and labelled icons.
- [ ] Verify no icon font loading is introduced.
- [ ] Verify `mvn -Dskip.tailwind=true verify`.
- [ ] Verify demo GWT compile.

## Milestone 6: Icon Modules

- [ ] Add Maven module `gwt-fusion-icons-lucide`.
- [ ] Include Lucide attribution and license files.
- [ ] Decide whether Lucide Java classes are generated or maintained manually.
- [ ] Implement `LucideIconProvider`.
- [ ] Implement `LucideIcons` static factory API.
- [ ] Add a minimal set of commonly used Lucide icons.
- [ ] Ensure icon modules contain only their own icon assets.
- [ ] Ensure icon module code has no heavy static initialization.
- [ ] Add optional module plan for `gwt-fusion-icons-tabler`.
- [ ] Add optional module plan for `gwt-fusion-icons-phosphor`.
- [ ] Add optional module plan for `gwt-fusion-icons-heroicons`.
- [ ] Document Font Awesome as optional and license-sensitive.
- [ ] Verify icon module build through Maven.
- [ ] Verify demo can use Lucide module.

## Milestone 7: Overlay Infrastructure

- [ ] Implement `IdGenerator` for ARIA relationships.
- [ ] Implement `Keyboard` utility.
- [ ] Implement `OutsideClick` utility.
- [ ] Implement `Portal` utility.
- [ ] Implement `FocusManager` utility.
- [ ] Implement `Aria` helper utility.
- [ ] Implement minimal `OverlayLayer` if needed.
- [ ] Ensure utilities avoid reflection and server-side Java APIs.
- [ ] Ensure utilities avoid unnecessary static side effects.
- [ ] Add JVM tests for pure utility behavior.
- [ ] Add demo smoke examples where useful.
- [ ] Verify `mvn -Dskip.tailwind=true verify`.
- [ ] Verify demo GWT compile.

## Milestone 8: Overlay Components

- [ ] Implement `Tooltip` with hover and focus triggers.
- [ ] Implement `Popover`.
- [ ] Implement `Dialog`.
- [ ] Add Escape handling to `Dialog`.
- [ ] Add backdrop click handling to `Dialog`.
- [ ] Add focus return to `Dialog`.
- [ ] Add ARIA attributes to `Dialog`.
- [ ] Implement `AlertDialog` using `Dialog` primitives where possible.
- [ ] Implement `DropdownMenu` with keyboard navigation.
- [ ] Implement `ContextMenu`.
- [ ] Implement `HoverCard` sharing trigger/positioning behavior where possible.
- [ ] Implement `Sheet`.
- [ ] Implement `Drawer`.
- [ ] Add overlay examples and accessibility notes to the demo.
- [ ] Verify `mvn -Dskip.tailwind=true verify`.
- [ ] Verify demo GWT compile.

## Milestone 9: Feedback Components

- [ ] Implement `Progress` with ARIA progress attributes.
- [ ] Implement `Skeleton`.
- [ ] Implement `Spinner`.
- [ ] Implement `EmptyState`.
- [ ] Implement `StatusIndicator`.
- [ ] Implement minimal `ToastManager` with lazy DOM initialization.
- [ ] Implement `Toast`.
- [ ] Decide whether `Sonner` is a toast variant, presentation style, or separate higher-level API.
- [ ] Add loading, empty, success, warning, and error examples to the demo.
- [ ] Add a demo button that triggers a toast.
- [ ] Verify dark mode behavior.
- [ ] Verify `mvn -Dskip.tailwind=true verify`.
- [ ] Verify demo GWT compile.

## Milestone 10: Data Display Components

- [ ] Implement `Table`.
- [ ] Implement `Avatar`.
- [ ] Implement `Kbd`.
- [ ] Implement `Item` as a reusable display primitive if useful.
- [ ] Implement `Timeline`.
- [ ] Implement `Calendar`.
- [ ] Implement `DatePicker` after `Calendar`, `Popover`, and form utilities are stable.
- [ ] Implement `DataTable` separately from basic `Table`.
- [ ] Add sorting support to `DataTable` only after the base table is stable.
- [ ] Add filtering support to `DataTable` only after sorting is stable.
- [ ] Add pagination examples using `Pagination`.
- [ ] Implement `Carousel` after keyboard utilities are stable.
- [ ] Evaluate `Chart` implementation strategy: SVG-first, external dependency, or deferred.
- [ ] Add realistic sample data to the demo.
- [ ] Verify `mvn -Dskip.tailwind=true verify`.
- [ ] Verify demo GWT compile.

## Milestone 11: Advanced UX Components

- [ ] Decide whether `CommandPalette` is needed for the first public release or should remain optional advanced UX.
- [ ] Document the distinction between GWT `Command` callbacks and the shadcn-inspired command-palette UI pattern.
- [ ] Avoid a public UI component named only `Command` to prevent confusion with `com.google.gwt.user.client.Command`.
- [ ] Implement `CommandMenu` as the reusable filterable list primitive if command-palette UX is needed.
- [ ] Implement `CommandPalette` using `CommandMenu` and overlay utilities.
- [ ] Define `CommandItem` and `CommandAction` naming if callbacks need a dedicated API.
- [ ] Implement `Combobox`.
- [ ] Implement `MultiSelect`.
- [ ] Implement `Autocomplete`.
- [ ] Implement `Resizable`.
- [ ] Reuse overlay, keyboard, and focus utilities consistently.
- [ ] Add examples with filtering and empty results.
- [ ] Add keyboard-first workflow examples to the demo.
- [ ] Document how Java values map to rendered options.
- [ ] Verify `mvn -Dskip.tailwind=true verify`.
- [ ] Verify demo GWT compile.

## Milestone 12: Direction, RTL, And Theming Depth

- [ ] Decide how `Direction` and RTL support should be represented in Java.
- [ ] Decide whether direction belongs in `ThemeManager`, a new `DirectionManager`, or document-level utilities.
- [ ] Add `dir` support for components that need directional behavior.
- [ ] Audit components for left/right Tailwind classes that may need logical alternatives.
- [ ] Add RTL examples to the demo.
- [ ] Expand theme token coverage if needed.
- [ ] Add theme-aware icon examples once icons exist.
- [ ] Verify light and dark mode for all implemented components.
- [ ] Verify `mvn -Dskip.tailwind=true verify`.
- [ ] Verify demo GWT compile.

## Milestone 13: Build, Tests, And Release Readiness

- [ ] Decide how strict J2CL compatibility checks should become in Maven.
- [ ] Add or document a J2CL compatibility profile.
- [ ] Decide browser-test strategy: GWT tests, Playwright, or later J2CL-compatible setup.
- [ ] Add browser/demo smoke tests if feasible.
- [ ] Review Tailwind safelist strategy.
- [ ] Decide whether Tailwind safelist entries should be generated from component enums.
- [ ] Ensure every component has demo examples.
- [ ] Ensure every component has at least enum/class mapping or pure Java state tests.
- [ ] Ensure license and attribution files exist for bundled assets.
- [ ] Review generated artifacts and `.gitignore` rules.
- [ ] Verify `mvn -Dskip.tailwind=true verify`.
- [ ] Verify `mvn -pl gwt-fusion-ui generate-resources`.
- [ ] Verify `mvn -Pdemo -pl gwt-fusion-ui-demo -am -Dskip.tailwind=true package`.
- [ ] Verify GitHub Pages deployment workflow.

## Milestone Definition Of Done

- [ ] All planned source changes are implemented.
- [ ] Demo is updated with preview and Java code examples.
- [ ] Tailwind classes are static or safelisted.
- [ ] Accessibility attributes are included where required.
- [ ] Tests are added or intentionally documented as not applicable.
- [ ] `mvn -Dskip.tailwind=true verify` succeeds.
- [ ] Demo GWT compile succeeds if demo code changed.
- [ ] Documentation is updated.
- [ ] No proprietary or paid assets are bundled.
