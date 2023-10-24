package practice.easy;

public class Factorial {
    public static void main(String[] args) {
        int num = 5, Factorial = 1;
        for (int i = 1; i<= num; i++) {
            Factorial = Factorial * i;
        }
        System.out.println(Factorial);
    }
}
