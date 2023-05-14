package J12_Objects_Exercise;

import java.util.Random;
import java.util.Scanner;

public class AdvertisementMessage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());

        String[] phrases = {"Excellent product.",
                "Such a great product.",
                "I always use that product.",
                "Best product of its category.",
                "Exceptional product.",
                "I can’t live without this product."};

        String[] events = {"Now I feel good.",
                "I have succeeded with this product.",
                "Makes miracles. I am happy of the results!",
                "I cannot believe but now I feel awesome.",
                "Try it yourself, I am very satisfied.",
                "I feel great!"};

        String[] authors = {"Diana", "Petya", "Stella", "Elena", "Katya", "Iva", "Annie", "Eva"};

        String[] cities = {"Burgas", "Sofia", "Plovdiv", "Varna", "Ruse"};

        for (int i = 0; i < number; i++) {
            Random randomFirst = new Random();
            int positionPhrases = randomFirst.nextInt(phrases.length);
            System.out.print(phrases[positionPhrases] + " ");

            Random randomSecond = new Random();
            int positionEvents = randomSecond.nextInt(events.length);
            System.out.print(events[positionEvents] + " ");

            Random randomThird = new Random();
            int positionAuthors = randomThird.nextInt(authors.length);
            System.out.print(authors[positionAuthors] + " - ");

            Random randomForth = new Random();
            int positionCities = randomForth.nextInt(cities.length);
            System.out.print(cities[positionCities] + "\n");
        }
    }
}
