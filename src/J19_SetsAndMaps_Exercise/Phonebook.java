package J19_SetsAndMaps_Exercise;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Phonebook {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        Map<String, String> phonebook = new TreeMap<>();
        while(!input.equals("search")){

            String[] info = input.split("-");
            phonebook.put(info[0], info[1]);
            input = scanner.nextLine();
        }

        String searchedName = scanner.nextLine();

        while(!searchedName.equals("stop")){
            if(phonebook.containsKey(searchedName)){
                for (String s : phonebook.keySet()) {
                    if(s.equals(searchedName)){
                        System.out.println(s + " -> " + phonebook.get(s));
                    }
                }
            } else {
                System.out.printf("Contact %s does not exist.\n", searchedName);
            }
            searchedName = scanner.nextLine();
        }
    }
}
