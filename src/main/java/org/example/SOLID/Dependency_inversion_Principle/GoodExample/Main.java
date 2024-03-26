package org.example.SOLID.Dependency_inversion_Principle.GoodExample;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Main {
    public static void main(String[] args) throws IOException {

        Message msg = new Message("This is new Message");
        MessagePrinter printer = new MessagePrinter();
        try(PrintWriter writer = new PrintWriter(new FileWriter("text_msg.txt"))){
            printer.writeMessage(msg,new JSONFormatter(),writer);
            printer.writeMessage(msg, new TextFormatter(),new PrintWriter(System.out));
        }
    }
}
