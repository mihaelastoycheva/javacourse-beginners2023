package J5_WhileLoop_Presentation;

public class Test {
    public static void main(String[] args) {
        int target = 1000;
        for (int i = 2; i < target; i++) {
            if (i % 2 == 0){
                System.out.println(i);
            } else {
                System.out.printf("-%d\n", i);
            }
        }
    }
}
