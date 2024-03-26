package org.example.SOLID.SingleResponsibility.GoodExample;

import org.example.SOLID.SingleResponsibility.BadExample.UserController;

import java.io.IOException;
import java.util.concurrent.*;

public class Main {
    /*
    *   Definition: THere should never be more than one reason for a class to change
    *       Focused , single functionality, or address a specific concern.
    * */
    /*
    * in this example we created different classes for userPersistenceService
    * for save and UserValidator for validate,
    * so we can easily identify any error and also one class have only one responsibility
    */

    private static final String VALID_USER_JSON2= "{\"name\": \"Tom\", \"email\": \"randy1@email.com\", \"address\":\"110 Sugar lane\"}";
    private static final String VALID_USER_JSON1 = "{\"name\": \"Hanry\", \"email\": \"randy2@email.com\", \"address\":\"1105 Sugar lane\"}";

    //Invalid USER JSON String - email format wrong
    private static final String INVALID_USER_JSON = "{\"name\": \"Sam\", \"email\": \"sam@email\", \"address\":\"111 Sugar lane\"}";

    public static void main(String[] args) throws IOException {
        UserController controller = new UserController();
        ExecutorService executorService = Executors.newFixedThreadPool(2);

        //Check with valid JSON

        Callable<String> requestTask1 = () -> {
            // Simulate sending request 1
            return controller.createUser(VALID_USER_JSON1);
        };

        Callable<String> requestTask2 = () -> {
            // Simulate sending request 2
            return controller.createUser(VALID_USER_JSON2);
        };
        Future<String> futureResponse1 = executorService.submit(requestTask1);
        Future<String> futureResponse2 = executorService.submit(requestTask2);
        String response, response2;
        try {
            response = futureResponse1.get();
            response2 = futureResponse2.get();
            if(!response.equalsIgnoreCase("SUCCESS")) {
                System.err.println("Failed");
            }
            System.out.println("Valid JSON received response: "+response);
            //Check with invalid JSON
            /*response = controller.createUser(INVALID_USER_JSON);
            if(!response.equalsIgnoreCase("ERROR")) {
                System.err.println("Failed");
            }
            System.out.println("Invalid JSON received response: "+response);*/
        } catch (ExecutionException | InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println(response + " " + response2);
        // Shutdown ExecutorService
        executorService.shutdown();
    }



}
