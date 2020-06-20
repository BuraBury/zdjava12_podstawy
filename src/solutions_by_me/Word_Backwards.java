package solutions_by_me;

import java.util.Scanner;

public class Word_Backwards {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String word = scanner.next();

        char[] wordToArray = word.toCharArray();
        wordBackward(wordToArray);
    }

    private static void wordBackward(char[] arr) {
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i]);
        }
    }
}
