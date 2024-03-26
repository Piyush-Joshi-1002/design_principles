package org.example.SOLID.Dependency_inversion_Principle.GoodExample;

public class TextFormatter  implements Formatter{
    public String format(Message message) {
        return message.getTimeStemp()+":"+message.getMsg();
    }
}
