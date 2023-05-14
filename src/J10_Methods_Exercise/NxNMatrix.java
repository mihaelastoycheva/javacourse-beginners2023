package J10_Methods_Exercise;

import java.util.Scanner;

public class NxNMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int input = Integer.parseInt(scanner.nextLine());

        getMatrix(input);

    }
    public static void getMatrix(int number){
        for (int i = 0; i < number; i++) {
            for (int j = 0; j < number; j++) {
                System.out.print(number + " ");
            }
            System.out.println();
        }
    }
}
