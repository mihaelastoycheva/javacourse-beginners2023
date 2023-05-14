package J8_DataTypes_Presentation;

import java.util.Scanner;
import java.lang.*;

public class LowerOrUpper {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char input = scanner.next().charAt(0);

        if (Character.isUpperCase(input)){
            System.out.println(input + " is upper case.");
        } else {
            System.out.println(input + " is lower case.");
        }
    }
}
