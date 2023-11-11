package practice.interviewquestion;

import java.util.Comparator;
import java.util.List;

/**
 * @author Vikrant on 11-11-2023
 * @version V1.0
 * @Project JavaQuestionsFAQs
 */
public class SortListOfStringByLength {

    public static void main(String[] args) {
        List<String> list = List.of("apple","banana","grapes","mango","pomegranate");

        list.stream().sorted(Comparator.comparing(String::length)).
                toList().      //collect(Collectors.toList())
                forEach(System.out::println);
    }
}
