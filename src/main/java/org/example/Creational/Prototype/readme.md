# Prototype Pattern

## What is a Prototype?

The Prototype Pattern is a design pattern used in object-oriented programming. It allows for creating new objects by copying an existing instance, thus saving resources and time.

## Why Use a Prototype?

Consider a scenario where creating a complex object is costly. Instead of recreating it from scratch, we can use an existing instance as a prototype to create new instances efficiently.

## How Does It Work?

1. **Create a Prototype:** Define a prototype interface or class with a method for cloning objects.
2. **Implement Concrete Prototypes:** Create concrete classes that implement the clone method to copy themselves.
3. **Clone Objects:** Use the clone method to create new instances based on existing prototypes.

## Java Example:

```java
// Prototype interface
interface Prototype {
    Prototype clone();
}

// Concrete Prototype
class ConcretePrototype implements Prototype {
    private String name;

    public ConcretePrototype(String name) {
        this.name = name;
    }

    @Override
    public Prototype clone() {
        return new ConcretePrototype(this.name);
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

// Usage
public class PrototypeExample {
    public static void main(String[] args) {
        ConcretePrototype prototype = new ConcretePrototype("Prototype 1");
        ConcretePrototype clone = (ConcretePrototype) prototype.clone();

        System.out.println("Original Prototype Name: " + prototype.getName());
        System.out.println("Cloned Prototype Name: " + clone.getName());

        clone.setName("Prototype 2");
        System.out.println("Modified Cloned Prototype Name: " + clone.getName());
    }
}
