package org.example.SOLID.Dependency_inversion_Principle.BadExample;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;

import java.lang.management.OperatingSystemMXBean;

public class JSONFormatter implements Formatter{
    public String format(Message message) throws FormatException{
        ObjectMapper mapper = new ObjectMapper();
        mapper.registerModule(new JavaTimeModule());
        try{
            return mapper.writeValueAsString(message);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
            throw new FormatException(e);
        }
    }
}
