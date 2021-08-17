package lesson2;

public class Main {
    public static void taskOne() {
        double dayNorm = 10;
        for (int i = 0; i < 7; i++) {
            dayNorm = dayNorm + dayNorm * 10 / 100;
        }
        System.out.printf("%.1f", dayNorm);
    }

    public static void main(String[] args) {
        taskOne();

    }

}
