package lesson2;

public class Main {
    public static void taskOne() {
        double dayNorm = 10;
        for (int i = 0; i < 7; i++) {
            dayNorm = dayNorm + dayNorm * 10 / 100;
        }
        //округлил до одного знака после запятой, думаю будет достаточно
        System.out.printf("Task 1. Runners run %.1f km in 7 days \n", dayNorm);
    }

    public static void taskTwo() {
        int numberOfAmoebas = 1;
        System.out.println("Task 2.");
        for (int i = 3; i <= 24; i = i + 3) {
            numberOfAmoebas = numberOfAmoebas * 2;
            System.out.println(numberOfAmoebas + " amoebas  after " + i + " hours.");
        }
        System.out.println();
    }

    public static void taskThree() {
        int number = 0;
        for (int i = 1; i <= 256; i = i * 2) {
            number = number + i;
        }
        System.out.println("Task 3 - " + number);
    }

    public static void taskFour(int a, int b) {
        int result = 0;
        for (int i = 0; i < b; i++) {
            result = result + a;
        }
        System.out.println("Task 4 - " + result);
    }

    public static void taskFive() {
        double centimetersInInch = 2.54;
        System.out.println("Task 5: ");
        for (int i = 1; i <= 20; i++) {
            System.out.println(i + "\" = " + centimetersInInch * i + " cm");
        }
    }

    public static void taskSix() {
        System.out.println("Task 6: ");
        for (int i = 2; i <= 100; i += 2) {
            System.out.print(i + ", ");
        }
    }

    public static void taskSeven() {
        int result = 0;
        for (int i = 1; i < 100; i += 2) {
            result += i;
        }
        System.out.println("Task 7 - " + result);
    }

    public static void main(String[] args) {
        taskOne();
        taskTwo();
        taskThree();
        taskFour(85, 158);
        taskFive();
        taskSix();
        taskSeven();
    }

}
