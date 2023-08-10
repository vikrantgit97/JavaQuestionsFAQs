package com.test.easy;

public class ReverseNumber {
    public static void main(String[] args) {
        int number = 4567;
        int reverse = 0;
        while (number > 0) {
            reverse = reverse * 10;
            reverse = reverse + number % 10;
            number = number / 10;
        }
        System.out.println(reverse);
    }
}
