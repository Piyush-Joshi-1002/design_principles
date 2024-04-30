## Lazy Singleton Pattern with Double-Checked Locking (DCL)

This class demonstrates the singleton pattern using Double-Checked Locking (DCL), providing lazy initialization for the singleton instance.

### Code Explanation

1. Import the required package and classes.
2. Create a `LazyRegistryWithDCL` class with a private constructor to prevent direct instantiation.
3. Declare a static volatile instance variable `INSTANCE` of type `LazyRegistryWithDCL`.
4. Implement the `getInstance()` method to create a singleton instance.
5. Use double-checked locking with synchronization to ensure thread safety during lazy initialization.
6. Return the singleton instance.

### Important Note

The use of volatile and double-checked locking in this implementation helps in solving multi-threading issues related to lazy initialization. However, note that the volatile keyword's guarantees are effective from Java version 1.5 onwards.

### Where to Use Singleton

Lazy Singleton with Double-Checked Locking is useful when you need delayed creation of an instance until it is first accessed and require thread safety for concurrent access scenarios.

- Use for resource-intensive objects that should be created only when needed.
- Ideal for scenarios where thread-safe lazy initialization is crucial.
#### The volatile keyword is used to ensure that changes made to the INSTANCE variable are immediately visible to all threads. This helps prevent potential issues related to thread visibility and ensures thread-safe lazy initialization.
