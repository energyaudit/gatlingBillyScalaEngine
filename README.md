# QA Framework

This project is used for performance testing of applications. 

## How to use

Clone this repository using a git client as a first step, mvn clean,mvn install

### Running Locally
- mark src/test/scala as test source
- If got error: Could not find or load main class Engine,scala 2.13.1 is not compatible with gatling. Remove scala 2.13.1 from global libraries list and added scala 2.12.10.
- rightclick engine:runengine

### Report
- Report will create into target/gatling folder
