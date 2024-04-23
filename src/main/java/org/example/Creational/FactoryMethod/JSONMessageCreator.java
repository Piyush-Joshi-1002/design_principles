package org.example.Creational.FactoryMethod;


import org.example.Creational.FactoryMethod.message.JSONMessage;
import org.example.Creational.FactoryMethod.message.Message;

/**
 * Provides implementation for creating JSON messages
 */
public class JSONMessageCreator extends MessageCreator {

	@Override
	public Message createMessage() {
		return new JSONMessage();
	}

	
}
