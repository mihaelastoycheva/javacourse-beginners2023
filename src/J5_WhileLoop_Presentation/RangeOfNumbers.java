package J5_WhileLoop_Presentation;

import java.util.Scanner;

public class RangeOfNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int sum = 1;

        while (sum <= n){
            System.out.println(sum);
            sum = sum * 2 + 1;
        }
    }
}
