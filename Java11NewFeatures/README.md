# Java 11 New Features Learning Module

This module focuses on Java 11 LTS improvements that made everyday coding simpler and modernized core platform APIs.

## Why Java 11 mattered

Java 11 is the first long-term-support release after Java 8 and helped teams move to a modern JDK baseline. It standardized APIs that previously required third-party libraries or older, less ergonomic JDK APIs.

## Covered features (what they do)

- String API additions (`isBlank`, `strip`, `lines`, `repeat`):
  Make common text cleanup and line processing operations concise and Unicode-aware.
- Standard HTTP Client (`java.net.http`):
  Replaces the old low-level `HttpURLConnection` style with a fluent API and built-in async support.
- `Files.readString` / `Files.writeString`:
  Reduce boilerplate around buffered readers/writers for simple file-content scenarios.
- `Optional.isEmpty()`:
  Improve readability of absence checks versus negating `isPresent()`.
- `Predicate.not(...)`:
  Improve stream filtering readability when the condition is a negation.
- `var` in lambda parameters:
  Allow local type inference in lambdas and consistent annotation placement when needed.

## Removed, replaced, or no longer included

- Java EE and CORBA modules removed from JDK:
  Modules like JAXB/JAX-WS/CORBA were removed from the standard JDK bundle and must be added explicitly as external dependencies if needed.
- Java deployment stack removed:
  Applet plugin, Java Web Start, and related browser deployment pieces were removed as they were obsolete and insecure for modern application delivery.
- JavaFX removed from JDK bundle:
  JavaFX continues as OpenJFX but is no longer shipped inside the JDK itself.
- Older HTTP access style often superseded:
  `HttpURLConnection` is still available, but `java.net.http.HttpClient` is the preferred modern API.

## Run

```bash
mvn -pl Java11NewFeatures test
mvn -pl Java11NewFeatures -DskipTests exec:java -Dexec.mainClass=com.vikram.study.java11.Java11FeaturesDemo
```

