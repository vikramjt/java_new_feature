# Java 17 New Features Learning Module

This module demonstrates major Java 17 LTS capabilities for modeling domain data and writing safer, more maintainable branching logic.

## Why Java 17 mattered

Java 17 stabilized several language evolutions that started as previews in earlier releases. It gives developers better ways to represent immutable data and constrain inheritance, while reducing boilerplate casts and type checks.

## Covered features (what they do)

- Records:
  Define immutable data carriers with compact syntax; compiler generates constructor, accessors, `equals`, `hashCode`, and `toString`.
- Sealed classes/interfaces:
  Restrict which classes can extend or implement a type, giving stronger control over domain hierarchies.
- Pattern matching for `instanceof`:
  Combine type test plus cast in one expression, reducing casting mistakes and improving readability.
- `HexFormat`:
  Standard utility for formatting/parsing hexadecimal data with delimiters and case control.
- `RandomGenerator` API:
  Unifies modern random generators behind a common interface and makes algorithm selection explicit.

## Removed, replaced, or no longer recommended

- RMI Activation removed (JEP 407):
  The old activation mechanism in RMI was removed due to low usage and maintenance burden.
- Security Manager deprecated for removal (JEP 411):
  Not removed in Java 17, but marked for future removal; new systems should avoid relying on it.
- Applet API deprecated for removal (JEP 398):
  Applets are effectively obsolete in modern Java usage and browser ecosystems.

## Run

```bash
mvn -pl Java17NewFeatures test
mvn -pl Java17NewFeatures -DskipTests exec:java -Dexec.mainClass=com.vikram.study.java17.Java17FeaturesDemo
```

