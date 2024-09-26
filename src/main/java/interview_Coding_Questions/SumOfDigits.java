package interview_Coding_Questions;

import java.util.Arrays;
import java.util.stream.Collectors;

public class SumOfDigits {
    public static void main(String[] args) {
        int a =1213456;
        System.out.println("given int is : "+a);
        int r = Arrays.stream(String.valueOf(a).split("")).mapToInt(Integer::parseInt).sum();
        System.out.println("sum is : "+r);
    }
}
