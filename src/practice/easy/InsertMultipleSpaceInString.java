package practice.easy;

public class InsertMultipleSpaceInString {
    public static void main(String[] args) {
        InsertMultipleSpaceInString test = new InsertMultipleSpaceInString();

        String str = "ERER943483487S3434";
        System.out.println(test.insertSpace(str,4,6));

    }

    public String insertSpace(String str, int ...index) {
        StringBuilder sb = new StringBuilder();
        for (int i : index) {
            sb.insert(i,str);
        }
        return sb.toString();
    }
}
