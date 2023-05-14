package J5_WhileLoop_Exercise;

import java.util.Scanner;

public class PrepareForExam {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int allowedPoorGrades = Integer.parseInt(scanner.nextLine());
        String nameOfExercise = scanner.nextLine();
        int gradeOfExercise = Integer.parseInt(scanner.nextLine());

        int counterPoorGrades = 0;

        if (gradeOfExercise <= 4){
            counterPoorGrades++;
        }

        int sumOfGrades = 0;
        int counter = 1;
        String lastName = nameOfExercise;

        while (true){
            if (gradeOfExercise <= 4){
                counterPoorGrades++;
            }
            if (counterPoorGrades >= allowedPoorGrades){
                System.out.printf("You need a break, %d poor grades.", allowedPoorGrades);
                return;
            }
            sumOfGrades += gradeOfExercise;
            lastName = nameOfExercise;
            nameOfExercise = scanner.nextLine();
            if (nameOfExercise.equals("Enough")){
                double average = (double)sumOfGrades / counter;
                System.out.printf("Average score: %.2f\n", average);
                System.out.printf("Number of problems: %d\n", counter);
                System.out.printf("Last problem: %s", lastName);
            }
            gradeOfExercise = Integer.parseInt(scanner.nextLine());
            counter++;
        }


    }
}
