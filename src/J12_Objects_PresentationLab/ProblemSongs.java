package J12_Objects_PresentationLab;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ProblemSongs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Song> songList = new ArrayList<>();

        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < n; i++) {
            String[] tokens = scanner.nextLine().split("_");

            String typeList = tokens[0];
            String name = tokens[1];
            String time = tokens[2];

            Song song = new Song(typeList,name,time);
            songList.add(song);
        }

        String searchedType = scanner.nextLine();

        if (searchedType.equals("all")){
            for (Song song:songList) {
                System.out.println(song.getName());
            }
        } else {
            for (Song song:songList) {
                if(song.getTypeList().equals(searchedType)){
                    System.out.println(song.getName());
                }
            }
        }

        /*Another way:
        List<Song> filterSongs = songList.stream()
                .filter(e -> e.getTypeList().equals(searchedType))
                .collect(Collectors.toList());

        for (Song song : filterSongs){
            System.out.println(song.getName());
        }
         */
    }
}
