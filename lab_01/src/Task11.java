public class Task11 {
    public static int sum(int[] arr) {
        if (arr == null || arr.length == 0) return 0;
        int sum = 0;
        for (int n : arr) if (n % 2 == 0) sum += n;
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(sum(new int[]{1, 2, 3, 4}));
    }
}
