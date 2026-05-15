# AGENTS.md

## Projektziel

Dieses Repository enthaelt `gwt-fusion-ui`, eine UI-Komponentenbibliothek fuer GWT 2.13 und J2CL-kompatible Anwendungen. Die Komponenten sind von shadcn inspiriert, nutzen Tailwind CSS als Styling-Grundlage und bieten eine Java-typische API mit Enums, ThemeManager und fluenten Komponentenmethoden.

## Module

- `gwt-fusion-ui`: Wiederverwendbare Komponentenbibliothek unter dem Package `org.gwtfusion.ui`.
- `gwt-fusion-ui-demo`: GWT-Demo-Webseite mit visuellen Komponentenbeispielen und Code-Snippets.

## Architekturregeln

- Komponenten bleiben DOM-basiert und verwenden `elemental2.dom`.
- Keine neuen Komponenten auf klassische GWT Widgets wie `com.google.gwt.user.client.ui.Widget` aufbauen.
- Keine GWT-RPC-Abhaengigkeiten einfuehren.
- `GWT.create()` nicht als Kernmechanismus verwenden.
- Browserfaehigen Code J2CL-freundlich halten: keine Reflection-Annahmen, keine serverseitigen Java APIs, keine unnoetigen statischen Seiteneffekte.
- Jede Komponente implementiert indirekt oder direkt `UiComponent` und exponiert ihr Root-Element ueber `element()`.
- Komponenten sollen lokale Zustandswechsel sauber abbilden. Wenn eine Variante oder Groesse gewechselt wird, muessen alte Klassen entfernt werden.
- Code-Splitting wird auf Anwendungsebene beruecksichtigt. Die Demo nutzt `GWT.runAsync`, Komponenten selbst sollen keine globalen Registrierungen erzwingen.

## Stylingregeln

- Tailwind ist die Styling-Quelle. Java-Code darf Tailwind-Klassen nutzen, aber dynamische Klassennamen wie `"bg-" + color` vermeiden.
- Varianten und Groessen werden bevorzugt ueber Enums modelliert.
- Theme-Farben laufen ueber CSS-Variablen nach shadcn-Muster.
- Dark Mode wird ueber die Root-Klasse `.dark` gesteuert.
- `ThemeManager` ist die zentrale Java-API fuer Theme-Wechsel.
- Tailwind muss Klassen aus Java-Quellen erkennen koennen. Neue Komponentenklassen entweder statisch in Java-Strings halten oder in `tailwind.config.js` safelisten.

## Maven und Build

- Alles wird ueber Maven gebaut.
- Standardverifikation ohne Node-Download: `mvn -Dskip.tailwind=true verify`.
- Voller CSS-Build: `mvn -pl gwt-fusion-ui generate-resources`.
- Demo-GWT-Compile ist ueber das Profil `demo` im Demo-`package` vorbereitet: `mvn -Pdemo -pl gwt-fusion-ui-demo -am -Dskip.tailwind=true package`.
- GitHub Pages Deployment ist ueber `.github/workflows/deploy-demo.yml` vorbereitet und baut die Demo-Webseite.

## Tests

- JVM-Tests fuer reine Java-Logik bevorzugen: Varianten, CSS-Klassen, Theme-Zustand, API-Kontrakte.
- DOM-Erzeugung ueber `DomGlobal.document` nicht direkt in normalen JVM-Tests ausfuehren.
- Browser-/GWT-Tests spaeter separat ergaenzen.
- Neue Komponenten brauchen mindestens Tests fuer Enum-Klassen und Klassenmapping.

## Komponentenleitlinien

- Minimalen shadcn-nahen HTML-Aufbau verwenden.
- Accessibility-Attribute direkt in der Komponente setzen, wenn sie zum semantischen Vertrag gehoeren.
- API-Beispiele in der Demo aktuell halten.
- Tailwind-Klassen nicht uebermaessig abstrahieren. Kleine Enums sind besser als komplexe Builder.

## Aktueller Stand

- Erste Komponenten: `Button`, `Badge`, `Card`, `Alert`, `Input`, `Label`, `Separator`, `Checkbox`, `Switch`, `Textarea`, `RadioGroup`, `FormField`, `NativeSelect`, `InputGroup`, `Slider`, `Tabs`, `CodeBlock`.
- Basisklassen: `UiComponent`, `BaseComponent`, `CssClasses`, `ThemeManager`.
- Demo: Startseite, Komponentenansicht mit Preview/Java-Code, Form-Foundation-Beispiele, Tabs-Beispiel, Themeansicht.
- Tailwind 3 ist eingerichtet und wird ueber `frontend-maven-plugin` ausgefuehrt.
- Aktueller Arbeitsstand: Milestone 3 Demo Experience Upgrade ist auf Branch `milestone-3-demo-experience` in Arbeit.
