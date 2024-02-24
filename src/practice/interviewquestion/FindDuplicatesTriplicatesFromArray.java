package practice.interviewquestion;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * @author Vikrant on 15-02-2024
 * @version V1.0
 * @Project JavaQuestionsFAQs
 */
public class FindDuplicatesTriplicatesFromArray {
    public static void main(String[] args) {

        int arr[] = { 5, 5, 1, 1, 1, 6, 6, 0 };

        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }
        System.out.println(map);

        //retrurn element which is duplicate or more than that
        //java 8
        map.entrySet().
                stream().
                    filter(x->x.getValue()>=2).
                        map(Map.Entry::getKey).
                        //to reflect in System.print
                        map(key -> "Modified: " + map.get(key)).
                            forEach(System.out::println);

        //java 7
        Set<Integer> s = map.keySet();
        for (int i : s) {
            if (map.get(i) >= 2) {
                System.out.print(i + " ");
            }
        }

    }
}
