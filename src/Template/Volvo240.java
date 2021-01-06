package Template;

import java.awt.*;

public class Volvo240 extends Car {

    public Volvo240() {
        super(Color.CYAN);
    }

    @Override
    protected double gas(int amount) {
        return currentSpeed *= amount * 12;
    }
}
