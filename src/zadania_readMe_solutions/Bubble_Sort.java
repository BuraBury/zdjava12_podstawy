package zadania_readMe_solutions;

import java.util.Arrays;

public class Bubble_Sort {
    public static void main(String[] args) {

        int[] tab = {2, 0, 4, 10, 3, 1, 5};
        swap(tab);

    }

    private static void swap(int[] arr) {
        int value;

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    value = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = value;
                }
            }
        }
        System.out.println("Posortowana tablica: ");
        System.out.println(Arrays.toString(arr));
    }

}
