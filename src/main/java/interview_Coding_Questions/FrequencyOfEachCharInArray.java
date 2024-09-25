package interview_Coding_Questions;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FrequencyOfEachCharInArray {
    public static void main(String[] args) {

        List<Integer> arr = Arrays.asList(1,2,3,4,5,62,4,1,0,9,8,7,6,8,3,2,1);
        Map<Integer, Long> fre = arr.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));

        System.out.println(fre);

        System.out.println("another method");

        List<Integer> array = Arrays.asList(1,2,3,4,5,62,4,1,0,9,8,7,6,8,3,2,1);
        Map<Integer,Integer> m =new HashMap<>();
        for (int a:array){
            System.out.println(a);
        }

        System.out.println(m);

    }
}
