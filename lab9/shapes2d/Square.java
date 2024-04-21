package shapes2d;

public class Square {
    private double side;

    public Square(double side) {
        this.side = side;
    }

    public double area(){
        return side*side;
    }

    @Override
    public String toString() {
        return "Square{" +
                "side=" + side +
                '}';
    }


    public double getSide() {
        return side;
    }
}
