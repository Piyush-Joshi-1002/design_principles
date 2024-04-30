package org.example.Creational.Singleton.EagerSingleton;

public class Client {

	public static void main(String[] args) {
		EagerRegistry registry = EagerRegistry.getInstance();
		EagerRegistry registry1 = EagerRegistry.getInstance();
		System.out.println("Eager Singleton done by creating single instance of EagerRegistry class ");

		System.out.println("-------------------------------------------------------------------------");
		System.out.println("Are both same : " + (registry == registry1));
	}

}
