public class Triangle {
    private Point a, b, c;

    public Triangle(Point a, Point b, Point c) {
        if (area(a, b, c) == 0)
            throw new IllegalArgumentException("Трикутник вироджений!");
        this.a = a;
        this.b = b;
        this.c = c;
    }

    private double area(Point a, Point b, Point c) {
        return Math.abs((a.x*(b.y-c.y) + b.x*(c.y-a.y) + c.x*(a.y-b.y))/2);
    }

    public double area() {
        return area(a, b, c);
    }

    public Point centroid() {
        double x = (a.x + b.x + c.x) / 3;
        double y = (a.y + b.y + c.y) / 3;
        return new Point(x, y);
    }
}
