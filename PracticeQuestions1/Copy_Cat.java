package PracticeQuestions1;

import java.util.*;

public class Copy_Cat {
    public static void main(String[] args) {
    /*
        i/p ==> s1 = ABC, s2 = BAC
        o/p ==> 1 (since copied)
        i/p ==> s1 = DAC, s2 = DAC
        o/p ==> 0 (not copied)
     */
        Scanner sc = new Scanner(System.in);
        String s1 = sc.next();
        String s2 = sc.next();

        s1 = s1.toUpperCase();
        s2 = s2.toUpperCase();

        char arr1[] = s1.toCharArray();
        Arrays.sort(arr1);

        char arr2[] = s2.toCharArray();
        Arrays.sort(arr2);

        String res1 = new String(arr1);
        String res2 = new String(arr2);

        if(res1.equals(res2)) {
            System.out.println("1");
        } else {
            System.out.println("0");
        }
    }
}
