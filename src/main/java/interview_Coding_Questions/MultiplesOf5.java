package interview_Coding_Questions;

import java.util.Arrays;
import java.util.List;

public class MultiplesOf5 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(14,15,16,4,5,10,55,550,789,43,23);
        System.out.println("original list\n"+list);
        System.out.println();
        System.out.println("list of number are divalent by 5");
        list.stream().filter(n->n%5==0).forEach(System.out::println);
    }
}
