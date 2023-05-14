package J6_NestedLoops_Exercise;

import java.util.Scanner;

public class PyramidOfNums {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int num = Integer.parseInt(scanner.nextLine());

        int counter = 1;
        boolean flag = false;

        for (int i = 1; i <= num; i++) {    //Редове
            for (int j = 1; j <= i; j++) {    //Колони
                if (counter > num){
                    flag = true;
                    break;
                }
                System.out.print(counter + " ");
                counter++;
            }
            if (flag){
                break;
            }
            System.out.println();
        }
    }
}
