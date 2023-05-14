package J19_SetsAndMaps_PresentationLab;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Scanner;

public class ParkingLot {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        LinkedHashSet<String> parkingLot = new LinkedHashSet<>();

        String input = scanner.nextLine();

        String[] inputArr;

        while(!input.equals("END")){

            inputArr = input.split(", ");

            if(inputArr[0].equals("IN")){
                parkingLot.add(inputArr[1]);
            } else if(inputArr[0].equals("OUT")){
                parkingLot.remove(inputArr[1]);
            }

            input = scanner.nextLine();
        }

        if(parkingLot.isEmpty()){
            System.out.println("Parking Lot is Empty");
        } else {
            System.out.println(parkingLot);
        }
    }
}
