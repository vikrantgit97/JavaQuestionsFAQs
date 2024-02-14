package practice.interviewquestion;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SumOfNumFromString {
    public static void main(String[] args) {
        String str = "table45not55of45out";

        System.out.println(sumOfNumbersPresentInString(str));

        System.out.println("Sum of occurrences: " + sumOccurrences(str, "45"));

        System.out.println("extractSubstrings: " + extractSubstrings(str, "45", "55"));
    }

    private static int sumOfNumbersPresentInString(String input) {
        int sum = 0;
        // define the pattern to match digits
        Pattern pattern = Pattern.compile("\\d+");
        // create a matcher to find in the input string
        Matcher matcher = pattern.matcher(input);
        while (matcher.find()) {
            sum += Integer.parseInt(matcher.group());
        }
        return sum;
    }

    private static int sumOccurrences(String input, String target) {
        int sum = 0;
        int index = input.indexOf(target);
        // System.out.println(index);

        while (index != -1) {
            // Extract the substring "45"
            String occurrence = input.substring(index, index + target.length());
            // Convert the substring to an integer and add it to the sum
            sum += Integer.parseInt(occurrence);
            // Move to the next occurrence, if any
            index = input.indexOf(target, index + 1);
        }
        return sum;
    }

    private static int extractSubstrings(String input, String... targets) {
        int sum = 0;
        List<String> result = new ArrayList<>();
        for (String target : targets) {
            int index = input.indexOf(target);
            while (index != -1) {
                // Extract the substring
                String occurrence = input.substring(index, index + target.length());
                // Add the substring to the result list
                result.add(occurrence);
                sum += Integer.parseInt(occurrence);
                // Move to the next occurrence, if any
                index = input.indexOf(target, index + 1);
            }
        }
        return sum;
    }
}