
# Pizza Factory - CSE-2102-Lab 3

### Repo Link
[https://github.com/Angello-ops/CSE-2102-Lab3](https://github.com/Angello-ops/CSE-2102-Lab3)

## Brief Description

This project implements a **Pizza Factory** using the **Factory Design Pattern** in Java. The factory is designed to create different types of pizza (Cheese, Greek, Pepperoni, and Gluten-Free). Each pizza type follows the process of preparation (`prepare()`), baking (`bake()`), cutting (`cut()`), and boxing (`box()`).

The main components of this project are:
- **Pizza**: An abstract class that defines the common pizza-making functions.
- **PizzaFactory**: A factory class that creates the specific type of pizza.
- **PizzaStore**: A store that orders pizzas and interacts with the factory to create pizzas.
- **JUnit Tests**: Unit tests implemented using **JUnit 4** to ensure that the pizza factory works correctly by creating and validating each pizza type.

This project is built using **Maven** for dependency management, and it uses **JUnit4** for unit testing.

## How to Download and Run the System

### Prerequisites

- **Java**: Ensure that Java (JDK 8 or higher) is installed. You can verify Java is installed by running:
  ```bash
  java -version
  ```
  
- **Maven**: Make sure that Maven is installed. You can verify this by running:
  ```bash
  mvn -v
  ```

### Download the Project

To download the project, you can either:
1. **Clone the repository**:
   ```bash
   git clone https://github.com/Angello-ops/CSE-2102-Lab3.git
   ```

2. **Download the ZIP file**:
   Go to the repository link: [https://github.com/Angello-ops/CSE-2102-Lab3](https://github.com/Angello-ops/CSE-2102-Lab3), and click **Download ZIP**.

### Running the Project

1. **Navigate to the project directory**:
   ```bash
   cd CSE-2102-Lab3/pizzafactory/
   ```

2. **Compile the code**:
   Use Maven to compile the project:
   ```bash
   mvn clean compile
   ```

3. **Run the tests**:
   Run the JUnit tests to ensure everything is working properly:
   ```bash
   mvn test
   ```

4. **Package the project**:
   Use Maven to package the project into a JAR file:
   ```bash
   mvn package
   ```

5. **Run the JAR file**:
   After the JAR is built, you can run the application using:
   ```bash
   java -jar target/pizzafactory-1.0-SNAPSHOT.jar
   ```

   This will demonstrate the PizzaStore functionality, showing how different types of pizza are created and processed.

## Unit Testing

Unit tests for the Pizza Factory are included in the `src/test/java/com/pizzafactory` folder. These tests cover the creation of different pizza types (Cheese, Greek, Pepperoni, and Gluten-Free) and validate that they are processed correctly by the factory.

You can run the unit tests using Maven:
```bash
mvn test
```

## License

This project is licensed under the MIT License - see the LICENSE file for details.
