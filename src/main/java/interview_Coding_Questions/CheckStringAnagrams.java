package interview_Coding_Questions;

import java.util.Objects;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CheckStringAnagrams {
    static String r;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String c;

        do {
            System.out.println("enter string 1 :");
            String a = scanner.next();
            System.out.println("enter string 1 :");
            String b = scanner.next();
            String result = isAnagram(a, b);
            System.out.println(result);
            System.out.println("do you want to continue : (y/n)");
            c = scanner.next();


        } while (!Objects.equals(c, "n"));


    }
    public  static String isAnagram(String a,String b){
        a= Stream.of(a.split("")).map(String::toUpperCase).sorted().collect(Collectors.joining());
        b= Stream.of(b.split("")).map(String::toUpperCase).sorted().collect(Collectors.joining());
        if (a.equals(b)){
           r= "this is anagram";
        }else {
            r="this is not anagram";
        }
        return r;
    }
}
