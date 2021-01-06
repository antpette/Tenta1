package Template;

import java.awt.*;

public abstract class Car {

    double currentSpeed;
    Color color;

    protected Car(Color color){
        this.color = color;
    }

    protected abstract double gas(int amount);

    protected void brake(int amount) {
        if(currentSpeed > amount)
            currentSpeed -= amount;
        currentSpeed = 0;
    }
    protected double getCurrentSpeed(){
        return currentSpeed;
    }

    protected Color getColor(){
        return color;
    }

    protected void startEngine(){
        currentSpeed = 0.1;
    }

    protected void stopEngine(){
        currentSpeed = 0;
    }

    protected void turbo(int amount){
        currentSpeed *= gas(amount);
    }

}
