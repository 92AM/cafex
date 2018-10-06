# cafex - PSDDO Dev Exercise (DDCT)

The cafex application accepts food and drink items which are available in the menu ( i.e. Cola, Coffee, Cheese Sandwich, Steak Sandwich), it then calculates the overall bill by adding service charge where appropriate. 

## Requirements
* Apache Maven 
* Java 8
* Lombok (https://projectlombok.org/)
  
Note : please ensure that Lombok plugin is installed in your IDE before building / running the application.

## Building the project
In order to build the project please ensure that you are in the project root directory (i.e. same level as pom.xml) and execute `mvn clean package`. This will execute the goals in sequence, so the project will be cleaned first before being packaged up.

### Other build commands

#### Maven clean and install build
`mvn clean install`

#### Maven clean and instal build with debug / error output on CLI
`mvn clean install -e -X`

#### Maven clean and install build (excluding tests and clover instrumentation)
`mvn clean install -DskipTests -Dmaven.clover.skip=true`

#### Maven clean and test 
`mvn clean test`

## Running the application
In order to run the app provide it with the list of purchased items (case sensitive) e.g.:
`java -jar cafex.jar "Cola" "Coffee" "Cheese Sandwich"`

### Note
I have tested the project in Eclipse, IntelliJ and ran the 'cafex.jar' through command line. The logic works, this is proven by the JUnit tests.
