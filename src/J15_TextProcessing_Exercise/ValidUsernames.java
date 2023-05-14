package J15_TextProcessing_Exercise;

import java.util.Scanner;

public class ValidUsernames {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] usernames = scanner.nextLine().split(", ");

        for (String username : usernames) {
            if (username.length() >= 3 && username.length() <= 16 && containsCharacters(username, username.length())) {
                System.out.println(username);
            }
        }
    }

    public static boolean containsCharacters (String s, int n){
        for (int i = 0; i < n; i++) {
            if (!(s.charAt(i) == 45 || (s.charAt(i) >= 48 && s.charAt(i) <= 57) ||
                    (s.charAt(i) >= 65 && s.charAt(i) <= 90) ||
                    (s.charAt(i) >= 97 && s.charAt(i) <= 122))){
                return false;
            }
        }
        return true;
    }
}
