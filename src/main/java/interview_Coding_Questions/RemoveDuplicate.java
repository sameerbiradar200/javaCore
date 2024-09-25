package interview_Coding_Questions;

import javax.xml.transform.Source;
import java.util.Arrays;
import java.util.List;

public class RemoveDuplicate {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("sameer","rahee","ram","max","sam","ram","max","sameer","rahee","om");

        System.out.println("original list :\n"+names);

        List<String> removeDuplicate =names.stream().distinct().toList();

        System.out.println("after removing  :\n"+removeDuplicate);
    }
}
