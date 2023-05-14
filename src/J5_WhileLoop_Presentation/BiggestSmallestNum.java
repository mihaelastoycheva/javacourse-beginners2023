package J5_WhileLoop_Presentation;

import java.util.Scanner;

public class BiggestSmallestNum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        String input = scanner.nextLine();
        int num;

        while (!input.toLowerCase().equals("stop")){
            num = Integer.parseInt(input);
            if (num > max){
                max = num;
            }
            if (num < min){
                min = num;
            }
            input = scanner.nextLine();
        }
        System.out.println("Min value: " + min);
        System.out.println("Max value: " + max);
    }
}
