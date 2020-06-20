package solutions_ReadMe_Exercises;

import java.util.Scanner;

public class Binary {
    public static void main(String[] args) {

        //algorytm zmieniania liczb dziesiętnych na binarne:
        /*

        0,1,2,3,4,5,6,7,8,9 - system dziesiętny

        0,1 - system binarny

        POTEGI DWOJKI
        1, 2, 4, 8, 16, 32, 64, 128, 256, 512, 1024...

        3214 => 3*10^3 + 2*10^2 + 1x10^1 + 4x10^0
        100(B) = 1*2^2 + 0*2^1 + 0*2^0 = 4 (DZ)
        1010(B) = 10 (DZ)
        110110(B) = 54 (DZ)

        150(DZ) => ?? (B)

          x | x % 2
        150 | 0
         75 | 1
         37 | 1
         18 | 0
          9 | 1
          4 | 0
          2 | 0
          1 | 1
          0 |

        150(DZ) => 10010110(B)

        WAŻNA FUNKCJA KLASY INTEGER:
        Integer.toBinaryString(int n);

         */

        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        decimalToBinary(number);

        System.out.println("\n" + Integer.toBinaryString(number));


    }

    static void decimalToBinary(int x) {
        int[] tab = new int[x];
        int i = 0;

        //todo zdrób pętlę while, która dzieli x % 2, dopóki x != 0

        while (x != 0) {
            tab[i] = x % 2;
            x /= 2;
            i++;
        }

        for (int j = i - 1; j >= 0; j--) {
            System.out.print(tab[j]);
        }
    }
}
