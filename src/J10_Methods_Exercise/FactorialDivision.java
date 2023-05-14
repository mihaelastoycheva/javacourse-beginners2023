package J10_Methods_Exercise;

import java.util.Scanner;

public class FactorialDivision {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int firstInput = Integer.parseInt(scanner.nextLine());
        int secondInput = Integer.parseInt(scanner.nextLine());

        System.out.println(divideNumbers(firstInput,secondInput));
    }

    public static int calculateFactorial(int input){
        int factorial = 1;
        for (int i = 1; i <= input; i++) {
            factorial *= i;
        }
        return factorial;
    }

    public static double divideNumbers(int first, int second){
        return (double) calculateFactorial(first) / calculateFactorial(second);
    }
}
