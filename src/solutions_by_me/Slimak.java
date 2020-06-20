package solutions_by_me;
/*
Snail creeps up the vertical pole of height H feets.
Per day it goes A feets up, and per night it goes B feets down.
In which day the snail will reach the top of the pole?
Input data format On the input the program receives non-negative integers H, A, B,
where H > B and A > B. Every integer does not exceed 100.
 */

public class Slimak {
    public static void main(String[] args) {

        snailWay(100, 10, 5);


    }
    public static void snailWay(int h, int a, int b) {
        int dailySnailWay = a - b;
        int i = (h / dailySnailWay) - 1;
        System.out.println(i);

    }
}
