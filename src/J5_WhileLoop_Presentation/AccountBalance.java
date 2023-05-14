package J5_WhileLoop_Presentation;

import java.util.Scanner;

public class AccountBalance {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double total = 0.0;
        String input = scanner.nextLine();
        double money = 0.0;

        //Четем Стринг и го проверяваме дали ще е NoMoreMoney
        while (!input.equals("NoMoreMoney")){
            //Този стринг го парсваме към число с плаваща запетая, за да може да го прибавим към тотала
            money = Double.parseDouble(input);

            if (money < 0){
                System.out.println("Invalid input!");
                break;
            }
            total += money;
            System.out.printf("Current money: %.2f\n", money);

            //Четем отново инпут под формата на Стринг, за да може после цикъла в условието да провери дали е NoMoreMoney
            input = scanner.nextLine();
        }

        System.out.printf("Total: %.2f", total);
    }
}
