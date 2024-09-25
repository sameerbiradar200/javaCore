package interview_Coding_Questions;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class get3MaxMinNumbers {
    public static void main(String[] args) {
        List<Integer>list= Arrays.asList(45, 12, 56, 15, 24, 75, 31, 89);
        System.out.println("\nOriginal list is \n"+list+"\n");
        System.out.println("\nfirst 3 minimum numbers in list :");
        list.stream().distinct().sorted().limit(3).forEach(System.out::println);

        System.out.println("\nfirst 3 maximum numbers in list:");
        list.stream().distinct().sorted(Comparator.reverseOrder()).limit(3).forEach(System.out::println);



    }
}
