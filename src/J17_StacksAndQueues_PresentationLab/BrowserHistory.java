package J17_StacksAndQueues_PresentationLab;

import java.util.ArrayDeque;
import java.util.Scanner;

public class BrowserHistory {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayDeque<String> browser = new ArrayDeque<>();
        String line = scanner.nextLine();

        String current = "";

        while (!line.equals("Home")){
            if(line.equals("back")){
                if(browser.isEmpty()){
                    System.out.println("no previous URL");
                    line = scanner.nextLine();
                    continue;
                } else {
                    current = browser.pop();
                }
            } else {
                if (!current.equals("")){
                    browser.push(current);
                }
                current = line;
            }

            System.out.println(current);
            line = scanner.nextLine();
        }

    }
}
