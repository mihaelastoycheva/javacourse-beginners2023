package J8_DataTypes_Exercise;

import java.util.Scanner;

public class IntegerOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num1 = Integer.parseInt(scanner.nextLine());
        int num2 = Integer.parseInt(scanner.nextLine());
        int num3 = Integer.parseInt(scanner.nextLine());
        int num4 = Integer.parseInt(scanner.nextLine());

        int sum = num1 + num2;
        int divide = sum / num3;
        int multiply = (int) divide * num4;

        System.out.println("Result: " + multiply);
    }
}
