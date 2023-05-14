package J5_WhileLoop_Exercise;

import java.util.Scanner;

public class Holiday {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double neededMoney = Double.parseDouble(scanner.nextLine());
        double startBalance = Double.parseDouble(scanner.nextLine());

        int counterDays = 1;
        int counterSpend = 0;

        double currentBalance = startBalance;

        while (true){
            String action = scanner.nextLine();
            double moneyAction = Double.parseDouble(scanner.nextLine());

            if (action.equals("spend")){
                currentBalance -= moneyAction;
                counterSpend++;
                if (currentBalance < 0){
                    currentBalance = 0;
                }
                if (counterSpend == 5){
                    System.out.println("You can't save the money.");
                    System.out.println(counterDays);
                    break;
                }
            } else if (action.equals("save")){
                currentBalance += moneyAction;
                if (currentBalance >= neededMoney){
                    System.out.printf("You saved the money for %d days.", counterDays);
                    break;
                }
            }

            counterDays++;
        }
    }
}
