package practice.easy;

public class ReverseNumber {
    public static void main(String[] args) {
        int number = 4567;
        int reverse = 0;

        while (number > 0) {    // 1 way
            reverse = reverse * 10;
            reverse = reverse + number % 10;
            number = number / 10;
        }
        System.out.println(reverse);

        while (number != 0) {   // 2 way
            int remainder = number % 10;
            reverse = remainder + reverse * 10;
            number = number / 10;
        }
        System.out.println(reverse);
    }
}
