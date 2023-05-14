package J5_WhileLoop_Presentation;

import java.util.Scanner;

public class Password {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String username = scanner.nextLine();
        String password = scanner.nextLine();

        System.out.print("Type your password: ");
        String newPass = scanner.nextLine();

        while (!password.equals(newPass)){
            System.out.print("Type your password: ");
            newPass = scanner.nextLine();
        }

        System.out.println("Welcome " + username);
    }
}
