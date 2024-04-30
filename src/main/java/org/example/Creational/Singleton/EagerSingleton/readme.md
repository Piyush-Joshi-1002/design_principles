## Eager Singleton Pattern

The eager singleton pattern involves creating an instance of a class at the time of class loading, ensuring only one instance exists throughout the application's lifecycle.

### Code Explanation

1. Import the required package and classes.
2. Create a `Client` class with a `main` method.
3. Obtain instances of `EagerRegistry` using `EagerRegistry.getInstance()`.
4. Print output messages.
5. Check if both instances are the same using `(registry == registry1)`.

### Where to Use Singleton

Singleton pattern is used when you need exactly one instance of a class, such as:

- Managing a global resource (e.g., configuration settings, logging).
- Controlling concurrent access to shared resources.
- Implementing caches or pools of reusable objects.
