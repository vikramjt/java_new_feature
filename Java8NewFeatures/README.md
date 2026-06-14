# Java 8 New Features Learning Module

This module demonstrates major Java 8 changes with small runnable examples and tests.

## Why Java 8 mattered

Java 8 was a foundational release that made Java more expressive for data processing, concurrency, and API design. It introduced functional-style programming constructs while keeping full backward compatibility with object-oriented code.

## Covered features (what they do)

- Lambdas and functional interfaces:
  Replace verbose anonymous classes with concise function expressions, especially for callbacks, filtering, mapping, and event handling.
- Method references:
  Reuse existing methods (`Class::method`, `obj::method`) where a lambda would only call one method, improving readability.
- Streams API:
  Build lazy pipelines (`filter`, `map`, `sorted`, `reduce`, `collect`) over collections for clearer transformation logic and optional parallel execution.
- Default and static methods in interfaces:
  Allow interface evolution without breaking all existing implementations; useful for framework/library maintainers.
- `Optional`:
  Encourage explicit "value may be absent" modeling and avoid many null-check branches.
- Date/Time API (`java.time`):
  Provide immutable, thread-safe date/time types (`LocalDate`, `Instant`, `ZonedDateTime`) and eliminate many issues in `Date`/`Calendar` usage.
- `CompletableFuture`:
  Support asynchronous composition (`thenApply`, `thenCompose`, `allOf`) instead of manual thread orchestration.
- Base64 API:
  Add standard `Base64` encoder/decoder in JDK so projects do not need custom utilities for common binary/text conversion.

## Removed, replaced, or no longer recommended

- PermGen removed (JVM runtime change):
  Permanent Generation memory was removed and replaced by Metaspace, reducing `OutOfMemoryError: PermGen space` tuning pain.
- Legacy date/time APIs superseded:
  `java.util.Date` and `java.util.Calendar` were not removed, but `java.time` became the recommended approach.
- Anonymous-class-heavy style often replaced:
  Not removed, but lambda expressions and method references are preferred for functional behavior.

## Run

```bash
mvn -pl Java8NewFeatures test
mvn -pl Java8NewFeatures -DskipTests exec:java -Dexec.mainClass=com.vikram.study.java8.Java8FeaturesDemo
```

