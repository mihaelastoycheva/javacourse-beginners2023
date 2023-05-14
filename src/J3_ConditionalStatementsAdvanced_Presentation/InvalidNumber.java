package J3_ConditionalStatementsAdvanced_Presentation;

import java.util.Scanner;

public class InvalidNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        if (!(n >= 100) || !(n <= 200)){
            if (n == 0){
                System.out.println();
                return;
            }
            System.out.println("invalid");
        } else {
            System.out.println();
        }
    }
}
