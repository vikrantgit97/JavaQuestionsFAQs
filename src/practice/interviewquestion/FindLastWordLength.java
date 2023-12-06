package practice.interviewquestion;

/**
 * @author Vikrant on 06-12-2023
 * @version V1.0
 * @Project JavaQuestionsFAQs
 */
public class FindLastWordLength {

    public static void main(String[] args) {
        String str ="how are your ";

        // trim string to remove spaces
        str = str.trim();

        // finding last space in the string
        int i = str.lastIndexOf(' ');//used to find index of last space in trimmed string

        // extract substring from last space to end of string
        String lastWord=str.substring(i + 1);

        System.out.println(lastWord.length());
    }
}