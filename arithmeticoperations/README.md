[![Build Status](https://app.travis-ci.com/sophiastr/Lab.svg?token=VoWJYrty4EcKbAksGywU&branch=development)](https://app.travis-ci.com/sophiastr/Lab)



# Arithmetic Operations

This is a Java project serving as a brief demonstration for Unit Testing for the needs of the lab tutorials of the [Software Engineering in Practice](https://www2.dmst.aueb.gr/dds/sweng-en/) course. It makes use of Maven to automate the build process of the two available modules. 

## Requirements
This project requires:
- Java JDK [version 1.7](http://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html) (or later) and
- Maven [3.3](https://maven.apache.org/download.cgi) (or later)

## Build project
In order to build the project execute the following Maven command:
```mvn clean install jacoco:report```

This command will also generate a report of the code coverage produced by JaCoCo. The report will be located in the following path for each module:
```target/site/jacoco```


## Test project
To simply run the unit tests of the project, execute the following Maven command: 
``` mvn test```

***Important:*** Note that only classes with a ```Test``` suffix located in the ```src/test``` will be executed and reported as Tests.

## Generate Test-coverage report
To simply run the unit tests of the project, execute the following Maven command: 
```mvn test jacoco:report```


## Continuous Integration service
This projects utilizes TravisCI services in other to test and build the application upon each ```git-push``` in the remote repository. 
There are multiple build environments in which the application will be tested and build. You can check these options under the ```jdk``` tag in the ```.travis.yml``` file. 

After each build, the badge is updated with the corresponding build status, ```green``` for passes and ```red``` for failures.

## Code coverage services
The repository is connected only with JaCoCo

