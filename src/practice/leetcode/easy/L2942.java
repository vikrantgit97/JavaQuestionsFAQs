package practice.leetcode.easy;


import java.util.ArrayList;
import java.util.List;

/*
https://leetcode.com/problems/find-words-containing-character/description/

2942. Find Words Containing Character

You are given a 0-indexed array of strings words and a character x.

Return an array of indices representing the words that contain the character x.

Note that the returned array may be in any order.



Example 1:

Input: words = ["leet","code"], x = "e"
Output: [0,1]
Explanation: "e" occurs in both words: "leet", and "code". Hence, we return indices 0 and 1.
Example 2:

Input: words = ["abc","bcd","aaaa","cbc"], x = "a"
Output: [0,2]
Explanation: "a" occurs in "abc", and "aaaa". Hence, we return indices 0 and 2.
Example 3:

Input: words = ["abc","bcd","aaaa","cbc"], x = "z"
Output: []
Explanation: "z" does not occur in any of the words. Hence, we return an empty array.
*/
public class L2942 {
    public static void main(String[] args) {
        String [] words = {"abc","bcd","aaaa","cbc"};
        char x = 'c';

        L2942 l2942 = new L2942();
        System.out.println(l2942.findWordsContaining(words, x));
        System.out.println(l2942.findWordsContaining2(words, x));

    }

    public List<Integer> findWordsContaining(String[] words, char x) {
        List<Integer> ans = new ArrayList<>();
        for (int i = 0; i < words.length; ++i) {
            // x is found, indexOf returns the index of number; if x is not found, then returns -1
            if (words[i].indexOf(x) != -1) {
                ans.add(i);
            }
        }
        return ans;
    }


    public List<Integer> findWordsContaining2(String[] words, char x) {
        List<Integer> ans = new ArrayList<>();
        for (int i = 0; i < words.length; ++i) {
            if (words[i].contains(String.valueOf(x))) {
                ans.add(i);
            }
        }
        return ans;
    }
}
