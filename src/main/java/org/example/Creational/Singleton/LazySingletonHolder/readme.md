## Lazy Initialization Holder (IODH) Singleton Pattern

The Lazy Initialization Holder (IODH) is a design pattern used in Java to implement the Singleton pattern with lazy initialization. This ensures the singleton instance is created only when it's first accessed, saving memory and providing thread safety without explicit synchronization.

### Explanation

* **Lazy Initialization:** The singleton instance is created only on the first call to `getInstance()`. This avoids creating it unnecessarily, improving memory efficiency.
* **Thread Safety:** The IODH pattern guarantees thread safety due to the JVM handling class loading atomically. This means only one thread can initialize the instance at a time.

### Implementation

```java
package org.example.Creational.Singleton.LazySingletonHolder;

/**
 * Singleton pattern using lazy initialization holder class. This ensures we have lazy initialization
 * without worrying about synchronization.
 */
public class LazyRegistryIODH {

  private LazyRegistryIODH() {
    System.out.println("IN LazyRegistryIODH Singleton");
  }

  private static class RegistryHolder {
    static final LazyRegistryIODH INSTANCE = new LazyRegistryIODH();
  }

  public static LazyRegistryIODH getInstance() {
    return RegistryHolder.INSTANCE;
  }
}
```
The LazyRegistryIODH class has a private constructor to prevent external instantiation. A static nested class RegistryHolder holds the singleton instance. Finally, the getInstance() method returns the instance from RegistryHolder. Since RegistryHolder is static and nested, it's loaded only when getInstance() is called, ensuring lazy initialization.

### Advantages
- Memory Efficiency: The instance is created only when needed, reducing memory usage until it's actually required.
- Thread Safety: No need for explicit synchronization. The JVM handles class loading atomically, guaranteeing thread-safe initialization.
### Usage
 To use the Lazy Initialization Holder (IODH) Singleton pattern, simply call LazyRegistryIODH.getInstance() to obtain the singleton instance.

## Considerations
#### While the IODH pattern offers advantages, it's important to consider potential drawbacks:

- Increased Class Loading Complexity: The static nested class introduces a slight increase in class loading complexity compared to simpler Singleton implementations.
- Over-Engineering: If the application doesn't require strict memory efficiency or thread safety, a simpler Singleton approach might be sufficient.
#### Choose the IODH pattern when memory efficiency and thread safety are crucial, but be aware of the trade-offs.