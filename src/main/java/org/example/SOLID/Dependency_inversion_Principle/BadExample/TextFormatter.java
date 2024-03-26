package org.example.SOLID.Dependency_inversion_Principle.BadExample;

public class TextFormatter {
    public String format(Message message) {
        return message.getTimeStemp()+":"+message.getMsg();
    }
}
