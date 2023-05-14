package J5_WhileLoop_Exercise;

import java.util.Scanner;

public class Steps {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int everydaySteps;
        int achievedSteps = 0;

        String input = scanner.nextLine();
        boolean flag = false;

        while (true){
            if (input.equals("Going home")){
                everydaySteps = Integer.parseInt(scanner.nextLine());
                achievedSteps += everydaySteps;
                break;
            }
            if (achievedSteps >= 10000){
                flag = true;
                break;
            }
            everydaySteps = Integer.parseInt(input);
            achievedSteps += everydaySteps;
            input = scanner.nextLine();
        }
        if(flag){
            System.out.printf("Goal reached! Good job!\n%d steps over the goal!\n", Math.abs(achievedSteps-10000));
        } else {
            System.out.printf("%d more steps to reach goal.", Math.abs(achievedSteps-10000));
        }
    }
}
