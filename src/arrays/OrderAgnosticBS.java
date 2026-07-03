package arrays;

public class OrderAgnosticBS {

    static int binarySearch(int[] arr, int target) {

        int start = 0;
        int end = arr.length - 1;

        // Check the order of the array
        boolean isAscending = arr[start] < arr[end];

        while (start <= end) {

            int mid = start + (end - start) / 2;

            if (arr[mid] == target) {
                return mid;
            }

            if (isAscending) {

                // Ascending Order
                if (target < arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }

            } else {

                // Descending Order
                if (target < arr[mid]) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }
        }

        return -1;
    }

    public static void main(String[] args) {

        int[] arr = {25, 20, 16, 12, 8, 5, 2};
        int target = 12;

        int ans = binarySearch(arr, target);

        System.out.println("Index = " + ans);
    }
}

