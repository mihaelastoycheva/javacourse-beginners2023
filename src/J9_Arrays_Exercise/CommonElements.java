package J9_Arrays_Exercise;

import java.util.Arrays;
import java.util.Scanner;

public class CommonElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String firstInput = scanner.nextLine();
        String[] firstArr = firstInput.split(" ");

        String secondInput = scanner.nextLine();
        String[] secondArr = secondInput.split(" ");

        for (String s : firstArr) {
            for (String value : secondArr) {
                if (s.equals(value)) {
                    System.out.println(s);
                }
            }
        }

        /* Друг вариант:
        for (int i = 0; i < firstArr.length; i++) {
            for (int j = 0; j < secondArr.length; j++) {
                if (firstArr[i].equals(secondArr[j])){
                    System.out.println(firstArr[i]);
                }
            }
        }
         */

    }
}
