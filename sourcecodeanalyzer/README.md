[![Build Status](https://app.travis-ci.com/sophiastr/Lab.svg?token=VoWJYrty4EcKbAksGywU&branch=development)](https://app.travis-ci.com/sophiastr/Lab)
# Lab
A repository for the needs of the Software Eningineering in Practice (SEiP) course offered by the Department of Management Science & Technology of the Athens University of Economics and Business.

# Design Patterns assignment's code base

Τhis repository is used to practice the implementation of design patterns, in the context of the 4th Lab Assignment of the Applied Software Engineering course.

The code refers to a software system that reads a Java source code file that is stored locally or on the web, calculates the Lines of Code (LOC), Number of Classes (NOC) and Number of Methods (NOM) metrics, and finally, exports these metrics to an output file.

The purpose of the assignment is to modify the code and implement some design patterns, in order to improve the design quality of the system.

[README Design Patterns assignment's code base](sourcecodeanalyzer/readme)

# Build the executable Java application with: 

	"mvn package jacoco:report"

# Run the executable by executing

	"java –jar “jar-with-dependencies” arg0 arg1 arg2 arg3 arg4"
	
were args translate to: 	
1. arg0 = “JavaSourceCodeInputFile” (e.g., src/test/resources/TestClass.java)
2. arg1 = “sourceCodeAnalyzerType” [regex|strcomp]
3. arg2 = “SourceCodeLocationType” [local|web]
4. arg3 = “OutputFilePath” (e.g., ../output_metrics_file)
5. arg4 = “OutputFileType” [csv|json]

example: 

	java –jar ./target/sourcecodeanalyzer-0.0.1-SNAPSHOT-jar-with-dependencies.jar ./src/test/resources/TestClass.java regex local metrics_results csv

# Modifications

In general, the patterns used in the project are the following:
1. Facade Pattern
2. Strategy Pattern
3. Factory Pattern
4. Bridge
5. Null Object

In more detail:

**1. Facade Pattern**

AnalyzerFacade class implements all the functionality, previously called individually by the client.
That class behaves as an entry point for the rest of the system. It provides a single interface (entry-point) through which any Client can make use of the system's functionality without knowing the implementation details of it.
Since all of the operations code has been moved in the AnalysisFacade class, the DemoClient class now only creates the facade object and calls the analyzeCode method, passing the main arguments as inputs.

**Pros** :

The complexity of the system is hidden from the client class and it's more simple.
Different methods can easily be added.

**Cons**:

Facade is difficult to test with ordinary unit-tests

**2. Strategy Pattern**

For each dimension (Analyzers, Writers, Readers) a Strategy pattern was applied. In each case we introduced an interface (or an abstraction in the case of Analyzer) that describes the functionalities that the concrete classes should implement. For example, it was created Local class where it reads a file stored locally and execute some calculation. Another example is RegexAnalyzer class where it manages only regex.

**Pros:**
Each dimension can be extended independently without affecting other parts of the system.
Reduced code complexity and code duplication.

**Cons:** 
Introduce more classes(1 -> 2)

**3. Factory Pattern**
The Factory pattern is selected to improve the design of the system by hiding the instantiation logic. As a result, a Factory Pattern was applied for each dimension(Analyzers, Writers, Readers). In more detail, AnalyzerFactory, ReaderFactory, WriterFactory was created in order to create and initialize the concrete objects of each dimension.

**Pros:**
Hide the creation details of concrete objects.
REach dimension can be extended.


**4. Bridge**
Each Analyzer contains a ContentReader and delegates to that the functionality of reading the contents from a file.

**Pros:**
ContentReaders can be extended.

**5. Null Object**
In each Strategy pattern we introduced a Null Object that defines what will happen when a concrete class not specified and implemented is requested to perform a functionality. In all cases, the Null Object implementations throw "user friendly" Exceptions and not NullPointerExceptions that require tracing.
Examples: NullAnlyzer, NullReader, NullWriter

**Pros:**
A Client is no longer responsible for checking for null reference.
Errors occurs when something goes wrong

**Cons**
If it not handled well, can cause problems.

## License 
[![License: MIT](https://img.shields.io/badge/License-MIT-yellow.svg)](https://opensource.org/licenses/MIT)
