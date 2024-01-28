package practice.cloudtech;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Question_1 {
    public static void main(String[] args) {

        // find the elements from given list which starts with same character & ends with same character
        List<String> strings = Arrays.asList("ab", "aba", "xyx", "mno", "xyz", "pop");
        strings.stream().filter(s -> s.length() > 0 && s.endsWith(String.valueOf(s.charAt(0))))
                .forEach(System.out::println);
        System.out.println("-------------------------------------");

        // count the no of 0 & 1 present in the array
        List<Integer> numbers = Arrays.asList(0, 1, 1, 0, 1, 1, 1, 0, 0);
        Integer sum = numbers.stream().reduce(0, Integer::sum);
        System.out.println("no of 1 are " + sum);
        System.out.println("no of 0 are " + (numbers.size() - sum));
        System.out.println("------------------------------------");

        // print the palindrome word from string (sentence)
        String str = "hello I have tot go non malyalam";
        String strArr[] = str.split(" ");
        for (int i = 0; i < strArr.length; i++) {
            String original = strArr[i];
            String revString = "";
            for (int j = original.length() - 1; j >= 0; j--) {
                revString = revString + original.charAt(j);
                if (original.equals(revString)) {
                    System.out.println(revString);
                }
            }
        }
        System.out.println("------------------------------------");

        // print 0 to 100 without using numbers
        int one = 'b' / 'b';
        int ten = "**********".length();
        for (int i = one; i <= ten * ten; i++) {
            System.out.println(i + " ");
        }
        System.out.println("------------------------------------");

        //print duplicate elements from array
        List<Integer> array = Arrays.asList(10, 20, 30, 30, 40, 50, 50);
        Set<Integer> duplicate = new HashSet<>();
        //java 7 approach
		/*for(Integer list:array) {
			if(!duplicate.add(list))
				System.out.println(list);
		}
		System.out.println("------------------------------------");*/
        //java 8 approach
        array.stream().filter(s -> (!duplicate.add(s))).forEach(System.out::println);
    }
}
