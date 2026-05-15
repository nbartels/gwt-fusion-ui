# GWT Fusion

GWT Fusion ist ein Maven-Multi-Modul-Projekt fuer eine GWT 2.13 und J2CL-kompatible UI-Komponentenbibliothek.

## Module

- `gwt-fusion-ui`: Komponentenbibliothek unter `org.gwtfusion.ui`.
- `gwt-fusion-ui-demo`: Beispiel-Webseite mit visuellen Komponenten und Java-Codebeispielen.

## Build

Schneller JVM-Build ohne Tailwind/Node-Download:

```bash
mvn -Dskip.tailwind=true verify
```

CSS-Build fuer die UI-Library:

```bash
mvn -pl gwt-fusion-ui generate-resources
```

Demo-GWT-Compile ist vorbereitet:

```bash
mvn -Pdemo -pl gwt-fusion-ui-demo -am -Dskip.tailwind=true package
```

## Beispiel

```java
Button button = Button.create("Speichern")
    .variant(ButtonVariant.DEFAULT)
    .size(ButtonSize.MD);
```

Dark Mode:

```java
ThemeManager.setMode(ThemeMode.DARK);
```

## Aktuelle Komponenten

- `Button`
- `Badge`
- `Card`
- `Alert`
- `Input`
- `Label`
- `Separator`
- `Checkbox`
- `Switch`
- `Textarea`
- `RadioGroup`

## Designprinzipien

- DOM-basiert mit `elemental2.dom`.
- Tailwind CSS fuer Styling.
- shadcn-inspirierte Theme Tokens.
- Java-typische API mit Enums und fluenten Methoden.
- Keine harte Kopplung an klassische GWT Widgets.
- Code-Splitting auf Anwendungsebene, in der Demo ueber `GWT.runAsync` sichtbar gemacht.

Weitere Entwicklungsregeln stehen in `AGENTS.md`.
