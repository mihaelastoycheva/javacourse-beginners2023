package J8_DataTypes_Exercise;

import java.util.Scanner;

public class Elevator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int personsToElevate = Integer.parseInt(scanner.nextLine());
        int personsCapacity = Integer.parseInt(scanner.nextLine());

        if (personsCapacity > personsToElevate){
            System.out.println("All the persons fit inside in the elevator.");
            System.out.println("Only one course is needed.");
            return;
        }

        int firstCourses = (int) personsToElevate / personsCapacity;
        System.out.println(firstCourses + " courses * " + personsCapacity + " people");

        int leftPersons = personsToElevate - (firstCourses * personsCapacity);

        int nextCourses = (int) leftPersons / personsToElevate;
        if (nextCourses <= 0){
            System.out.println("+ 1 course * " + leftPersons + " persons");
        } else {
            System.out.println("+ " + nextCourses + " * " + leftPersons + "persons");
        }

    }
}
