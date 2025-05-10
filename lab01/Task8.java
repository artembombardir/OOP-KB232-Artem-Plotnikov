import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0, count = 0;
        while (true) {
            int num = scanner.nextInt();
            if (num == 0) break;
            sum += num;
            count++;
        }
        System.out.println(sum / count);
    }
}
