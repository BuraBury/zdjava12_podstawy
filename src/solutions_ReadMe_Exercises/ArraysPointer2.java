package solutions_ReadMe_Exercises;
//sumowanie kolejnych par cyfr w tablicy

public class ArraysPointer2 {
    public static void main(String[] args) {
        int array[] = {1, 2, 3, 4, 5, 6, 7, 8};
        printPairSum(array);
    }

    private static void printPairSum(int[] arr) {
        int left = 0;
        int right = 1;
        if (arr.length % 2 == 0 && arr.length > 1) {

            while (right < arr.length) {
                System.out.println(arr[left] + arr[right]);

                left += 2;
                right += 2;
            }

        } else {
            System.out.println("Nieprawidłowa tablica");
        }
    }
}
