public class MainTriangle {
    public static void main(String[] args) {
        Triangle triangle = new Triangle(1, 1, 2, 1, 2, 2);

        System.out.println(triangle);
        System.out.println(triangle.getPerimeter());
        triangle.printType();
    }
}
