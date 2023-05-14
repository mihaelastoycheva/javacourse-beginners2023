package J10_Methods_Presentation;

import java.util.Scanner;

public class SignOfInteger {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = Integer.parseInt(scanner.nextLine());
        printNum(num);

    }
    public static void printNum (int number){
        if (number > 0){
            System.out.printf("The number %d is positive.\n", number);
        } else if (number < 0){
            System.out.printf("The number %d is negative.\n", number);
        } else {
            System.out.println("The number 0 is zero.\n");
        }
    }
}
