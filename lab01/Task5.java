import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt(); // up
        int b = scanner.nextInt(); // down
        int h = scanner.nextInt(); // height

        if (a <= b && a < h) {
            System.out.println("Impossible");
        } else {
            int days = (h - b - 1) / (a - b) + 1;
            System.out.println(days);
        }
    }
}
