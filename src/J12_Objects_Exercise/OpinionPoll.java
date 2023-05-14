package J12_Objects_Exercise;

import java.util.*;
import java.util.stream.Collectors;

public class OpinionPoll {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        List<Person> personsList = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            List<String> input = Arrays.stream(scanner.nextLine().split(" ")).collect(Collectors.toList());

            String name = input.get(0);
            int age = Integer.parseInt(input.get(1));

            Person person = new Person(name, age);
            personsList.add(person);
        }

        Collections.sort(personsList);

        for (Person person:personsList) {
            if (person.getAge()>=30) {
                System.out.println(person.getName() + " - " + person.getAge());
            }
        }


    }
}
