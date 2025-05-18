public class Quadrilateral extends Figure {
    private final Point a, b, c, d;

    public Quadrilateral(Point a, Point b, Point c, Point d) {
        if (a == null || b == null || c == null || d == null) {
            throw new IllegalArgumentException("Усі точки чотирикутника мають бути не null!");
        }
        if (isDegenerate(a, b, c, d)) {
            throw new IllegalArgumentException("Вироджений чотирикутник!");
        }
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }

    private boolean isDegenerate(Point a, Point b, Point c, Point d) {
        // Спрощено: якщо площа == 0 — вироджений
        return area(a, b, c, d) == 0.0;
    }

    private double area(Point a, Point b, Point c, Point d) {
        // Ділимо чотирикутник на два трикутники
        Triangle t1 = new Triangle(a, b, c);
        Triangle t2 = new Triangle(a, c, d);
        return t1.area() + t2.area();
    }

    @Override
    public double area() {
        return area(a, b, c, d);
    }

    @Override
    public Point centroid() {
        double x = (a.x + b.x + c.x + d.x) / 4.0;
        double y = (a.y + b.y + c.y + d.y) / 4.0;
        return new Point(x, y);
    }

    @Override
    public String toString() {
        return "Quadrilateral[A" + a + " B" + b + " C" + c + " D" + d + "]";
    }
}
