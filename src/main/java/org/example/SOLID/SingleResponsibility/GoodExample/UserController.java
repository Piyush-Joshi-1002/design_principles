package org.example.SOLID.SingleResponsibility.GoodExample;


import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;

public class UserController {
    //Store used by controller
    private Store store = new Store();
    private UserValidator validator = new UserValidator();
    private UserPersistenceService userPersistenceService = new UserPersistenceService();
    //Create a new user
    public String createUser(String userJson) throws IOException {
        ObjectMapper mapper = new ObjectMapper();

        User user = mapper.readValue(userJson, User.class);

        boolean valid = validator.validateUser(user);

        if(!valid) {
            return "ERROR";
        }
        userPersistenceService.saveUser(user);
        return "SUCCESS";
    }

}