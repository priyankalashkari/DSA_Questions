package Capgemini;

import java.util.Scanner;

public class CountChar {
//    Input : aabbbbeeeeffggg // Output: a2b4e4f2g3
//    Input : abbccccc // Output: ab2c5
    public static int count(String str, int n) {
        int count=0;
        for(int i=0; i<n; i++) {
            if(str.charAt(i) == str.charAt(i+1)) {
                count++;
            }
        }
        System.out.println();
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        int len = a.length();
        count(a, len);
    }
}
