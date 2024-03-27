package org.example.Creational.builder.AnotherWay;

import org.example.Creational.builder.Address;
import org.example.Creational.builder.User;

import java.time.LocalDate;


public class Client {
    /*
    *  with the help of this mehtod we don't need complex constructors
    *  In Other Words we are using public getter methods but private
    *  setter methods which are only be accessible by builder class (which is inner Builder class)
    *  to prevent complex constructor
    *
    *  By this you can easily create an immutable class by implementing builder as an inner static class
    *  you'll find this type of implementation used quite frequently even if immutability is not a main concern.
    *
    *  Design Considerations :-
    *  The director role is rarely implemented as separate class, typically the consumer of
    *  the object instance or the client handles that role.
    *
    *  Abstract builder is also not required if "product" itself is not part of any inheritance
    *  hierarchy. You can directly create concrete builder.
    *
    *  If you are running into a "too many constructor arguments" problem then it's a
    *  good indication that builder pattern may help.
    * */
    public static void main(String[] args) {
        User user = createUser();
        // Client has to provide director with concrete builder
        UserDTO dto = directBuild(UserDTO.getBuilder(), user);
        System.out.println(dto);
    }

    /**
     * This method serves the role of director in builder pattern.
     */
    private static UserDTO directBuild(UserDTO.UserDTOBuilder builder, User user) {
        return builder.withFirstName(user.getFirstName()).withLastName(user.getLastName())
                .withBirthday(user.getBirthday()).withAddress(user.getAddress()).build();
    }

    /**
     * Returns a sample user.
     */
    public static User createUser() {
        User user = new User();
        user.setBirthday(LocalDate.of(1960, 5, 6));
        user.setFirstName("Ron");
        user.setLastName("Swanson");
        Address address = new Address();
        address.setHouseNumber("100");
        address.setStreet("State Street");
        address.setCity("Pawnee");
        address.setState("Indiana");
        address.setZipcode("47998");
        user.setAddress(address);
        return user;
    }

}
