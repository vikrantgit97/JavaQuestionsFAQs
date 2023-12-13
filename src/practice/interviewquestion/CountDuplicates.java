package practice.interviewquestion;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * @author Vikrant on 12-12-2023
 * @version V1.0
 * @Project JavaQuestionsFAQs
 */
public class CountDuplicates {
    public static void main(String[] args) {
        List<String> list = List.of("apple", "facebook", "whatsApp",
                "facebook", "whatsApp");

        Map<String, Long> collect = list.stream().collect(
                        Collectors.groupingBy(String::toString, Collectors.counting())).
                entrySet().stream().filter(entry -> entry.getValue() > 1).
                collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));

        collect.forEach((k, v) -> System.out.println("duplicates key " + k + " & values " + v));

    }
}
