package arrays;

public class CeilingOfNumber {
    static int findCeiling(int[] arr, int target){
        int start = 0;
        int end = arr.length -1;

        if(target > arr[end]){
            return -1;
        }
        while(start <= end){
            int mid = start + (end - start)/ 2;
            if(target < arr[mid]{
                end = mid -1;
            }
            else if (target > arr[mid]){
                start = mid + 1;
            }
            else {
                return arr[mid];
            }
        }
        return arr[start];
    }
}
public static void main(String[] args) {

    int[] arr = {2, 5, 8, 12, 16, 20, 25};
    int target = 15;

    int ceiling = findCeiling(arr, target);

    if (ceiling == -1) {
        System.out.println("Ceiling does not exist.");
    } else {
        System.out.println("Ceiling of " + target + " is: " + ceiling);
    }
}
}
