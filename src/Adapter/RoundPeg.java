package Adapter;

public class RoundPeg implements IRoundPeg {

    private double radius;

    public RoundPeg(){}

    public RoundPeg(double radius) {
        this.radius = radius;
    }
    public double getRadius() {
        return radius;
    }


}
