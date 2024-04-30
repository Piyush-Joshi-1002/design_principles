# What is an Abstract Factory?
- Abstract factory is used when we have two or more objects which work together forming a
  kit or set and there can be multiple sets or kits that can be created by client code.
- So we separate client code from concrete objects forming such a set and also from the
  code which creates these sets.

# Implement Abstract Factory
- we start by studying the product "Sets"
  - Create abstract factory as an abstract class or an interface.
  - Abstract factory defines abstract methods for creating products.
  - Provide concrete implementation of factory for each set of products.
```
- Abstract factory makes use of factory method pattern. You can think of abstract factory as an object
  with multiple factory methods...
```
 