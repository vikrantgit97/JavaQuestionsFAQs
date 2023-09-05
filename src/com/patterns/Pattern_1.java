package com.patterns;

public class Pattern_1 {

    public static void main(String[] args) {
        // step-1 outer for loop for rows & inner for loop for column

        //          * * * *             row 1
        //          * * * *             row 2
        //          * * * *             row 3
        //          * * * *             row 4
        pattern(4);
    }

    public static void pattern(int n) {
        for (int row = 1; row <= n; row++) {
            // step-2 identify for every row how many column are there
            for (int column = 1; column <= n; column++) {
                System.out.print(" * ");
            }
            // step-3 when new row printed add new line
            System.out.println();
        }
    }
}
