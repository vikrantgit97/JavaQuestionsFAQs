package practice.easy;

public class ReverseString {
    public static void main(String[] args) {

        // 1 way
        String name = "brock";
        String reverse = "";
        char letters;
        for (int i = name.length() - 1; i >= 0; i--) {
            letters = name.charAt(i);
            reverse = reverse + letters;
        }
        System.out.println(reverse);

        // 2 way
        String name1 = "brock";
        StringBuilder reverse1 = new StringBuilder();
        char letters1;
        for (int i = name1.length() - 1; i >= 0; i--) {
            letters1 = name1.charAt(i);
            reverse1.append(letters1);
        }
        System.out.println(reverse1);

    }
}