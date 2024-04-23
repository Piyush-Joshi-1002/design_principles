package org.example.Creational.FactoryMethod;


import org.example.Creational.FactoryMethod.message.Message;
import org.example.Creational.FactoryMethod.message.TextMessage;

/**
 * Provides implementation for creating Text messages
 */
public class TextMessageCreator extends MessageCreator {

	@Override
	public Message createMessage() {
		return new TextMessage();
	}
}
