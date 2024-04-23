# Factory Method Pattern

The Factory Method pattern is a creational design pattern that provides an interface for creating objects in a superclass but allows subclasses to alter the type of objects that will be created. This pattern promotes loose coupling by ensuring that the code depends more on interfaces and abstractions rather than concrete implementations.

## Components

1. **Message Hierarchy**
    - **Message**: The base interface or abstract class for all message types.
    - **JSONMessage**: A concrete implementation of the `Message` interface for creating JSON messages.
    - **TextMessage**: A concrete implementation of the `Message` interface for creating text messages.

2. **MessageCreator Hierarchy**
    - **MessageCreator**: The base interface or abstract class for creating messages.
    - **JSONMessageCreator**: A concrete implementation of `MessageCreator` for creating JSON messages.
    - **TextMessageCreator**: A concrete implementation of `MessageCreator` for creating text messages.

## Workflow

1. Client requests a message creation by interacting with a `MessageCreator`.
2. Depending on the type of `MessageCreator` used, a corresponding `Message` object is created.
3. The client utilizes the created `Message` object without needing to know its specific implementation.

## Advantages

- **Flexibility**: Clients can work with interfaces and abstractions, allowing for easy substitution of concrete implementations.
- **Encapsulation**: The creation logic is encapsulated within creator classes, promoting a clear separation of concerns.
- **Extensibility**: Adding new message types or creators is straightforward, as it follows the open-closed principle.

## Implementation Notes

- **Use Cases**: The Factory Method pattern is beneficial when the client code needs to work with multiple related but distinct types of objects.
- **Abstraction over Implementation**: Encourage clients to depend on abstractions (`MessageCreator`, `Message`) rather than concrete classes (`JSONMessageCreator`, `TextMessageCreator`), promoting code maintainability and flexibility.

# Simple Factory vs Factory Method Pattern

Both the Simple Factory pattern and the Factory Method pattern are creational design patterns used in software development. However, they differ in their implementation and usage.

## Simple Factory Pattern

### Definition
The Simple Factory pattern is a creational design pattern that provides a single class responsible for creating objects based on input parameters.

### Components
- **Factory Class**: A class responsible for creating objects based on input parameters.
- **Client**: Utilizes the factory class to create objects without needing to know the specific object creation logic.

### Example (Java)
```java
public class SimpleFactory {
    public static Object createObject(String objectType) {
        if ("A".equals(objectType)) {
            return new ObjectA();
        } else if ("B".equals(objectType)) {
            return new ObjectB();
        } else {
            throw new IllegalArgumentException("Invalid object type");
        }
    }
}

// Usage
Object objectA = SimpleFactory.createObject("A");
Object objectB = SimpleFactory.createObject("B");
```
- ### Remember, the most defining Remember, the most defining characteristic of factory method pattern is "subclasses providing the actual instance".
  So static methods returning obiect instances are technically not GoF factory methods.