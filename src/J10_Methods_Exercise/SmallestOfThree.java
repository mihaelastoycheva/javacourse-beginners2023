package J10_Methods_Exercise;

import java.util.Scanner;

public class SmallestOfThree {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int firstInput = Integer.parseInt(scanner.nextLine());
        int secondInput = Integer.parseInt(scanner.nextLine());
        int thirdInput = Integer.parseInt(scanner.nextLine());

        System.out.println(getSmallest(firstInput,secondInput,thirdInput));
    }

    public static int getBigger(int first, int second, int third){
        if (first > second){
            if (first > third){
                return first;
            } else {
                return third;
            }
        } else {
            if (second > third){
                return second;
            } else {
                return third;
            }
        }
    }

    public static int getSmallest(int first, int second, int third){
        if (first < second){
            if (first < third){
                return first;
            } else {
                return third;
            }
        } else {
            if (second < third){
                return second;
            } else {
                return third;
            }
        }
    }
}
