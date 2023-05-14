package J10_Methods_Exercise;

import java.util.Scanner;

public class CharsInRange {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char start = scanner.next().charAt(0);
        char end = scanner.next().charAt(0);

        getChars(start,end);

    }
    public static void getChars(char start, char end){
        for (char i = start; i < end; i++) {
            if (!(i == start)){
                System.out.print(i + " ");
            }
        }
    }
}
