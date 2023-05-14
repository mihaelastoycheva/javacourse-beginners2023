package J11_Lists_Exercise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class HouseParty {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int countOfCommands = Integer.parseInt(scanner.nextLine());
        List<String> guests = new ArrayList<>();

        List<String> input = Arrays.stream(scanner.nextLine().split(" ")).collect(Collectors.toList());

        boolean flag = true;
        boolean checker = true;

        for (int i = 0; i < countOfCommands; i++) {
            if (input.get(2).equals("going!")){ // Someone is going!
                for (int k = 0; k < guests.size(); k++) {
                    if (input.get(0).equals(guests.get(k))){
                        System.out.printf("%s is already in the list!", input.get(0));
                        checker = false;
                    }
                }
                if (checker){
                    guests.add(input.get(0));
                }
            } else { //Someone is not going!
                for (int j = 0; j < guests.size(); j++) {
                    if (input.get(0).equals(guests.get(j))){
                        guests.remove(j--);
                        flag = false;
                    }
                }
                if (flag){
                    System.out.printf("%s is not in the list!", input.get(0));
                }
            }
            checker = true;
            flag = true;
            input = Arrays.stream(scanner.nextLine().split(" ")).collect(Collectors.toList());
        }

        for (String guest: guests) {
            System.out.println(guest);
        }
    }
}
