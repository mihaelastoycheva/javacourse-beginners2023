package J12_Objects_PresentationLab;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProblemStudents {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Списък от Student
        List<Student> studentsList = new ArrayList<>();

        String input = scanner.nextLine();

        while(!(input.equals("end"))){
            //С масива ще се работи с всеки отделно студенти 0-[Ivan]; 1-[Ivanov]; 2-[20]; 3-[Sofia]
            String[] tokens = input.split("\\s+");

            String firstName = tokens[0];
            String lastName = tokens[1];
            int age = Integer.parseInt(tokens[2]);
            String city = tokens[3];

            Student student = new Student(firstName, lastName, age, city);

            studentsList.add(student);
            input = scanner.nextLine();
        }

        String searchedCity = scanner.nextLine();

        for (Student student:studentsList) {
            if (student.getCity().equals(searchedCity)){
                System.out.printf("%s %s is %d years old.\n", student.getFirstName(), student.getLastName(), student.getAge());
            }
        }

    }
}
