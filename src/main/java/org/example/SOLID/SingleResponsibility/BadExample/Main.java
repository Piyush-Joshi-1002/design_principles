package org.example.SOLID.SingleResponsibility.BadExample;

import java.io.IOException;

public class Main {
    /*
    *   Definition: THere should never be more than one reason for a class to change
    *       Focused , single functionality, or address a specific concern.
    * */
    // like here we are doing every thing in UserController so if
    // we need to change logic in user creation then we need to
    // change  logic in user Controller as well as if we need to change
    // valid logic then again we need to do some changes in userController which is not good example
    private static final String VALID_USER_JSON = "{\"name\": \"Randy\", \"email\": \"randy@email.com\", \"address\":\"110 Sugar lane\"}";

    //Invalid USER JSON String - email format wrong
    private static final String INVALID_USER_JSON = "{\"name\": \"Sam\", \"email\": \"sam@email\", \"address\":\"111 Sugar lane\"}";

    public static void main(String[] args) throws IOException {
        UserController controller = new UserController();
        //Check with valid JSON
        String response = controller.createUser(VALID_USER_JSON);
        if(!response.equalsIgnoreCase("SUCCESS")) {
            System.err.println("Failed");
        }
        System.out.println("Valid JSON received response: "+response);
        //Check with invalid JSON
        response = controller.createUser(INVALID_USER_JSON);
        if(!response.equalsIgnoreCase("ERROR")) {
            System.err.println("Failed");
        }
        System.out.println("Invalid JSON received response: "+response);
    }



}
