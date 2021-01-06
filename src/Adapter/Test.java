package Adapter;

public class Test {

    public static void main(String[] args) {
        RoundHole hole = new RoundHole(5);
        RoundPeg roundPeg = new RoundPeg(5);
        if(hole.fits(roundPeg)) {
            System.out.println("great");
        }

        SquarePeg smallSquarePeg = new SquarePeg(3);
        SquarePeg bigSquarePeg = new SquarePeg(20);

        SquarePegAdapter smallPeg = new SquarePegAdapter(smallSquarePeg);
        SquarePegAdapter bigPeg = new SquarePegAdapter(bigSquarePeg);

        if(hole.fits(smallPeg)) {
            System.out.println("great2");

        }
        if(hole.fits(bigPeg)) {

        }
        else System.out.println("oh no");
    }

}
