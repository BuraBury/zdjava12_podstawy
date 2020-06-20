package solutions_by_me;

import java.util.Scanner;

public class Is_Palindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String numberTxt = scanner.next();
        char[] numberToArray = numberTxt.toCharArray();

        System.out.println(isPalindrom(numberToArray));

    }

    private static boolean isPalindrom(char[] array) {

        int i = 0;
        int j = array.length - 1;

        while (j > i) {
            if (array[i] != array[j]) {
                return false;
            }
            ++i;
            --j;
        }
        return true;
    }
}
