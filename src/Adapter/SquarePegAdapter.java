package Adapter;

public class SquarePegAdapter implements IRoundPeg {
    // implementera de interface som de önskade objektet använder
    private SquarePeg Peg;
    // ta in de oönskade objektet som parameter
    public SquarePegAdapter (SquarePeg Peg) {
        this.Peg = Peg;
    }

    // implementera funktionen så att de oönskade objektet får rätt egenskaper
    public double getRadius() {
        double result;
        result = (Math.sqrt(Math.pow((Peg.getWidth() / 2), 2) * 2));
        return result;
    }

}
