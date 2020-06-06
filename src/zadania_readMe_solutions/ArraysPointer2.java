package zadania_readMe_solutions;

public class ArraysPointer2 {
    public static void main(String[] args) {
        int array[] = {1, 2, 3, 4, 5, 6, 7};
        funnyArray(array);

    }

    private static void funnyArray(int[] tab) {
        int start = 0;
        int second = 1;
        int sum;

        while (second <= (tab.length - 1)) {
            sum = tab[start] + tab[second];
            start++;
            second++;
            System.out.println(sum);
        }


    }
}
