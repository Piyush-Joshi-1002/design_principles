package org.example.Creational.SimpleFactory;

public class Main {
    /** We are studying simple factory as it is often confused with "factory method" pattern **/
    /*
    * Here we simply move the instantiation logic to a separate class and most commonly to a static method of this class.
    * Some do not consider simple factory to be a "design pattern", as its simply a method that
    * encapsulates object instantiation. Nothing complex goes on in that method.
    *
    * */

    /*
         * Compare & Contrast with Factory Method Pattern
                    Simple Factory                     |                        Factory Method
        * We simply move our instantiation logic       |           * Factory method is more useful when you
          away from client code. Typically, in a       |             want to delegate object creation to
          static method.                               |             subclasses.
                                                       |
        * Simple factory knows about all classes       |           * In Factory method we don’t know in
          whose objects it can create.                 |             advance about all product subclasses.


    *
    */


}
