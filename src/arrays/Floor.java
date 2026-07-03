package arrays;

public class Floor {
    static int findFloor(int[] arr, int target) {

        int start = 0;
        int end = arr.length - 1;

        // If target is smaller than the smallest element,
        // then no floor exists.
        if (target < arr[start]) {
            return -1;
        }

        while (start <= end) {

            int mid = start + (end - start) / 2;

            if (target < arr[mid]) {
                end = mid - 1;
            }
            else if (target > arr[mid]) {
                start = mid + 1;
            }
            else {
                return arr[mid]; // Target found
            }
        }

        // end points to the floor
        return arr[end];
    }

    public static void main(String[] args) {

        int[] arr = {2, 5, 8, 12, 16, 20, 25};
        int target = 15;

        int floor = findFloor(arr, target);

        if (floor == -1) {
            System.out.println("Floor does not exist.");
        } else {
            System.out.println("Floor of " + target + " is: " + floor);
        }
    }
}
