package arrays;

public class LinearSearch {

    public static int linearSearch(int[] arr, int target) {

        // Traverse the entire array
        for (int i = 0; i < arr.length; i++) {

            if (arr[i] == target) {
                return i; // Element found
            }
        }

        return -1; // Element not found
    }

    public static void main(String[] args) {

        int[] arr = {12, 45, 7, 89, 23, 56};
        int target = 23;

        int ans = linearSearch(arr, target);

        if (ans != -1) {
            System.out.println("Element found at index: " + ans);
        } else {
            System.out.println("Element not found.");
        }
    }
}
