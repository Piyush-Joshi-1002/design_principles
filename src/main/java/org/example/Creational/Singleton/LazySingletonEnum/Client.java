package org.example.Creational.Singleton.LazySingletonEnum;

public class Client {

    public static void main(String[] args) {

        // by using this we can achieve Singleton without worrying about synchronized and serialization and deserialization issue
        RegistryEnum.INSTANCE.printMethod();


    }
}
