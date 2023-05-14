package J6_NestedLoops_Presentation;

import java.util.Scanner;

public class Building {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int start = Integer.parseInt(scanner.nextLine());
        int end = Integer.parseInt(scanner.nextLine());

        for (int i = start; i > 0; i--) {
            for (int j = 0; j < end; j++) {
                if (i == start){
                    System.out.printf("L%d%d ", i, j);
                } else if (i % 2 == 0){
                    System.out.printf("O%d%d ", i, j);
                } else {
                    System.out.printf("A%d%d ", i, j);
                }
            }
            System.out.println();
        }
    }
}
