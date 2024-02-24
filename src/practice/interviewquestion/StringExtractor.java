package practice.interviewquestion;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringExtractor {
    public static void main(String[] args) {
        String input = "3a2bc1ad"; // & output shold be "aaabcbcad"
        extractAndRepeatCharacters(input);
        extractAndRepeatCharacters1(input);
        removeChars(input);
        removeDigits(input);
    }

    public static void extractAndRepeatCharacters(String input) {

        Pattern pattern = Pattern.compile("(\\d+)([a-zA-Z]+)");
        Matcher matcher = pattern.matcher(input);
        StringBuilder result = new StringBuilder();

        while (matcher.find()) {
            int count = Integer.parseInt(matcher.group(1));
            String characters = matcher.group(2);
            // Append the character 'count' times
            for (int i = 0; i < count; i++) {
                result.append(characters);
            }
        }
        System.out.println(result);
    }

    public static void extractAndRepeatCharacters1(String input) {
        Pattern pattern = Pattern.compile("(\\d+)([a-zA-Z]+)");
        Matcher matcher = pattern.matcher(input);
        StringBuilder result = new StringBuilder();

        while (matcher.find()) {
            int count = Integer.parseInt(matcher.group(1));
            String characters = matcher.group(2);
            // Multiply count for each character
            result.append(characters.repeat(Math.max(0, count)));
        }
        System.out.println(result);
    }

    public static void removeChars(String input) {

        Pattern pattern = Pattern.compile("(\\d+)([a-zA-Z])");
        Matcher matcher = pattern.matcher(input);

        StringBuilder result = new StringBuilder();

        while (matcher.find()) {
            int count = Integer.parseInt(matcher.group(1));
            // Accumulate the counts
            result.append(count);
        }

        System.out.print(result);
    }


    public static void removeDigits(String input) {

        Pattern pattern = Pattern.compile("(\\d+)([a-zA-Z])");
        Matcher matcher = pattern.matcher(input);

        StringBuilder result = new StringBuilder();

        while (matcher.find()) {
            int count = Integer.parseInt(matcher.group(1));
            String character = matcher.group(2);
            for (int i = 0; i < count; i++) {
                result.append(character);
            }
        }

        System.out.println(result);
    }

}