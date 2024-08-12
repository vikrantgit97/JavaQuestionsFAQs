package practice.easy;

public class InsertMultipleSpaceInString {
    public static void main(String[] args) {
        InsertMultipleSpaceInString test = new InsertMultipleSpaceInString();

        String str = "ERER943483487S3434";
        System.out.println(test.insertSpace(str,4,6));
        System.out.println(test.insertSpace(str,1,5,10));

    }

    public String insertSpace(String str, int ...index) {
        StringBuilder sb = new StringBuilder(str);
        for (int i : index) {
            sb.insert(i," ");
        }
        return sb.toString();

    }
}
