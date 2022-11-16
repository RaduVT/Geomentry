public class Triangle {
    private Point v1, v2, v3;

    public Triangle(int x1, int y1, int x2, int y2, int x3, int y3) {
        v1 = new Point(x1, x2);
        v2 = new Point(x2, y2);
        v3 = new Point(x3, y3);
    }

    public Triangle (Point v1, Point v2, Point v3) {
        this.v1 = v1;
        this.v2 = v2;
        this.v3 = v3;
    }

    @Override
    public String toString() {
        return  "Triangle @" + v1 + "," + v2 + "," + v3 ;
    }

    public double getPerimeter() {
        double side1 = Point.distance(v1, v2);
        double side2 = Point.distance(v2, v3);
        double side3 = Point.distance(v3, v1);
        return side1 + side2 + side3;
    }
    
    public static double distance(Point p1, Point p2) {
        Segment segment = new Segment(p1, p2);
        return segment.getModule();
    }

    public void printType() {
        double side1 = Point.distance(v1, v2);
        double side2 = Point.distance(v2, v3);
        double side3 = Point.distance(v3, v1);
        if (side1 == side2 && side2 != side3 && side1) {
            System.out.println("Equilateral");
        } else {
            if (side1 != side2 && side2 != side3)
        }
    }
}
