public class BinarySearch {

    public static int binarySearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {

            // Find the middle element
            int mid = start + (end - start) / 2;

            if (target < arr[mid]) {
                end = mid - 1;
            }
            else if (target > arr[mid]) {
                start = mid + 1;
            }
            else {
                return mid; // Target found
            }
        }

        return -1; // Target not found
    }

    public static void main(String[] args) {

        int[] arr = {2, 5, 8, 12, 16, 20, 25};
        int target = 16;

        int ans = binarySearch(arr, target);

        if (ans != -1) {
            System.out.println("Element found at index: " + ans);
        } else {
            System.out.println("Element not found.");
        }
    }
}