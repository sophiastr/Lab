[![Build Status](https://app.travis-ci.com/sophiastr/Lab.svg?token=VoWJYrty4EcKbAksGywU&branch=development)](https://app.travis-ci.com/sophiastr/Lab)
# Lab
A repository for the needs of the Software Eningineering in Practice (SEiP) course offered by the Department of Management Science & Technology of the Athens University of Economics and Business.

# Project Structure
This repository consists of a parent Maven project and one sub-project (modules), Histogram Generator.

# Histogram Generator
This module requires one runtime dependency which is packaged in the main jar (fat-jar).

The produced jar is located in the target directory and can be executed as following:

java -jar gradeshistogram/target/gradeshistogram-0.0.1-SNAPSHOT-jar-with-dependencies.jar grades.txt

Note that the gradeshistogram-0.0.1-SNAPSHOT.jar is not executable.

# Arithmetic Operations

This is a Java project serving as a brief demonstration for Unit Testing for the needs of the lab tutorials of the [Software Engineering in Practice](https://www2.dmst.aueb.gr/dds/sweng-en/) course. It makes use of Maven to automate the build process of the two available modules. 

[README Arithmetic Operations](arithmeticoperations/README.md)

## Contributing
You are more than welcome to contribute in this project. Just have in mind that the repository aims at providing an overview of unit testing functionality and Continuous Integration plug-ins related to testing. 
- If you have any suggestions please open an issue. 
- If you want to actively contribute, please fork this repository and create a pull request after completing your addition/modification.

## License 
[![License: MIT](https://img.shields.io/badge/License-MIT-yellow.svg)](https://opensource.org/licenses/MIT)
