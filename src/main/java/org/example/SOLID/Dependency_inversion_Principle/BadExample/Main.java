package org.example.SOLID.Dependency_inversion_Principle.BadExample;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {

        Message msg = new Message("This is new Message");
        MessagePrinter printer = new MessagePrinter();
        printer.writeMessage(msg,"test_msg.txt");
    }
}
