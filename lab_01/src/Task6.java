import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double bill = scanner.nextDouble();
        int friends = scanner.nextInt();

        if (bill < 0 || friends <= 0) {
            System.out.println("Error");
            return;
        }

        double total = bill * 1.1;
        int result = (int)Math.round(total / friends);
        System.out.println(result);
    }
}
