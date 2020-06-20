package solutions_by_me;

public class Zadanie4_ArraysPointer {
    public static void main(String[] args) {

        int[] tab = {1, 2, 3, 4, 5, 6, 7};

        funnyShowArray(tab);

    }

    private static void funnyShowArray(int[] array) {
        int start = 0;
        int end = array.length - 1;

        while (start < end) {
            System.out.println(array[start]);
            System.out.println(array[end]);
            start++;
            end--;
        }

    }
}
