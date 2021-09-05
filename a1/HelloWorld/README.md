# Java + Maven starter project

## Running the code

The "main" main() function is in App.java.

## CLI - Building and running the code

```sh
mvn clean
mvn install # or package
echo "Run the main() in App.java (defined in the manifest file of the jar)"
java -jar target/HelloWorld-1.0-SNAPSHOT.jar
echo "Run the main() in some other file"
java -cp target/HelloWorld-1.0-SNAPSHOT.jar edu.assignment...
```
