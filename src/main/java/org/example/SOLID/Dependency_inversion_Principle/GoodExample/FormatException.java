package org.example.SOLID.Dependency_inversion_Principle.GoodExample;

import java.io.IOException;

public class FormatException extends IOException {
    public FormatException(Exception cause){ super(cause);}
}
