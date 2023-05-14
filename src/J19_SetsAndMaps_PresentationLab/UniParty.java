package J19_SetsAndMaps_PresentationLab;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class UniParty {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Set<String> vip = new TreeSet<>();
        Set<String> regular = new TreeSet<>();

        String input = scanner.nextLine();

        while(!input.equals("PARTY")){

            if(Character.isDigit(input.charAt(0))){
                vip.add(input);
            } else {
                regular.add(input);
            }
            input = scanner.nextLine();
        }

        String secInput = scanner.nextLine();

        while(!secInput.equals("END")){

            if(vip.contains(secInput)){
                vip.remove(secInput);
            }
            if(regular.contains(secInput)){
                regular.remove(secInput);
            }

            secInput = scanner.nextLine();
        }

        System.out.println(vip.size() + regular.size());
        if (vip.isEmpty()){
            System.out.println(regular);
        } else if (regular.isEmpty()){
            System.out.println(vip);
        } else {
            System.out.println(vip);
            System.out.println(regular);
        }
    }
}
