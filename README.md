# octiq-java-maven-unsupported-8

> Synthetic fixture for testing Octiq's GitHub import of Java projects. Not a real application.

## Scenario

A minimal Maven project that targets Java 8 via `maven.compiler.release=8`. Java 8 is outside the supported image set (11, 17, 21), so the import must be rejected up front. It proves an unsupported project fails fast with an explanation instead of a confusing build error.

## What this exercises

- The supported-Java-version allowlist
- Version detection from `maven.compiler.release`
- Rejection before any container starts (nothing is built)
- The `JAVA_VERSION_UNSUPPORTED` message naming Java 8 and listing 11, 17 and 21

## Expected result on import

| Field | Expected |
| --- | --- |
| stack | `java` |
| build tool | `maven` |
| Java version | `8` (rejected) |
| image | n/a — rejected before any container starts |
| framework | `java` |
| project root | `.` |
| final phase | `failed` |
| build green | n/a |
| failure code | `JAVA_VERSION_UNSUPPORTED` |

The source is deliberately Java 8 style (no `var`, no records). Do not bump the release to "fix" it; the rejection is the point.

## Layout

```
.
├── .gitignore
├── pom.xml
└── src/main/java/com/octiq/fixture/Greeter.java
```
