package Java;

import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class Day_2_Removeduplicate {
    public static void main(String[] args) {


        //remove duplicate
        //first way
        String[] sentence = {"A", "A", "B", "B", "C"};
        Set<String> remdup = new TreeSet<>(Arrays.asList(sentence));
        System.out.println(remdup);

        //second way
        String word = "AAABBBCCCCCCDDDDDDEEEEH";
        String[] arr = word.split("");
        Set<String> remdup2 = new TreeSet<>(Arrays.asList(arr));
        System.out.println(remdup2);

        //third way
        String word1 = "AAABBBCCCCCCDDDDDDEEEEHHHHGGKKKLL";
        String result = "";
        for (int i = 0; i < word1.length(); i++) {
            if (!result.contains(word1.substring(i, i + 1))) {
                result += word1.substring(i, i + 1);
            }
            System.out.println(result);


        }
    }

}
