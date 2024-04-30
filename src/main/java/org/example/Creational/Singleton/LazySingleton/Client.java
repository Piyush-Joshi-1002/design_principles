package org.example.Creational.Singleton.LazySingleton;

public class Client {
    public static void main(String[] args) {
        LazyRegistryWithDCL registry = LazyRegistryWithDCL.getInstance();
        LazyRegistryWithDCL registry1 = LazyRegistryWithDCL.getInstance();

        System.out.println("Lazy Singleton done by creating single instance of LazyRegistryWithDCL class ");
        System.out.println("--------------------------------------------------------------------------------");
        System.out.println("Are both same : " + (registry == registry1));
    }
}
