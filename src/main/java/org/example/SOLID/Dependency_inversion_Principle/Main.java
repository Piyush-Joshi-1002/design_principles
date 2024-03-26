package org.example.SOLID.Dependency_inversion_Principle;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Calendar;
public class Main {
    public static void main(String[] args) {
        /*
        *The Dependency Inversion Principle states that high-level modules should not depend on low-level modules,
        * but both should depend on abstractions.
        *
        * like in good Example we are using MessagePrinter to print Message,
        * but it also decides which format we want to print or do we want to print or write it on text file
        * which is wrong ,MessagePrinter should only be responsible for print not for deciding
        *  format and print mechanism
        *
        * that's why in good example we are passing Format as parameter in good example from main method.
        *
        */
    }
}
