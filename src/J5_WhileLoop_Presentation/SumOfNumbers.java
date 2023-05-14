package J5_WhileLoop_Presentation;

import java.util.Scanner;

public class SumOfNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());
        int nextNum = Integer.parseInt(scanner.nextLine());

        int sum = 0;
        sum += nextNum;

        while (!(number < sum)){
            nextNum = Integer.parseInt(scanner.nextLine());
            sum += nextNum;
        }
        System.out.println(sum);
    }
}
