package practice.patterns;


public class ColumnRows {
    public static void main(String[] args) {

        // step-1 outer for loop for rows & inner for loop for column

        //              *                    row 1
        //              * *                  row 2
        //              * * *                row 3
        //              * * * *              row 4

        for (int row = 1; row <= 4; row++) {
            // step-2 identify for every row how many column are there
            for (int column = 1; column <= row; column++) {
                System.out.print(" * ");
            }
            // step-3 when new row printed add new line
            System.out.println();
        }
    }
}