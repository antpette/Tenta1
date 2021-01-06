package Bridge;

public class TestBridge {

    public static void main(String[] args){

        Shape sq = new Square(new Blue());
        Shape s2 = new Circle(new Red());

        System.out.println(sq.draw());
        System.out.println(s2.draw());
    }
}
