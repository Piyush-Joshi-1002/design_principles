package org.example.SOLID.Dependency_inversion_Principle.GoodExample;

import java.time.LocalDateTime;
import java.time.ZoneId;

public class Message {
    private String msg;
    private LocalDateTime timeStemp;

    public Message(String msg){
        this.msg = msg;
        this.timeStemp = LocalDateTime.now(ZoneId.of("UTC"));
    }

    public String getMsg() {
        return msg;
    }

    public LocalDateTime getTimeStemp() {
        return timeStemp;
    }
}
