package practice.easy;

public class FactorOfNumber {

    public static void main(String[] args) {
        int number = 15;
        int i = 1;
        while (i <= number) {
            if (number % i == 0) //if number is divisible by i or not to find factor
            {
                System.out.println(i);
            }
            i++;
        }
    }
}