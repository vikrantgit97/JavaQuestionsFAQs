package practice.java8;

import java.util.Arrays;
import java.util.List;
/**
 * @author Vikrant on 16-02-2024
 * @version V1.0
 * @Project JavaQuestionsFAQs
 */
public class ReturnSpecificNoOfRecordsFromList {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList(
                "Chennai", "Bangalore", "Bangalore", "Mumbai", "Bangalore", "Delhi",
                "Hyderabad", "Chennai", "Mumbai", "Chennai", "Mumbai"
        );

        strings.stream()
                .filter(x -> x.contains("Bangalore") || x.contains("Chennai"))
                .limit(2)
                .forEach(System.out::println);

        strings.stream()
                .filter(x -> x.startsWith("M"))
                .map(x-> x + " ")       // Concatenate a space after each name
                .forEach(System.out::print);

    }
}
