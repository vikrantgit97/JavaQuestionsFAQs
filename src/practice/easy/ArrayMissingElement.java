package practice.easy;
// find missing number between the sequence
public class ArrayMissingElement {
    public static void main(String[] args) {
        int[] a = { 1, 2, 4, 6, 7, 8 ,9};
        for (int num = 1; num <= a.length; num++) {
            int count = 0;
            for (int j = 0; j < a.length; j++) {
                if (num == a[j]) {
                    count++;
                }
            }
            if (count == 0) {
                System.out.println("Missing element is: " + num);
            }
        }
    }
}
