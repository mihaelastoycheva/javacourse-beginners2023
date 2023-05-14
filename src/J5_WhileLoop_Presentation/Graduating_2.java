package J5_WhileLoop_Presentation;

import java.util.Scanner;

public class Graduating_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();
        int exclude = 0;
        int classes = 1;
        double grade;
        double totalSumOfGrades = 0;
        boolean success=true;

        while (classes <= 12&&success==true){
            grade = Double.parseDouble(scanner.nextLine());
            if (grade < 4){
                exclude++;
            }
            if (exclude == 2){
                System.out.printf("%s has been excluded at %d grade.", name, classes);
                success=false;
            }
            totalSumOfGrades += grade;
            classes++;
        }
        double average = totalSumOfGrades / 12;
        if(success==true) {
            System.out.printf("%s graduated. Average grade: %.2f", name, average);
        }
    }
}
