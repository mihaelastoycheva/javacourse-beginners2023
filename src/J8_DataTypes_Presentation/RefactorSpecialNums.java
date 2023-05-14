package J8_DataTypes_Presentation;

import java.util.Scanner;

public class RefactorSpecialNums {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = Integer.parseInt(scanner.nextLine());
        int sum = 0;
        int num = 0;
        boolean flag = false;
        
        for (int i = 1; i <= input; i++) {
            num = i;
            while (i > 0) {
                sum += i % 10;
                i = i / 10;
            }

            flag = (sum == 5) || (sum == 7) || (sum == 11);
            System.out.printf("%d -> %b%n", num, flag);
            sum = 0;
            i = num;
        }

    }
}
