package arrays;
import java.util.Arrays;

public class MergeSortedArray {

    public static void main(String[] args) {

        int[] arr1 = {2, 5, 8, 12};
        int[] arr2 = {3, 6, 9, 10};

        int[] result = merge(arr1, arr2);

        System.out.println(Arrays.toString(result));
    }

    static int[] merge(int[] arr1, int[] arr2) {

        int[] mix = new int[arr1.length + arr2.length];

        int i = 0; // Pointer for arr1
        int j = 0; // Pointer for arr2
        int k = 0; // Pointer for mix

        // Compare elements and add the smaller one
        while (i < arr1.length && j < arr2.length) {

            if (arr1[i] < arr2[j]) {
                mix[k] = arr1[i];
                i++;
            } else {
                mix[k] = arr2[j];
                j++;
            }
            k++;
        }

        // Copy remaining elements of arr1
        while (i < arr1.length) {
            mix[k] = arr1[i];
            i++;
            k++;
        }

        // Copy remaining elements of arr2
        while (j < arr2.length) {
            mix[k] = arr2[j];
            j++;
            k++;
        }

        return mix;
    }
}
