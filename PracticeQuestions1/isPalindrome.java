package PracticeQuestions1;

public class isPalindrome {
    static boolean Palindrome(String str, int left, int right) {
        if(left >= right) {
            return true;
        }
        if(str.charAt(left) != str.charAt(right)) {
            return false;
        }
        return Palindrome(str, left+1, right-1);
    }
    public static void main(String[] args) {
        String str = "Naman";
        str = str.toUpperCase();
        System.out.println(Palindrome(str, 0, str.length()-1));
    }
}
