package J2_ConditionalStatements;

import java.util.Scanner;

public class SumSeconds {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int time1 = Integer.parseInt(scanner.nextLine());
        int time2 = Integer.parseInt(scanner.nextLine());
        int time3 = Integer.parseInt(scanner.nextLine());

        int sumTimes = time1 + time2 + time3;

        int minutes = sumTimes / 60;
        int seconds = sumTimes % 60;

        if (seconds < 10){
            System.out.printf("%d:0%d", minutes, seconds);
        } else {
            System.out.printf("%d:%02d", minutes, seconds);
        }
    }
}
