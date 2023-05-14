package J4_ForLoop_Lab;

import java.util.Scanner;

public class SmartLily {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int age = Integer.parseInt(scanner.nextLine());
        double machinePrice = Double.parseDouble(scanner.nextLine());
        int sell = Integer.parseInt(scanner.nextLine());

        int toys = 0;
        int money = 0;
        int yearsWithMoney = 0;

        for (int i = 1; i <= age; i++) {
            if (i % 2 == 0){
                yearsWithMoney++;
                money = money + (yearsWithMoney * 10);
            } else {
                toys++;
            }
        }

        int sellToys = toys * sell;
        int takenMoney = yearsWithMoney * 1;

        int leftMoney = money + sellToys - takenMoney;

        if (machinePrice <= leftMoney){
            System.out.printf("Yes! %.2f", Math.abs(machinePrice - leftMoney));
        } else {
            System.out.printf("No! %.2f", Math.abs(machinePrice - leftMoney));
        }
    }
}
