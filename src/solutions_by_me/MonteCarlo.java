package solutions_by_me;

import java.util.Scanner;

public class MonteCarlo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        double x;
        double y;
        int k = 0;

        for (int i = 1; i < n; i++) {
            x = Math.random();
            y = Math.random();
            if (x * x + y * y <= 1) k++;
        }
        double pi = 4. * k / n;
        System.out.println(pi);
    }
}
