package J10_Methods_Exercise;

import java.util.Objects;
import java.util.Scanner;

public class PalindromeIntegers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        while(!input.equals("END")){
            int number = Integer.parseInt(input);
            System.out.println(checkPalindrome(number));
            input = scanner.nextLine();
        }
    }
    public static boolean checkPalindrome(int number){
        int first = number;
        int reverse = 0;
        while(number != 0)
        {
            int remainder = number % 10;
            reverse = reverse * 10 + remainder;
            number = number / 10;
        }
        return first == reverse;
    }
}
