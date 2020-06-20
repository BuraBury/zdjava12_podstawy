package solutions_by_me;

import java.util.ArrayList;

public class Zadanie7_d1 {

    private static ArrayList<Integer> createSequence(int start, int diff, int end) {
        //10, 2, 20 ==> 10, 12, 14, 16, 18, 20
        ArrayList<Integer> tab = new ArrayList<>();

        int actualElement = start;

        while (actualElement <= end) {
            tab.add(actualElement);
            actualElement += diff;
        }
        return tab;
    }

    static boolean isArithmeticSequence(ArrayList<Integer> sequence) {
        //todo dokoncz te metode

        return false;
    }

    public static void main(String[] args) {

        System.out.println(createSequence(2, 2, 20));

    }

}
