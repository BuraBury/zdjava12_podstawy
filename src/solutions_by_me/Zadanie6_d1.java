package solutions_by_me;

import java.util.ArrayList;

public class Zadanie6_d1 {
    public static void main(String[] args) {

        ArrayList<Integer> arrayList = new ArrayList<>();

        arrayList.add(19);
        arrayList.add(21);
        arrayList.add(-3);
        arrayList.add(-4);
        arrayList.add(-10);

        System.out.println(getMinus(arrayList));


//        Integer integer = arrayList.get(0);
//
//        System.out.println(integer);
//
//        boolean isEmpty = arrayList.isEmpty();
//        System.out.println(isEmpty);
//        Integer remove = arrayList.remove(2);
//
//        System.out.println(arrayList);

    }

    public static ArrayList<Integer> getMinus(ArrayList<Integer> array) {
        ArrayList<Integer> newList = new ArrayList<>();

        for (Integer integer : array) {
            if (integer < 0) {
                newList.add(integer);
            }
        }

        return newList;
    }
}
