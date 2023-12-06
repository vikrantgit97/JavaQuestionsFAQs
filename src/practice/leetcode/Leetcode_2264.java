package practice.leetcode;

/**
 * @author Vikrant on 04-12-2023
 * @version V1.0
 * @Project JavaQuestionsFAQs
 */
public class Leetcode_2264 {

    public static void main(String[] args) {
        Leetcode_2264 leetcode2264 = new Leetcode_2264();
        System.out.println(leetcode2264.largestGoodInteger("6777133339"));
        System.out.println(leetcode2264.largestGoodInteger("2300019"));
        System.out.println(leetcode2264.largestGoodInteger("42352338"));
    }

    public String largestGoodInteger(String num) {
        String ans = "";
        for (int i = 2; i < num.length(); i++)
            if (num.charAt(i) == num.charAt(i - 1) && num.charAt(i - 1) == num.charAt(i - 2))
                if (num.substring(i - 2, i + 1).compareTo(ans) > 0) // Check if the new one is larger
                    ans = num.substring(i - 2, i + 1);
        return ans;
    }

}
