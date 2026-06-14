# Java LTS Learning Modules (8, 11, 17, 21)

This repository now includes dedicated learning submodules for each major Java LTS release:

- `Java8NewFeatures`
- `Java11NewFeatures`
- `Java17NewFeatures`
- `Java21NewFeatures`

Each submodule includes runnable source code and tests showing practical feature usage.

## Why these features were introduced

### Java 8

Java 8 introduced functional programming capabilities and a modern date/time API to improve readability, safety, and performance in collection and concurrency code.

Features covered in `Java8NewFeatures`:
- Lambda expressions and functional interfaces:
  write behavior as data and reduce anonymous-class boilerplate.
- Method references:
  shorten lambdas that only delegate to an existing method.
- Stream API:
  express data transformation pipelines with `map`, `filter`, `reduce`, and collectors.
- Default/static interface methods:
  evolve interfaces while preserving backward compatibility.
- `Optional`:
  model missing values explicitly and reduce null-related errors.
- Date/Time API (`java.time`):
  immutable and thread-safe date/time model.
- `CompletableFuture`:
  compose asynchronous workflows in a fluent style.
- Base64 API:
  built-in encoder/decoder utilities.

Removed/replaced/superseded direction in Java 8:
- PermGen removed and replaced by Metaspace.
- Legacy date/time APIs (`Date`/`Calendar`) are largely superseded by `java.time` for new code.

### Java 11 (LTS)

Java 11 focused on developer productivity and standardization of APIs that were commonly needed in real applications.

Features covered in `Java11NewFeatures`:
- New String methods (`isBlank`, `strip`, `lines`, `repeat`):
  concise and Unicode-aware text handling.
- Standard HTTP Client (`java.net.http`):
  modern synchronous/asynchronous HTTP communication API.
- File utility methods (`Files.readString`, `Files.writeString`):
  simplified file read/write operations.
- `Optional.isEmpty()`:
  clearer optional absence checks.
- `Predicate.not(...)`:
  cleaner negative conditions in streams.
- `var` in lambda parameters:
  local type inference support in lambda declarations.

Removed/replaced/superseded direction in Java 11:
- Java EE / CORBA modules removed from the JDK distribution.
- Applet/Web Start/browser deployment stack removed.
- JavaFX removed from JDK bundle (continues as OpenJFX external dependency).
- `HttpURLConnection` style is often superseded by `java.net.http.HttpClient`.

### Java 17 (LTS)

Java 17 improved language modeling and maintainability while continuing modernization of core libraries.

Features covered in `Java17NewFeatures`:
- Records:
  compact immutable data carriers.
- Sealed classes and interfaces:
  controlled inheritance boundaries.
- Pattern matching for `instanceof`:
  fewer explicit casts and clearer type branches.
- `HexFormat`:
  standard hex parsing/formatting helper.
- `RandomGenerator` API:
  improved algorithm choice and consistency for random generation.

Removed/replaced/superseded direction in Java 17:
- RMI Activation removed.
- Security Manager deprecated for removal (avoid for new designs).
- Applet API deprecated for removal (obsolete runtime model).

### Java 21 (LTS)

Java 21 focused heavily on scalability and expressive language patterns.

Features covered in `Java21NewFeatures`:
- Virtual threads:
  lightweight threads for high-concurrency I/O-heavy applications.
- Sequenced Collections API:
  standard first/last/reversed access patterns across ordered collections and maps.
- Pattern matching for `switch` and record patterns:
  concise type-safe branching and decomposition.

Removed/replaced/superseded direction in Java 21:
- No single major end-user API removal comparable to Java 11 was introduced as a headline change.
- Virtual-thread-per-task style often supersedes complex thread-pool orchestration in suitable workloads.
- Finalization remains deprecated for removal and should be avoided in new code.

## Quick comparison table (LTS learning view)

| Feature / Area | Introduced in | Replaced or improved over | Status by Java 21 |
|---|---|---|---|
| Lambda expressions + method references | Java 8 | Verbose anonymous classes for simple functional behavior | Core and widely used |
| Stream API | Java 8 | Imperative collection loops for transformations | Core and widely used |
| `java.time` Date/Time API | Java 8 | `Date` / `Calendar` pain points (mutable, error-prone APIs) | Preferred date/time API |
| `CompletableFuture` | Java 8 | Manual thread/callback chaining | Core async API |
| Standard HTTP Client (`java.net.http`) | Java 11 | Many `HttpURLConnection`-style use cases | Preferred built-in HTTP API |
| Java EE / CORBA in JDK | Removed in Java 11 | Previously bundled modules (JAXB, JAX-WS, CORBA, etc.) | Use external dependencies |
| Records | Java 16 (used in Java 17 LTS) | Boilerplate data carrier classes | Core and widely used |
| Sealed classes/interfaces | Java 17 | Uncontrolled inheritance in domain models | Core language feature |
| Pattern matching (`instanceof`, `switch`) | Java 16+/21 | Verbose `instanceof` + cast chains and switch branching | Core modern style |
| Virtual threads | Java 21 | Heavy reliance on large platform-thread pools for many I/O tasks | Recommended for suitable concurrent workloads |
| Sequenced Collections API | Java 21 | Inconsistent first/last/reversed access patterns | Core collections enhancement |
| Security Manager | Deprecated for removal (Java 17) | Legacy in-process sandbox model | Avoid for new design |
| Finalization | Deprecated for removal (ongoing) | GC-triggered resource cleanup patterns | Avoid in new code |

## Quick run commands

Run tests for modules that match your installed JDK level:

```bash
mvn -pl Java8NewFeatures test
mvn -pl Java11NewFeatures test
mvn -pl Java17NewFeatures test
mvn -pl Java21NewFeatures test
```

Run demo classes:

```bash
mvn -pl Java8NewFeatures -DskipTests exec:java -Dexec.mainClass=com.vikram.study.java8.Java8FeaturesDemo
mvn -pl Java11NewFeatures -DskipTests exec:java -Dexec.mainClass=com.vikram.study.java11.Java11FeaturesDemo
mvn -pl Java17NewFeatures -DskipTests exec:java -Dexec.mainClass=com.vikram.study.java17.Java17FeaturesDemo
mvn -pl Java21NewFeatures -DskipTests exec:java -Dexec.mainClass=com.vikram.study.java21.Java21FeaturesDemo
```

## JDK compatibility note

- `Java8NewFeatures` compiles with source/target 1.8.
- `Java11NewFeatures` compiles with source/target 11.
- `Java17NewFeatures` compiles with source/target 17.
- `Java21NewFeatures` compiles with source/target 21 and needs JDK 21+ for build/test.

