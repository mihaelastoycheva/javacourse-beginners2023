package J17_StacksAndQueues_PresentationLab;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class MatchingBrackets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String expression = scanner.nextLine();

        Deque<Integer> stack = new ArrayDeque<>();
        for (int i = 0; i < expression.length(); i++) {
            char ch = expression.charAt(i);
            if (ch == '('){
                //Добавя индекса(позицията), на която е началната скоба, в нашия стек
                stack.push(i);
            } else if(ch == ')'){
                //От стека взима последния елемент, най-отгоре, където сме записали позицията на началната скоба
                int startIndex = stack.pop();
                String content = expression.substring(startIndex,i+1);
                System.out.println(content);
            }
        }
    }
}
