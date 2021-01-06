package Template;

import java.awt.*;

public class Saab95 extends Car{

    public Saab95(){
        super(Color.GRAY);
    }

    @Override
    protected double gas(int amount) {
        return currentSpeed *= amount*10;
    }
}
