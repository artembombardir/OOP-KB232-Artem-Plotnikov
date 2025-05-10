import java.util.*;

public class Task13 {
    public static int[] removeLocalMaxima(int[] arr) {
        List<Integer> list = new ArrayList<>();
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            if (i > 0 && i < n - 1 && arr[i] > arr[i - 1] && arr[i] > arr[i + 1]) continue;
            list.add(arr[i]);
        }
        return list.stream().mapToInt(i -> i).toArray();
    }

    public static void main(String[] args) {
        int[] input = {18, 1, 3, 6, 7, -5};
        System.out.println(Arrays.toString(removeLocalMaxima(input)));
    }
}
