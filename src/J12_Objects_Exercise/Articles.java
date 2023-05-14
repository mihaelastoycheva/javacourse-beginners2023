package J12_Objects_Exercise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Articles {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> input = Arrays.stream(scanner.nextLine().split(" ")).collect(Collectors.toList());

        String title = input.get(0);
        String content = input.get(1);
        String author = input.get(2);

        Article article = new Article(title, content, author);
        
        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < n; i++) {
            List<String> command = Arrays.stream(scanner.nextLine().split(": ")).collect(Collectors.toList());

            switch (command.get(0)) {
                case "Edit" -> article.Edit(command.get(1));
                case "ChangeAuthor" -> article.ChangeAuthor(command.get(1));
                case "Rename" -> article.Rename(command.get(1));
            }
        }
        article.ToString();
    }
}
