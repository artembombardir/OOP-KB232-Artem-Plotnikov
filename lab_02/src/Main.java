public class Main {
    public static void main(String[] args) {
        // Тест Line
        Line line1 = new Line(1, 1);
        Line line2 = new Line(-1, 3);
        System.out.println("Перетин ліній: " + line1.intersection(line2));

        // Тест Segment
        Segment s1 = new Segment(new Point(0, 0), new Point(4, 4));
        Segment s2 = new Segment(new Point(0, 4), new Point(4, 0));
        System.out.println("Перетин сегментів: " + s1.intersection(s2));
        System.out.println("Довжина сегмента: " + s1.length());
        System.out.println("Середина сегмента: " + s1.middle());

        // Тест Triangle
        Triangle triangle = new Triangle(new Point(0, 0), new Point(4, 0), new Point(0, 3));
        System.out.println("Площа трикутника: " + triangle.area());
        System.out.println("Центроїд трикутника: " + triangle.centroid());
    }
}
