package solutions_by_me;

import java.util.Scanner;

public class LiczbyParzysteW_Przedziale {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            for (int i = a; i <= b; i++) {
                if (i % 2 == 0) {
                    System.out.printf("%d ", i);
                }
            }
        } catch (Exception e) {
            System.out.println("Błąd, to nie jest poprawna liczba.");
        }
    }
}
