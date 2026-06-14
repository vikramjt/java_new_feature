# Java 21 New Features Learning Module

This module demonstrates Java 21 LTS features focused on scalable concurrency and richer pattern-based programming.

## Why Java 21 mattered

Java 21 is an LTS release that delivers Project Loom virtual threads and stronger language patterns. The result is simpler high-concurrency code with fewer framework-specific abstractions.

## Covered features (what they do)

- Virtual threads:
  Allow creating very large numbers of lightweight threads, so applications can keep simple thread-per-task style without the heavy cost of platform threads.
- Sequenced Collections API (`SequencedCollection`, `SequencedMap`):
  Add standardized `first`, `last`, and `reversed` views across ordered collections and maps, removing inconsistent API patterns.
- Pattern matching for `switch` and record patterns:
  Enable concise type-based branching and direct decomposition of record components in switch cases.

## Removed, replaced, or no longer recommended

- No major end-user JDK API removals were finalized as a headline item in Java 21 comparable to Java 11 removals.
- Legacy heavy-thread pooling strategies are often superseded in many I/O workloads by virtual-thread-per-task designs.
- Finalization remains deprecated for removal (not removed in Java 21); new code should prefer `AutoCloseable`, cleaners, and structured resource management.

## Run

```bash
mvn -pl Java21NewFeatures test
mvn -pl Java21NewFeatures -DskipTests exec:java -Dexec.mainClass=com.vikram.study.java21.Java21FeaturesDemo
```

> Note: this module requires JDK 21+.

