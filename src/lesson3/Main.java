package lesson3;

import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void taskOne() {
        int[] array = new int[10];
        int startNumber = 2;
        for (int i = 0; i < array.length; i++) {
            array[i] = startNumber;
            startNumber += 2;
        }
        System.out.println("Task 1: ");
        for (int a : array) {
            System.out.print(a + " ");
        }
        System.out.println();

        for (int a : array) {
            System.out.println(a);
        }
    }

    public static void taskTwo() {
        System.out.println("Task 2:");
        int[] array = new int[50];
        int startNumber = 1;
        for (int i = 0; i < array.length; i++) {
            array[i] = startNumber;
            startNumber += 2;
        }
        for (int a : array) {
            System.out.print(a + " ");
        }

        System.out.println();

        for (int i = array.length - 1; i >= 0; i--) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    public static void taskThree() {
        System.out.println("Task 3:");
        int[] array = new int[15];
        var random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100);
        }
        for (int a : array) {
            System.out.print(a + " ");
        }
        System.out.println();

        int counter = 0;
        for (int a : array) {
            if (a % 2 == 0) {
                counter++;
            }
        }
        System.out.println("Number of even numbers - " + counter);
    }

    public static void taskFour() {
        System.out.println("Task 4:");
        int[] array = new int[20];
        var random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(20 + 1);
        }
        for (int a : array) {
            System.out.print(a + " ");
        }
        System.out.println();

        for (int i = 0; i < array.length; i += 2) {
            array[i] = 0;
        }

        for (int a : array) {
            System.out.print(a + " ");
        }
    }

    public static void taskFive() {
        System.out.println("Task 5:");

        var arrayOne = new int[5];
        var arrayTwo = new int[5];
        var random = new Random();

        // можно бы было в одном цикле заполнить 2 массива, но мне кажется,
        // что более правильно заполнить в разных циклах
        for (int i = 0; i < arrayOne.length; i++) {
            arrayOne[i] = random.nextInt(15 + 1);
        }
        System.out.println(Arrays.toString(arrayOne));

        for (int i = 0; i < arrayTwo.length; i++) {
            arrayTwo[i] = random.nextInt(15 + 1);
        }
        System.out.println(Arrays.toString(arrayTwo));

        int counterOne = 0;
        for (int i = 0; i < arrayOne.length; i++) {
            counterOne += arrayOne[i];
        }
        double arithmeticalMeanOne = counterOne / arrayOne.length;

        int counterTwo = 0;
        for (int i = 0; i < arrayOne.length; i++) {
            counterTwo += arrayTwo[i];
        }
        double arithmeticalMeanTwo = counterTwo / arrayTwo.length;

        if (arithmeticalMeanOne < arithmeticalMeanTwo) {
            System.out.println("Arithmetical mean of the  first array < arithmetical mean of the second array");
        } else if (arithmeticalMeanOne > arithmeticalMeanTwo) {
            System.out.println("Arithmetical mean of the  first array > arithmetical mean of the second array");
        } else {
            System.out.println("Arithmetical mean of the  first array = arithmetical mean of the second array");
        }
    }

    public static void taskSix() {
        System.out.println("Task 6: ");
        var array = new int[4];
        var random = new Random();

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(10 + 1);
        }
        System.out.println(Arrays.toString(array));

        var isIncreasingSequence = true;
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] <= array[i + 1]) {
                isIncreasingSequence = false;
                break;
            }
        }

        if (isIncreasingSequence) {
            System.out.println("The array is increasing sequence");
        } else {
            System.out.println("The array is not increasing sequence");
        }
    }

    public static void taskSeven() {
        System.out.println("Task 7:");
        var array = new int[12];
        var random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(15 + 1);
        }
        System.out.println(Arrays.toString(array));
        var index = 0;
        var maxValue = array[index];
        for (int i = 0; i < array.length; i++) {
            if (array[i] >= maxValue) {
                maxValue = array[i];
                index = i;
            }
        }
        System.out.println("Max value in the array - " + maxValue + ". Index of max value - " + index);
    }

    public static void main(String[] args) {
        taskOne();
        taskTwo();
        taskThree();
        taskFour();
        taskFive();
        taskSix();
        taskSeven();

    }
}
