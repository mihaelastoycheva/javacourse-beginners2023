package J5_WhileLoop_Presentation;

import java.util.Scanner;

public class Graduating {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();
        int exclude = 0;
        int classes = 1;
        double grade;
        double totalSumOfGrades = 0;

        while (classes <= 12){
            grade = Double.parseDouble(scanner.nextLine());
            if (grade < 4){
                exclude++;
            }
            if (exclude == 2){
                System.out.printf("%s has been excluded at %d grade.", name, classes);
                break;
            }
            totalSumOfGrades += grade;
            classes++;
        }
        double average = totalSumOfGrades / 12;
        System.out.printf("%s graduated. Average grade: %.2f", name, average);
    }
}
