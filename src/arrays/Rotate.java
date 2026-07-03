package arrays;
import java.util.Arrays;

public class Rotate {

    static void rotate(int[] arr, int k) {

        int n = arr.length;
        k = k % n;

        int[] temp = new int[n];

        for (int i = 0; i < n; i++) {
            temp[(i + k) % n] = arr[i];
        }

        for (int i = 0; i < n; i++) {
            arr[i] = temp[i];
        }
    }

    public static void main(String[] args) {

        int[] arr = {1,2,3,4,5,6,7};

        rotate(arr,3);

        System.out.println(Arrays.toString(arr));
    }
}
