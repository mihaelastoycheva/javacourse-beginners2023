package J19_SetsAndMaps_PresentationLab;

import java.util.*;
import java.util.function.Function;
import java.util.function.ToIntFunction;

public class VoinaNumberGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ToIntFunction<String> pars = e->Integer.parseInt(e);

        Integer[] firstPlayerNumbers = Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(pars)
                .boxed()
                .toArray(Integer[]::new);

        Set<Integer> firstPlayer = new LinkedHashSet<>();
        Collections.addAll(firstPlayer, firstPlayerNumbers);

        //---------------------------------------

        Integer[] secondPlayerNumbers = Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(pars)
                .boxed()
                .toArray(Integer[]::new);

        Set<Integer> secondPlayer = new LinkedHashSet<>();
        Collections.addAll(secondPlayer, secondPlayerNumbers);


        System.out.println(firstPlayer);
    }
}
