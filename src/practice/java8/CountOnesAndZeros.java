package practice.java8;

import java.util.Arrays;

public class CountOnesAndZeros {

    public static void main(String[] args) {
        int[] arr = { 1, 0, 1, 0, 1, 0, 0, 0, 0, 0, 1 };
        long oneCount = Arrays.stream(arr).filter(x -> x == 1).count();
        long zeroCount = Arrays.stream(arr).filter(x -> x == 0).count();
        System.out.print("count of 1 : " + oneCount + "\ncount of 0 : " + zeroCount);
    }
}
