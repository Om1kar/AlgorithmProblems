package AlgorithmProblems;

import java.util.Arrays;
import java.util.Scanner;

public class Anagram {
    /*
    method is created to check the given string is Anagram or not
    */
    static void checkAnagramOrNot(String s1, String s2) {
    /*
     to check whether the length of two strings are equal
    */
        if (s1.length() == s2.length()) {
        /*
         to convert string to Array
        */
            char[] arr1 = s1.toCharArray();
            char[] arr2 = s2.toCharArray();

            Arrays.sort(arr1);
            Arrays.sort(arr2);
            boolean result = Arrays.equals(arr1, arr2);
            if (result) {
                System.out.println(s1 + " & " + s2 + " Are Anagram");

            } else {
                System.out.println("Not an Anagram");
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first String");
        String s1 = sc.nextLine();
        System.out.println("Enter second String ");
        String s2 = sc.nextLine();
        checkAnagramOrNot(s1, s2);
    }
}
