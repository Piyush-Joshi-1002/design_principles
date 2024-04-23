package org.example.Creational.builder;
import java.time.LocalDate;

//This is our client which also works as "director"
/*
*  The Builder design pattern separates the construction of a complex object from its representation,
*  allowing the same construction process to create different representations.
*
*  This example demonstrates the Builder design pattern in Java. The Client class creates a User object and
*  uses a UserDTOBuilder to build a UserDTO object from the User object.
*
*  UserDTO is immutable, so we are using builder design pattern for creating immutable DTO object without
*  any complex constructor and constructing complex objects step by step, making it easier to create different
*  representations of the same object.
*
 * */
public class Client {

    public static void main(String[] args) {
        User user = createUser();
        UserDTOBuilder builder = new UserWebDTOBuilder();
        //Client has to provide director with concrete builder
        UserDTO dto = directBuild(builder, user);
        System.out.println(dto);

    }

    /**
     * This method serves the role of director in builder pattern.
     */
    private static UserDTO directBuild(UserDTOBuilder builder, User user) {
        return builder.withFirstName(user.getFirstName()).withLastName(user.getLastName())
                .withAddress(user.getAddress())
                .withBirthday(user.getBirthday())
                .build();
    }

    /**
     * Returns a sample user.
     */
    public static User createUser() {
        User user = new User();
        user.setBirthday(LocalDate.of(2000, 5, 24));
        user.setFirstName("Piyush");
        user.setLastName("Joshi");
        Address address = new Address();
        address.setHouseNumber("10");
        address.setStreet("Indore");
        address.setCity("Indore");
        address.setState("Madhya Pradesh");
        address.setZipcode("454776");
        user.setAddress(address);
        return user;
    }
}
