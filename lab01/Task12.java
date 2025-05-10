import java.util.Arrays;

public class Task12 {
    public static boolean[] getSumCheckArray(int[] arr) {
        boolean[] result = new boolean[arr.length];
        result[0] = false;
        result[1] = false;
        for (int i = 2; i < arr.length; i++) {
            result[i] = arr[i] == arr[i - 1] + arr[i - 2];
        }
        return result;
    }

    public static void main(String[] args) {
        int[] input = {1, -1, 0, 4, 6, 10, 15, 25};
        System.out.println(Arrays.toString(getSumCheckArray(input)));
    }
}
