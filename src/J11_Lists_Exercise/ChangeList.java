package J11_Lists_Exercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ChangeList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> nums1 = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());
        List<String> input = Arrays.stream(scanner.nextLine().split(" ")).collect(Collectors.toList());

        for (int i = 0; i < 1; i++) {
            while(!(input.get(i).equals("end"))){
                if (input.get(i).equals("Delete")){
                    int number = Integer.parseInt(String.valueOf(input.get(i+1)));
                    for (int j = 0; j < nums1.size(); j++) {
                        if (nums1.get(j) == number){
                            nums1.remove(j--);
                        }
                    }
                } else if (input.get(i).equals("Insert")){
                    int element = Integer.parseInt(String.valueOf(input.get(i+1)));
                    int position = Integer.parseInt(String.valueOf(input.get(i+2)));
                    nums1.add(position,element);
                }
                input = Arrays.stream(scanner.nextLine().split(" ")).collect(Collectors.toList());
            }
        }

        for (Integer element : nums1) {
            System.out.print(element + " ");
        }
    }
}
