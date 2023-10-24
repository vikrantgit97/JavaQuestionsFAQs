package practice.patterns;

public class Pattern_4 {
    public static void main(String[] args) {
         // step-1 outer for loop for rows & inner for loop for column

        //    *            row 1
        //   * *          row 2
        //  * * *        row 3
        // * * * *      row 4
        //  * * *        row 5
        //   * *          row 6
        //    *            row 7
        pattern(4);
    }

    public static void pattern(int n) {
        for (int row = 1; row <= 2 * n; row++) {
            int spaces=n-(row > n ? 2 * n - row : row);
            // step-2 identify for every row how many column are there
            for (int i = 1;i<= spaces; i++) {
                System.out.print(" ");
            }

            for (int column = 1; column <= (row > n ? 2 * n -row : row); column++) {
                System.out.print("* ");
            }
            // step-3 when new row printed add new line
            System.out.println(" ");
        }
    }
}

