# Architektur

`gwt-fusion-ui` ist als DOM-basierte Komponentenbibliothek angelegt. Jede Komponente exponiert ein `HTMLElement` ueber `UiComponent.element()`. Dadurch bleibt die Bibliothek naeher an J2CL und vermeidet klassische GWT-Widget-Abhaengigkeiten.

## Pakete

- `org.gwtfusion.ui`: Basis-API.
- `org.gwtfusion.ui.component`: Komponenten.
- `org.gwtfusion.ui.css`: Tailwind/CSS-Hilfen.
- `org.gwtfusion.ui.theme`: Theme-Modell und `ThemeManager`.

## Styling

Tailwind-Klassen werden statisch in Java-Enums und Komponentenklassen gehalten. Theme-Farben nutzen CSS-Variablen wie `--primary`, `--background` und `--foreground`.

## Code-Splitting

Die Bibliothek selbst erzwingt kein Splitting. Anwendungen koennen Komponentenbereiche lazy laden. Die Demo nutzt `GWT.runAsync`, um diesen Ansatz im Repository sichtbar zu machen.
