package solutions_by_me;

import java.util.Arrays;

public class Bubble_Sort {
    public static void main(String[] args) {

        String z = "1000";
        int[] test = {300, -2, 0, 65, 34, 2, 1, 2, Integer.parseInt(z)};
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

                int right = j + 1;

                if (arr[j] > arr[right]) {
//                    value = arr[left];
//                    arr[left] = arr[right];
//                    arr[right] = value;
                    swap(arr, j, right);
                }
            }
        }
        System.out.println("Posortowana tablica: ");
        System.out.println(Arrays.toString(arr));
    }

}
