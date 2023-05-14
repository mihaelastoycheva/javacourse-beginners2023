package J19_SetsAndMaps_PresentationLab;

import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class AcademyGraduation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        double sum = 0;

        Map<String, Double> students = new TreeMap<>();

        for (int i = 0; i < n; i++) {
            String name = scanner.nextLine();
            double[] grades = Arrays.stream(scanner.nextLine().split("\\s+"))
                    .mapToDouble(Double::parseDouble)
                    .toArray();

            for (double grade : grades) {
                sum += grade;
            }
            double average = (double) sum / grades.length;

            students.put(name, average);

            sum = 0;
        }

        for (String student : students.keySet()) {
            System.out.println(student + " is graduated with " + students.get(student));
        }

    }
}
