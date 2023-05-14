package J8_DataTypes_Exercise;

import java.util.Scanner;

public class SumDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int number = 0;
        int sum = 0;

        while(n > 0){
            number = n % 10;
            sum += number;
            n /= 10;
        }
        System.out.println(sum);
    }
}
