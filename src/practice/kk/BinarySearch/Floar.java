package practice.kk.BinarySearch;

public class Floar {

    public static void main(String[] args) {
        int arr[] = { 2, 3, 5, 9, 14, 16, 18 };
        System.out.println(floar(arr, 15));
    }
/**
 * Q. find greatest element in array <= target 
 * @param arr
 * @param target
 * @return the index
 */
    public static int floar(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
 
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                return mid;
            }
        }
        return end;
    }
}
