import java.util.Arrays;

public class Task14 {
    public static void cycleSwap(int[] arr) {
        if (arr.length == 0) return;
        int last = arr[arr.length - 1];
        for (int i = arr.length - 1; i > 0; i--) {
            arr[i] = arr[i - 1];
        }
        arr[0] = last;
    }

    public static void cycleSwap(int[] arr, int shift) {
        shift %= arr.length;
        for (int i = 0; i < shift; i++) {
            cycleSwap(arr);
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 3, 2, 7, 4};
        cycleSwap(arr);
        System.out.println(Arrays.toString(arr));

        int[] arr2 = {1, 3, 2, 7, 4};
        cycleSwap(arr2, 3);
        System.out.println(Arrays.toString(arr2));
    }
}
