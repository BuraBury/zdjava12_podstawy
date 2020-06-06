package solutions_ReadMe_Exercises;

import java.awt.font.ShapeGraphicAttribute;
import java.util.Scanner;

public class CzyPalindrom {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String txt = scanner.next();
        char[] tab = txt.toCharArray();

        System.out.println(isPalindrom(tab));

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
