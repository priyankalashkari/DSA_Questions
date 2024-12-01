package PracticeQuestions1;

public class LinearSearchUsingRecursion {
    static boolean linearSearch(int arr[], int startIndex, int key) {
        if(startIndex >= arr.length) {
            return false;
        }
        if(arr[startIndex] == key) {
            return true;
        }

        return linearSearch(arr, startIndex + 1, key);
    }
    public static void main(String[] args) {
        int arr[] = {4, 3, 6, 2, 7};
        int key = 4;
        boolean ans = linearSearch(arr, 0, key);
        if(ans) {
            System.out.println("found");
        }
        else {
            System.out.println("not found");
        }
    }
}
