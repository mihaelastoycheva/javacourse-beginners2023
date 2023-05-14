package J5_WhileLoop_Presentation;

import java.util.Scanner;

public class Moving {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double width = Double.parseDouble(scanner.nextLine());
        double length = Double.parseDouble(scanner.nextLine());
        double height = Double.parseDouble(scanner.nextLine());

        String input = scanner.nextLine();

        double volumeBox = width * length * height;

        double leftSpace = volumeBox;

        while (!input.equals("Done")){
            int countBoxes = Integer.parseInt(input);
            leftSpace -= countBoxes;
            if (leftSpace < 0){
                System.out.printf("No more free space! You need %.2f Cubic meters more.", Math.abs(leftSpace));
                return;
            }
            input = scanner.nextLine();
        }

        System.out.printf("%.2f Cubic meters left.", leftSpace);

    }
}
