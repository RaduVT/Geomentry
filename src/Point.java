public class Point {
    private int x;
    private int y;

    public Point() {
        x = 0;
        y = 0;
    }
    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void moveTwo(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void setOffset(int xOff, int yOff) {
        x += xOff; //x = x + xOff
        y += yOff;
    }

     public String toString() {
        return "(" + x + ", " + y +")";
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

}
