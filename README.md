# cafex - DDCT Dev Exercise

The cafex application accepts food and drink items which are available in the menu ( i.e. Cola, Coffee, Cheese Sandwich, Steak Sandwich), it then calculates the overall bill by adding service charge where appropriate. 

## Requirements
Apache Maven 
Java 8

## Building the project
In order to build the project please ensure that you are in the project root directory (i.e. same level as pom.xml) and execute 'mvn clean package'. This will execute the goals in sequence, so the project will be cleaned first before being packaged up.

## Running the application
In order to run the app provide it with the list of purchased items (case sensitive) e.g.:
`java -jar cafex.jar "Cola" "Coffee" "Cheese Sandwich"`

### Note
I only tested the project in Eclipse, I haven't got round to building it or calling it from command line. The logic works, this is proven by the JUnit tests.
