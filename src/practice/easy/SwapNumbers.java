package practice.easy;

public class SwapNumbers {
    public static void main(String[] args) {
        int a = 78, b = 51;
        System.out.println("Before swapping -> " + " a : " + a + " & b : " + b);
        int temp = a;
        a = b;
        b = temp;
        System.out.println("After swapping -> " + " a : " + a + " & b : " + b);
    }
}