package solutions_ReadMe_Exercises;

import java.util.Arrays;

public class Bubble_Sort {
    public static void main(String[] args) {

        int[] test = {2, 15, 4, 10, 3, 1, 5};
        boobleSort(test);
    }

    private static void swap(int[] arr, int indexLeft, int indexRight) {
        int left = arr[indexLeft];
        int right = arr[indexRight];

        if (left > right) {
            arr[indexLeft] = right;
            arr[indexRight] = left;
        }
    }

    private static void boobleSort(int[] arr) {
    // int value;
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1; j++) {

                int left = j;
                int right = j + 1;

                if (arr[left] > arr[right]) {
//                    value = arr[left];
//                    arr[left] = arr[right];
//                    arr[right] = value;
                    swap(arr, left, right);
                }
            }
        }
        System.out.println("Posortowana tablica: ");
        System.out.println(Arrays.toString(arr));
    }

}
