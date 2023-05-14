package J6_NestedLoops_Presentation;

import java.util.Scanner;

public class SumOfTwoNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int start = Integer.parseInt(scanner.nextLine());
        int end = Integer.parseInt(scanner.nextLine());
        int magicNum = Integer.parseInt(scanner.nextLine());

        int counter = 0;
        boolean flag = false;

        for (int i = start; i <= end; i++) {
            for (int j = start; j <= end; j++) {
                counter++;
                int result = i + j;
                if (result == magicNum){
                    System.out.printf("Combination N:%d (%d + %d = %d)\n", counter, i, j, i+j);
                    flag = true;
                    break;
                }
            }
            if (flag){
                break;
            }
        }
        if (flag == false){
            System.out.printf("%d combinations - neither equals %d\n", counter, magicNum);
        }
    }
}
