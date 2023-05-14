package J19_SetsAndMaps_PresentationLab;

import java.util.*;

public class AverageStudentsGrades {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, List<Double>> students = new TreeMap<>();

        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < n; i++) {
            String[] input = scanner.nextLine().split("\\s+");

            if(students.containsKey(input[0])){
                students.get(input[0]).add(Double.parseDouble(input[1]));
            } else {
                List<Double> grades = new ArrayList<>();
                grades.add(Double.parseDouble(input[1]));
                students.put(input[0], grades);
            }
        }

        double sum = 0;
        double avg;

        for (String s : students.keySet()) {
            System.out.print(s + " -> ");
            for (int i = 0; i < students.get(s).size(); i++) {
                sum += students.get(s).get(i);
                System.out.printf("%.2f ", students.get(s).get(i));
            }
            avg = (double) sum / (students.get(s).size());
            System.out.printf("(avg: %.2f)\n", avg);
            avg = 0;
            sum = 0;
        }
    }
}
