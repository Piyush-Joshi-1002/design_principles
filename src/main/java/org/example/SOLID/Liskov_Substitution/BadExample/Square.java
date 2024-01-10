package org.example.SOLID.Liskov_Substitution.BadExample;

public class Square  extends Rectangle{


    public void setSide(int side) {
        super.setHeight(side);
        super.setWidth(side);
    }

    public Square(int side) {
        super(side, side);
    }
    @Override
    public void setWidth(int side) {
        setSide(side);
    }
    @Override
    public void setHeight(int side){
        setSide(side);
    }
}
