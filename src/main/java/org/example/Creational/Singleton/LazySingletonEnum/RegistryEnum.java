package org.example.Creational.Singleton.LazySingletonEnum;

/**
 * (Ref. Google I/O 2k8 Joshua Bloch)
 * Since Java 1.5 using enum is clean way to create a singleton. It handles serialization using java's in-built
 * mechanism and still ensure single instance
 */
public enum RegistryEnum {

    INSTANCE;

    public void printMethod() {
        //Do actual work here.
        //and then print it
        System.out.println("Print this method ");
    }
}