package interview_Coding_Questions;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Merge_Two_Unsorted_Array {
    public static void main(String[] args) {
        // How do you merge two unsorted arrays into single sorted array using Java 8 streams?

        int[] a =new int[]{11,23,43};
        int[] b =new int[]{99,78,1,2};

        System.out.println("\noriginal array a is :\n"+Arrays.toString(a));
        System.out.println("\noriginal array b is :\n"+Arrays.toString(b));


        int[] c = IntStream.concat(Arrays.stream(a),Arrays.stream(b)).sorted().toArray();

        System.out.println("\n\nafter merging two array : "+Arrays.toString(c));

    }
}
