package J10_Methods_Exercise;

import java.util.Scanner;

public class PasswordValidator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char[] input = scanner.nextLine().toCharArray();

        validatePass(input);

    }
    public static void validatePass(char[] input){
        int countDigits = 0;

        for (int i = 0; i < input.length; i++) {

            if ((input[i] >= 33 && input[i] <= 47) ||
                    (input[i] >= 58 && input[i] <= 64) ||
                    (input[i] >= 91 && input[i] <= 96)){
                System.out.println("Password must consist only of letters and digits");
                break;
            }
            if (input[i] >= 48 && input[i] <= 57){
                countDigits++;
            }
        }
        if (input.length < 6 || input.length > 10){
            System.out.println("Password must be between 6 and 10 characters");
        }
        if (countDigits < 2){
            System.out.println("Password must have at least 2 digits");
        } else {
            System.out.println("Password is valid");
        }
    }
}
