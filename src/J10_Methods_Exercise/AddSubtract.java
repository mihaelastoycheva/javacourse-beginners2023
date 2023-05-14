package J10_Methods_Exercise;

import java.util.Scanner;

public class AddSubtract {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int firstInput = Integer.parseInt(scanner.nextLine());
        int secondInput = Integer.parseInt(scanner.nextLine());
        int thirdInput = Integer.parseInt(scanner.nextLine());

        System.out.println(getSubtract(firstInput, secondInput, thirdInput));
    }

    public static int getSumOfTheFirstTwo(int first, int second){
        int result = first + second;
        return result;
    }

    public static int getSubtract(int first, int second, int third){
        int result = getSumOfTheFirstTwo(first,second) - third;
        return result;
    }
}
