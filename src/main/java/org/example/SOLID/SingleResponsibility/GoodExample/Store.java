package org.example.SOLID.SingleResponsibility.GoodExample;

import java.util.HashMap;
import java.util.Map;

public class Store {
    private static final Map<String, User> Storage = new HashMap<>();
    public void store(User user){
        synchronized (Storage){
            Storage.put(user.getName(),user);
        }
    }
    public User getUser(String name){
        synchronized (Storage){
            return Storage.get(name);
        }
    }

}
