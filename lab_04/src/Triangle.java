public class Triangle extends Figure {
    private final Point a, b, c;

    public Triangle(Point a, Point b, Point c) {
        if (a == null || b == null || c == null) {
            throw new IllegalArgumentException("Усі точки трикутника мають бути не null!");
        }
        if (isDegenerate(a, b, c)) {
            throw new IllegalArgumentException("Вироджений трикутник!");
        }
        this.a = a;
        this.b = b;
        this.c = c;
    }

    private boolean isDegenerate(Point a, Point b, Point c) {
        return area(a, b, c) == 0.0;
    }

    private double area(Point a, Point b, Point c) {
        return Math.abs(
                (a.x * (b.y - c.y) +
                        b.x * (c.y - a.y) +
                        c.x * (a.y - b.y)) / 2.0
        );
    }

    @Override
    public double area() {
        return area(a, b, c);
    }

    @Override
    public Point centroid() {
        double x = (a.x + b.x + c.x) / 3.0;
        double y = (a.y + b.y + c.y) / 3.0;
        return new Point(x, y);
    }

    @Override
    public String toString() {
        return "Triangle[A" + a + " B" + b + " C" + c + "]";
    }
}
