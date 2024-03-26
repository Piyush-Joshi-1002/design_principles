package org.example.SOLID.Dependency_inversion_Principle.BadExample;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class MessagePrinter {
    public void writeMessage(Message msg, String fileName) throws IOException{
        Formatter formatter = new JSONFormatter();
        try(PrintWriter writer = new PrintWriter(new FileWriter(fileName)))
        {
            writer.println(formatter.format(msg));
            writer.flush();
        }
    }
}
