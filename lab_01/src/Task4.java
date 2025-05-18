import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt();
        scanner.nextLine();
        if (count < 0) System.out.println("Error: negative number");
        else if (count == 0) System.out.println("No strangers to greet");
        else {
            for (int i = 0; i < count; i++) {
                String name = scanner.nextLine();
                System.out.println("Hello, " + name);
            }
        }

