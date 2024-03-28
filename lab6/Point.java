public class Point {

    private int xCoord;
    private int yCoord;

    // Constructor
    public Point(int xCoord,int yCoord){
        this.xCoord = xCoord;
        this.yCoord = yCoord;
    }
    //setters for xCoord and yCoord
    public void setxCoord(int xCoord){this.xCoord = xCoord;}
    public void setyCoord(int yCoord){this.yCoord = yCoord;}

    //getters for xCoord and yCoord
    public int getxCoord(){return xCoord;}
    public int getyCoord(){return yCoord;}

    // Distance between two points Constructor
    public double distanceFromAPoint(Point point){
        int xDifference = xCoord - point.xCoord;
        int yDifference = yCoord - point.yCoord;
        return Math.sqrt(Math.pow(xDifference,2) + Math.pow(yDifference,2));
    }
}
