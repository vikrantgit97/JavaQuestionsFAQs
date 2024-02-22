package practice.kk.BinarySearch;

public class Ceiling {
    public static void main(String[] args) {
        int arr[] = { 2, 3, 5, 9, 14, 16, 18 };
        System.out.println(ceiling(arr, 15));
    }

    //time compexity is O(log(n))
    /**
     * Q.find smallest element in array >= target
     * 
     * @param arr
     * @param target
     * @return
     */
    public static int ceiling(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        // what if the target is greater than the gretest no in the array
        if (target > arr[arr.length - 1]) {
            return -1;
        }
        while (start <= end) {
            // find the middle elment
            int mid = start + (end - start) / 2;

            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                return mid;
            }
        }
        return start;
    }
}
