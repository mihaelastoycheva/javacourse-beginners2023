package J19_SetsAndMaps_Exercise;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class FixEmails {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String inputName = scanner.nextLine();

        Map<String, String> data = new LinkedHashMap<>();

        while(!inputName.equals("stop")){
            String name = inputName;
            String email = scanner.nextLine();

            if((email.charAt(email.length()-1) == 's' && email.charAt(email.length()-2) == 'u')
                    || (email.charAt(email.length()-1) == 'k' && email.charAt(email.length()-2) == 'u')
                    || (email.charAt(email.length()-1) == 'm' && email.charAt(email.length()-2) == 'o' && email.charAt(email.length()-3) == 'c')){
                inputName = scanner.nextLine();
                continue;
            } else {
                data.put(name, email);
            }

            inputName = scanner.nextLine();
        }

//        for (String s : data.keySet()) {
//            for (int i = 0; i < data.get(s).length(); i++) {
//                if((data.get(s).charAt(data.get(s).length() - 1)) == 's'
//                        && (data.get(s).charAt(data.get(s).length() - 2)) == 'u'){
//                    data.remove(s);
//                } else if ((data.get(s).charAt(data.get(s).length() - 1)) == 'k'
//                        && (data.get(s).charAt(data.get(s).length() - 2)) == 'u'){
//                    data.remove(s);
//                } else if ((data.get(s).charAt(data.get(s).length() - 1)) == 'm'
//                        && (data.get(s).charAt(data.get(s).length() - 2)) == 'o'
//                        && (data.get(s).charAt(data.get(s).length() - 3)) == 'c'){
//                    data.remove(s);
//                }
//            }
//        }

        for (String s : data.keySet()) {
            System.out.println(s + " -> " + data.get(s));
        }
    }
}
