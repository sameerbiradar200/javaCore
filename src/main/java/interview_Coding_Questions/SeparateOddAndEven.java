package interview_Coding_Questions;

import javax.xml.transform.Source;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class SeparateOddAndEven {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        for (int i=0; i<=20;i++){
            list.add(i);
        }
        System.out.println("original list is :\n"+list);

        Map<Boolean,List<Integer>> oddEven = list.stream().collect(Collectors.partitioningBy(i->i%2==0));

        List<Integer> even =oddEven.get(true);
        List<Integer> odd =oddEven.get(false);

        System.out.println("list of even numbers\n"+even);
        System.out.println("list of odd numbers\n"+odd);



    }
}
