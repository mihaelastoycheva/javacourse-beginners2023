package J6_NestedLoops_Presentation;

public class Clock {
    public static void main(String[] args) {
        for (int i = 0; i < 24; i++) {
            for (int j = 0; j < 60; j++) {
                for (int k = 0; k < 60; k++) {
                    System.out.printf("%02d:%02d:%02d\n", i, j, k);
                }
            }
        }
    }
}
