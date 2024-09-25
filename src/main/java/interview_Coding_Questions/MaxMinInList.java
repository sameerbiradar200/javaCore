package interview_Coding_Questions;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class MaxMinInList {
    public static void main(String[] args) {
        List<Integer>list = Arrays.asList(1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20);
        int max = list.stream().max(Comparator.naturalOrder()).get();
        int min = list.stream().min(Comparator.naturalOrder()).get();

        System.out.println("\nOriginal list is :\n"+list);
        System.out.println("max ix : "+max);
        System.out.println("min ix : "+min);

    }
}
