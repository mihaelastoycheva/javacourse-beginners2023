package J19_SetsAndMaps_Exercise;

import java.util.*;

public class HandsOfCards {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        Map<String, Integer> players = new LinkedHashMap<>();

        while (!input.equals("JOKER")){
            String[] inputArr = input.split("[:, ]+");

            String name = inputArr[0];

            if(players.containsKey(name)){
                int cardValue = calculateCardValues(inputArr);
                players.put(name, players.get(name) + cardValue);
            } else {
                int cardValue = calculateCardValues(inputArr);
                players.put(name, cardValue);
            }
            input = scanner.nextLine();
        }

        for (String s : players.keySet()) {
            System.out.println(s + " " + players.get(s));
        }
    }

    private static int calculateCardValues(String[] inputArr) {
        int tempNum = 0;
        int sum = 0;
        String lastCard = "";
        for (int i = 1; i < inputArr.length; i++) {

            if(lastCard.equals(inputArr[i])){
                continue;
            }

            char power = inputArr[i].charAt(0);
            switch (power) {
                case '2' -> tempNum = 2;
                case '3' -> tempNum = 3;
                case '4' -> tempNum = 4;
                case '5' -> tempNum = 5;
                case '6' -> tempNum = 6;
                case '7' -> tempNum = 7;
                case '8' -> tempNum = 8;
                case '9' -> tempNum = 9;
                case '1' -> tempNum = 10;
                case 'J' -> tempNum = 11;
                case 'Q' -> tempNum = 12;
                case 'K' -> tempNum = 13;
                case 'A' -> tempNum = 14;
            }
            char type = inputArr[i].charAt(1);

            if(type == '0'){
                type = inputArr[i].charAt(2);
            }

            switch (type){
                case 'S' -> tempNum = tempNum * 4;
                case 'H' -> tempNum = tempNum * 3;
                case 'D' -> tempNum = tempNum * 2;
                case 'C' -> tempNum = tempNum * 1;
            }
            sum += tempNum;
            lastCard = inputArr[i];
        }
        return sum;
    }
}
