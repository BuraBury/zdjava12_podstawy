package solutions_ReadMe_Exercises;

import java.math.BigInteger;

public class Zadanie1_Silnia {
    public static void main(String[] args) {
//        BigInteger one = new BigInteger("1");
//        BigInteger two = new BigInteger("2");
//
//        BigInteger product = one.multiply(two);
//        BigInteger divided = one.divide(two);
//        BigInteger sum = one.add(two);
//        BigInteger difference = one.subtract(two);
//        BigInteger acumulator = new BigInteger("1");
//
//        BigInteger test = new BigInteger("10");
//
//        System.out.println(bigPowerWhile(test));

        BigInteger x = new BigInteger("10");
        System.out.println(powerRecurent(x));


    }

    static BigInteger powerRecurent(BigInteger n) {
        BigInteger one = new BigInteger("1");
        return n.equals(one) ? one : powerRecurent(n.subtract(one)).multiply(n);
    }


    static long power(int n) {

        long acumulator = 1;

        for (int i = 1; i <= n; i++) {
            acumulator *= i;
        }
        return acumulator;
    }

    static BigInteger bigPower(BigInteger n) {
        BigInteger acumulator = new BigInteger("1");

        //petla for
        int o = n.intValue();
        for (int i = 1; i <= o; i++) {
            acumulator = acumulator.multiply(n);
        }

        return acumulator;
    }

    static BigInteger bigPowerWhile(BigInteger n) {
        BigInteger acumulator = new BigInteger("1");

        BigInteger i = new BigInteger("1");

        while (i.compareTo(n) <= 0) {
            acumulator = acumulator.multiply(i);
            i = i.add(new BigInteger("1")); // i++;
        }
        return acumulator;
    }


    static void minInteger(BigInteger a, BigInteger b) {
        int i = a.compareTo(b);
        if (i < 0) {
            System.out.println("a < b");
        } else if (i > 0) {
            System.out.println("a > b");
        } else {
            System.out.println("a == b");
        }
    }
}
