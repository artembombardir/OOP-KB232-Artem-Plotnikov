public class Segment {
    private Point start, end;

    public Segment(Point start, Point end) {
        if (start.x == end.x && start.y == end.y)
            throw new IllegalArgumentException("Відрізок вироджений!");
        this.start = start;
        this.end = end;
    }

    public double length() {
        return Math.hypot(end.x - start.x, end.y - start.y);
    }

    public Point middle() {
        return new Point((start.x + end.x) / 2, (start.y + end.y) / 2);
    }

    public Point intersection(Segment other) {
        double a1 = end.y - start.y;
        double b1 = start.x - end.x;
        double c1 = a1 * start.x + b1 * start.y;

        double a2 = other.end.y - other.start.y;
        double b2 = other.start.x - other.end.x;
        double c2 = a2 * other.start.x + b2 * other.start.y;

        double delta = a1 * b2 - a2 * b1;

        if (delta == 0) return null; // паралельні або співпадають

        double x = (b2 * c1 - b1 * c2) / delta;
        double y = (a1 * c2 - a2 * c1) / delta;

        // Перевірка чи точка належить обом відрізкам
        if (isOnSegment(x, y, this) && isOnSegment(x, y, other))
            return new Point(x, y);

        return null;
    }

    private boolean isOnSegment(double x, double y, Segment s) {
        return x >= Math.min(s.start.x, s.end.x) && x <= Math.max(s.start.x, s.end.x) &&
                y >= Math.min(s.start.y, s.end.y) && y <= Math.max(s.start.y, s.end.y);
    }
}
