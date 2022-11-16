public class Main {
    public static void main(String[] args) {
        Point p = new Point(3, 4);
        Point p2 = new Point();
        Point p3 = p;

        p.moveTwo(5, 6);

        System.out.println(p);
        System.out.println(p2);
        System.out.println(p3);

        System.out.println(p.getX());
    }
}
