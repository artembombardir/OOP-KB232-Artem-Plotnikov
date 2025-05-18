public class Main {
    public static void main(String[] args) {
        // Тестування Triangle
        Point a = new Point(0, 0);
        Point b = new Point(4, 0);
        Point c = new Point(0, 3);
        Triangle t = new Triangle(a, b, c);
        System.out.println(t);
        System.out.println("Area: " + t.area());
        System.out.println("Centroid: " + t.centroid());

        // Тестування Quadrilateral
        Point d = new Point(4, 3);
        Quadrilateral q = new Quadrilateral(a, b, d, c);
        System.out.println(q);
        System.out.println("Area: " + q.area());
        System.out.println("Centroid: " + q.centroid());

        // Тестування Circle
        Circle circle = new Circle(new Point(2, 2), 5);
        System.out.println(circle);
        System.out.println("Area: " + circle.area());
        System.out.println("Centroid: " + circle.centroid());
    }
}
