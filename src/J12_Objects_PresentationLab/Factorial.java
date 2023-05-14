package J12_Objects_PresentationLab;

import java.math.BigInteger;
import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        BigInteger f = new BigInteger(String.valueOf(1));

        for (int i = 1; i <= n; i++) {
            int input = Integer.parseInt(String.valueOf(i));
            f = f.multiply(BigInteger.valueOf(input));
        }

        System.out.println(f);
    }
}
