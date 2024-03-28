public class Rectangle {
    private int sideA;
    private int sideB;
    private Point topLeft;

    //constructor
    public Rectangle(int sideA,int sideB,Point topLeft){
        this.sideA = sideA;
        this.sideB = sideB;
        this.topLeft = topLeft;
    }
    //Area Method
    public int area(){
        return sideA * sideB;
    }
    //Perimeter Method
    public int perimeter(){
        return (sideA+sideB)*2;
    }
    //Corners returning Method
    public Point[] corners(){
        Point[] corners = new Point[4];
        corners[0] = topLeft;
        corners[1] = new Point(topLeft.getxCoord() + sideA, topLeft.getyCoord());
        corners[2] = new Point(corners[1].getxCoord(), corners[1].getyCoord() - sideB);
        corners[3] = new Point(corners[2].getxCoord() - sideA, corners[2].getyCoord());
        return corners;
    }

}
