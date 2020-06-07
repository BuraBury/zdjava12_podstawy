package solutions_ReadMe_Exercises;

import java.util.Arrays;
import java.util.Scanner;

public class SitoErastotenesa {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        int[] array = new int[number + 2];
        for (int i = 0; i <= number; i++) {
            array[i] = i;
        }

        getPrimeNumbers(array);
        showArray(array);

    }

    public static void getPrimeNumbers(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] % 2 == 0 && arr[i] != 2) {
                arr[i] = 0;
            }
            if (arr[i] % 3 == 0 && arr[i] != 3) {
                arr[i] = 0;
            }
            if (arr[i] % 5 == 0 && arr[i] != 5) {
                arr[i] = 0;
            }
            if (arr[i] % 7 == 0 && arr[i] != 7) {
                arr[i] = 0;
            }
            if (arr[i] % 8 == 0) {
                arr[i] = 0;
            }
            if (arr[i] % 9 == 0) {
                arr[i] = 0;
            }
        }
    }

    public static void showArray(int[] arr) {
        for (int i = 2; i < arr.length; i++) {
            if (arr[i] == 0) {
                continue;
            } else {
                System.out.print(arr[i] + " ");
            }
        }
    }
}


