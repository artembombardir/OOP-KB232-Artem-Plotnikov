public class Task10 {
    public static int max(int[] arr) {
        int max = arr[0];
        for (int n : arr) {
            if (n > max) max = n;
        }
        return max;
    }

    public static void main(String[] args) {
        System.out.println(max(new int[]{1, 5, 2, 9}));
    }
}
