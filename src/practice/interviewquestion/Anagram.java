import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Anagram {
    public static void main(String[] args) {
        // Given array of strings
        String[] arr = { "eat", "tea", "tan", "ate", "nat", "bat" };

        // Print the result of grouping anagrams
        System.out.println(groupByAnagram(arr));
    }

    // Method to group anagrams from the given array of strings
    private static List<List<String>> groupByAnagram(String[] arr) {
        // Create a map to store anagrams, where the key is the sorted string
        // and the value is a list of anagrams
        Map<String, List<String>> map = new HashMap<>();

        // Iterate through each string in the array
        for (String str : arr) {
            // Convert the string to a character array
            char[] charArray = str.toCharArray();

            // Sort the character array to get a canonical representation of the string
            Arrays.sort(charArray);

            // Convert the sorted character array back to a string
            String sortedString = new String(charArray);

            // Use the sorted string as the key in the map
            // If the key is not present, create a new ArrayList as the value
            // Add the original string to the list
            map.computeIfAbsent(sortedString, key -> new ArrayList<>()).add(str);
        }

        // Return the values (lists of anagrams) as a list
        return new ArrayList<>(map.values());
    }
}
