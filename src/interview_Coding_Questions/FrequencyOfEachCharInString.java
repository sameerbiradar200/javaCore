package interview_Coding_Questions;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FrequencyOfEachCharInString {
    public static void main(String[] args) {
        String input="hi i am sameer";

//        Map<Character,Long> charCount = input.chars()
//                        .mapToObj(c->(char)c)
//                                .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));

        Map<Character,Integer> count =new HashMap<>();
        for (char c:input.toCharArray()){

            if (c!=' '&&count.containsKey(c)) { // Skip spaces

                    count.put(c, count.get(c) + 1);

            }
            else {
                count.put(c,1);
            }
        }

//        System.out.println(charCount);
        System.out.println(count);
    }
}
