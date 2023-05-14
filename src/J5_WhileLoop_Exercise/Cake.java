package J5_WhileLoop_Exercise;

import java.util.Scanner;

public class Cake {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int width = Integer.parseInt(scanner.nextLine());
        int length = Integer.parseInt(scanner.nextLine());

        int size = width * length;
        String input = scanner.nextLine();
        int leftSize = size;
        boolean flag = true;

        while (leftSize > 0){
            if (input.equals("STOP")){
                if (leftSize <= 0){
                    System.out.printf("No more cake left! You need %d pieces more.", Math.abs(leftSize));
                } else {
                    System.out.printf("%d pieces are left.", Math.abs(leftSize));
                }
                flag = false;
                break;
            }
            int piece = Integer.parseInt(input);
            leftSize -= piece;
            input = scanner.nextLine();
        }

        if (flag){
            System.out.printf("No more cake left! You need %d pieces more.", Math.abs(leftSize));
        }
    }
}
