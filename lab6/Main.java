public class Main {
    public static void main(String[] args) {
        Point topLeft = new Point(10,10);
        Rectangle myRec = new Rectangle(4,6,topLeft);

        System.out.println("Rectangle area = "+ myRec.area()+" Rectangle perimeter = "+myRec.perimeter());
        Point[] points = myRec.corners();
        for (int i = 0; i < points.length; i++){
            System.out.println(i+1+".corner's x coordinate = "+points[i].getxCoord()+" and y coordinate = "+ points[i].getyCoord());
        }

        Circle circleA = new Circle(10 ,new Point(10,10));
        Circle circleB = new Circle(10,new Point(40,10));
        Circle circleC = new Circle(10,new Point(15,10));

        System.out.println("The area of circleA is = "+circleA.area());
        System.out.println("The perimeter of circleA is = "+circleA.perimeter());

        boolean intersect = circleA.intersect(circleB);
        if (intersect)
            System.out.println("Circles are intersecting.");
        else
            System.out.println("Circles are not intersecting.");
    }
}
