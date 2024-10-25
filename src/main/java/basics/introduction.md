## Introduction

1. Java programming language created in 1995.
1. Owned by Oracle, and more than 3 billion devices run Java.

## Why Use Java?

1. Java works on different platforms (Windows, Mac, Linux, Raspberry Pi, etc.)
1. Java is an object oriented language which gives a clear structure to programs and allows code to be reused, lowering development costs

## Historical details on Java Version 

> LTS means Long Term Support.

| Version | Year | Major Features |
|---------|------|----------------|
| Java 1.0 | 1996 | First public release, JVM, Basic language features, AWT |
| Java 1.1 | 1997 | Inner classes, JavaBeans, JDBC, RMI, JIT compiler |
| Java 1.2 | 1998 | Collections framework, Swing GUI, JIT improvements, strictfp keyword |
| Java 1.3 | 2000 | HotSpot JVM, JNDI, Java Sound API, JPDA |
| Java 1.4 | 2002 | Assert, Regular expressions, Exception chaining, IPv6, XML processing |
| Java 5 | 2004 | Generics, Annotations, Enums, Varargs, Enhanced for loop, Static imports |
| Java 6 | 2006 | Performance optimizations, Scripting support, JDBC 4.0, JAX-WS 2.0 |
| Java 7 | 2011 | Try-with-resources, Diamond operator, Switch with strings, Fork/Join framework |
| Java 8 (LTS) | 2014 | Lambda expressions, Stream API, Optional class, Date/Time API, Default methods |
| Java 9 | 2017 | Module system, JShell, Collection factory methods, Private interface methods |
| Java 10 | 2018 | Local variable type inference (var), Parallel full GC, Container awareness |
| Java 11 (LTS) | 2018 | HTTP client API, Launch single-file source code, TLS 1.3 |
| Java 12 | 2019 | Switch expressions (preview), Garbage collector improvements |
| Java 13 | 2019 | Text blocks (preview), Dynamic CDS archives |
| Java 14 | 2020 | Switch expressions (standard), Pattern matching for instanceof (preview) |
| Java 15 | 2020 | Text blocks, Sealed classes (preview), Hidden classes |
| Java 16 | 2021 | Records, Pattern matching for instanceof, Vector API |
| Java 17 (LTS) | 2021 | Sealed classes, Pattern matching for switch (preview), Random number generators |
| Java 18 | 2022 | UTF-8 by default, Simple web server, Code snippets in Java API documentation |
| Java 19 | 2022 | Virtual threads (preview), Pattern matching for switch (preview), Vector API |
| Java 20 | 2023 | Scoped values (preview), Record patterns (preview), Virtual threads (preview) |
| Java 21 (LTS) | 2023 | Virtual threads, Pattern matching for switch, Record patterns, Sequenced collections |

## Top 20 Java Terms in October 2024

| No. | Term | Short Description | Detailed Example/Usage |
|-----|------|------------------|----------------------|
| 1 | JDK | Software development environment | Contains development tools, compiler (javac), debugger, documentation |
| 2 | JRE | Runtime environment for Java | Required to run Java apps, contains core libraries and JVM |
| 3 | JVM | Virtual machine executing bytecode | Provides "Write Once, Run Anywhere" capability |
| 4 | JAVAC | Java compiler command | Converts .java files to .class files containing bytecode |
| 5 | OOP | Programming paradigm based on objects | Classes, objects, inheritance, encapsulation, polymorphism |
| 6 | Collections | Data structure framework | List (ArrayList), Set (HashSet), Map (HashMap) implementations |
| 7 | Multithreading | Concurrent execution of threads | Thread creation, synchronization, thread pools |
| 8 | Exception | Error handling mechanism | Checked vs Unchecked exceptions, try-catch-finally blocks |
| 9 | JDBC | Database connectivity API | Database operations using SQL with Java |
| 10 | Garbage Collection | Automatic memory cleanup | Removes unused objects, managed by JVM |
| 11 | Servlet | Server-side web components | Handles HTTP requests/responses in web applications |
| 12 | Spring | Enterprise application framework | Dependency injection, MVC, security, data access |
| 13 | Maven | Project management tool | Build automation, dependency management, project structure |
| 14 | Interface | Contract for classes | Defines abstract methods that classes must implement |
| 15 | Abstract Class | Partial implementation class | Common code for related classes, can't be instantiated |
| 16 | Stream API | Data processing pipeline | Functional operations on collections (filter, map, reduce) |
| 17 | Lambda | Anonymous function expressions | Enables functional programming style: (params) -> expression |
| 18 | Design Patterns | Standard problem solutions | Singleton for single instance, Factory for object creation |
| 19 | Serialization | Object persistence mechanism | Converting objects to byte streams for storage/transfer |
| 20 | Unit Testing | Code testing methodology | Testing individual components using JUnit, TestNG |

## Things you should know
1. Mostly Return type will come before the name.

```
void main(String[] args) {
return main(return type paramName) {}
```

1. you can check your java compiler version by `javac -version`
1. you can check your java version by `java -version`
1. First compile your java code by `javac -verbose basics/Basics.java`, After compilation, this will generate java.class file along with package and basic statements.
1. Class name should always start with an **uppercase first letter**. Run your java class after compiled by `java basics.Basics`
1. The name of the java file must match the class name.
1. Any code inside the main() method will be executed.
1. You should also note that each code statement must end with a semicolon (;).
1. Text must be wrapped inside double quotations marks "". `System.out.println("Java Basics ");`
1. You can use the `+` character for concatenation to add a variable to another variable:
1. Variable Names can also begin with "$" and "_".

## Other Top Java Terms in October 2024

| No. | Term | Short Description | Modern Java Focus (2024) |
|-----|------|------------------|---------------------|
| 1 | Virtual Threads | Lightweight threads in Java 21 | Project Loom, millions of concurrent threads |
| 2 | Records | Immutable data classes | Compact constructor, automatic getter/hashCode |
| 3 | Pattern Matching | Enhanced switch and instanceof | Switch expressions, type patterns |
| 4 | Sealed Classes | Restricted class hierarchies | Permits clause, definite inheritance |
| 5 | Text Blocks | Multi-line string literals | Triple quotes, better string formatting |
| 6 | Modules | Java Platform Module System | Module-info.java, encapsulation |
| 7 | var Type | Local variable type inference | Improved readability, type inference |
| 8 | Stream API | Functional data processing | Parallel streams, collectors, optional |
| 9 | CompletableFuture | Async programming model | Combining async operations, error handling |
| 10 | JShell | Java REPL tool | Interactive code testing, rapid prototyping |
| 11 | String API Updates | Enhanced string operations | Strip(), isBlank(), repeat() methods |
| 12 | Collection Factory | Simplified collection creation | List.of(), Set.of(), Map.of() |
| 13 | Optional API | Null handling mechanism | orElse(), ifPresent(), map() operations |
| 14 | HttpClient | Modern HTTP networking | Async HTTP requests, WebSocket support |
| 15 | Time API | Modern date/time handling | LocalDate, Instant, Duration classes |
| 16 | Interface Changes | Interface enhancements | Private methods, static methods, default methods |
| 17 | GC Improvements | Modern garbage collectors | ZGC, Shenandoah, G1GC |
| 18 | Preview Features | Upcoming Java features | Structured concurrency, string templates |
| 19 | Vector API | CPU architecture optimization | SIMD operations, parallel computations |
| 20 | Foreign Function API | Native code integration | Replacing JNI, memory access |