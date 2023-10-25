package practice.interviewquestion;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Vikrant on 24-10-2023
 * @version V1.0
 * @Project JavaQuestionsFAQs
 */

//Question------------->input = "aabbbcc"       output = "a2b3c2"
public class CountCharString {
    public static void main(String[] args) {

        String str = "aabbbcc";
        StringBuilder result = new StringBuilder();

        //1. count the frequency of every element
        Map<Character, Integer> charFrequencyMap = new HashMap<>();

        for (int i=0;i<str.length();i++) {
            char ch=str.charAt(i);
            if (charFrequencyMap.containsKey(ch)) {
                //2. here get() method is giving PREVIOUS record(COUNT value) for given key
                //   this count is being incremented by 1 for its repeated occurrence
                charFrequencyMap.put(ch, charFrequencyMap.get(ch) + 1);
            } else {
                charFrequencyMap.put(ch, 1);
            }
        }

        //3. append the count after respective char Build the result string
        charFrequencyMap.forEach((key, value) -> result.append(key).append(value));

        System.out.println(result);



        /*for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(charaFrequencyMap.containsKey(ch)){
                charaFrequencyMap.put(ch,charaFrequencyMap.get(ch)+1);
            }else {
                charaFrequencyMap.put(ch,1);
            }
        }
        System.out.println(charaFrequencyMap);*/
    }
}