package solutions_ReadMe_Exercises;

import java.math.BigInteger;
import java.util.Objects;
import java.util.Scanner;

public class KalkulatorBigInteger {

    public static void menu() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input numbers:");
        System.out.println("x = ");
        String n = scanner.next();
        BigInteger x = new BigInteger(n);

        System.out.println("y = ");
        String m = scanner.next();
        BigInteger y = new BigInteger(m);

        System.out.println("**** Calculator ****\n" +
                "1. Addition\n" +
                "2. Difference\n" +
                "3. Multiplication\n" +
                "4. Division");

        int choice = scanner.nextInt();
        switch (choice) {
            case 1 -> System.out.println(add(x, y));

            case 2 -> System.out.println(subtract(x, y));

            case 3 -> System.out.println(multiplication(x, y));

            case 4 -> System.out.println(division(x, y));
        }
    }

    public static BigInteger add(BigInteger x, BigInteger y) {
        return x.add(y);
    }

    public static BigInteger subtract(BigInteger x, BigInteger y) {
        return x.subtract(y);
    }

    public static BigInteger multiplication(BigInteger x, BigInteger y) {
        return x.multiply(y);
    }

    public static BigInteger division(BigInteger x, BigInteger y) {
        if (y.intValue() != 0) {
            return x.divide(y);
        } else return null;
    }

    public static void main(String[] args) {

        menu();

    }
}
