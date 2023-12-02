package practice.leetcode;

import java.util.HashSet;
import java.util.Set;

/**
 * @author Vikrant on 30-11-2023
 * @version V1.0
 * @Project JavaQuestionsFAQs
 */

/*                3. Longest Substring Without Repeating Characters


Given a string s, find the length of the longest substring without repeating characters.

Example 1:

Input: s = "abcabcbb"
Output: 3
Explanation: The answer is "abc", with the length of 3.
Example 2:

Input: s = "bbbbb"
Output: 1
Explanation: The answer is "b", with the length of 1.
Example 3:

Input: s = "pwwkew"
Output: 3
Explanation: The answer is "wke", with the length of 3.
Notice that the answer must be a substring, "pwke" is a subsequence and not a substring.


Constraints:

0 <= s.length <= 5 * 104
s consists of English letters, digits, symbols and spaces.*/
public class Leetcode_3 {
    public static void main(String[] args) {

        String str = "pwwkew";

        Set<Character> set = new HashSet<>();

        for (int i = 0; i < str.length(); i++) {
            set.add(str.charAt(i));
        }
        System.out.println(set.size());
        System.out.println(lengthOfLongestSubstring(str));
        System.out.println(lengthOfLongestSubstrings(str));
    }


    // Original Output
    static int lengthOfLongestSubstring(String s) {
        Set<Character> set = new HashSet<>();
        int maxLength = 0, i = 0, j = 0;
        while (j < s.length()) {
            if (!set.contains(s.charAt(j))) {
                set.add(s.charAt(j++));
                maxLength = Math.max(maxLength, set.size());
            } else {
                set.remove(s.charAt(i++));
            }
        }
        return maxLength;
    }

    public static int lengthOfLongestSubstrings(String s) {
        int n = s.length(), left = 0, length = 0;
        boolean[] appeared = new boolean[128];
        char[] str = s.toCharArray();
        for (int i = 0; i < n; i++) {
            if (appeared[str[i]]) {
                while (str[left] != str[i]) appeared[str[left++]] = false;
                left++;
            } else {
                appeared[str[i]] = true;
            }
            length = Math.max(length, i - left + 1);
        }
        return length;
    }
}
