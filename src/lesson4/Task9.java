package lesson4;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task9 {
//    Пользователь должен указать с клавиатуры положительное число, а
//    программа должна создать массив указанного размера из случайных целых
//    чисел из [0;15] и вывести его на экран в строку. После этого программа должна
//    определить и сообщить пользователю о том, сумма какой половины массива
//    больше: левой или правой, либо сообщить, что эти суммы модулей равны. Если
//    пользователь введёт неподходящее число, то выдать соответствующее
//    сообщение

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        var random = new Random();
        int number;
        while (true) {
            if (scanner.hasNextInt()) {
                number = scanner.nextInt();
                if (number > 0) {
                    break;
                }
            }
            System.out.println("Вы ввели не целое число");
            scanner.nextLine();
        }
        var array = new int[number];
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(15 + 1);
        }
        System.out.println(Arrays.toString(array));
        var sum1 = 0;
        var sum2 = 0;
        for (int i = 0; i < array.length / 2; i++) {
            sum1 = sum1 + array[i];
        }
        for (int i= args.length/2; i<array.length; i++){
            sum2 = sum2 + array[i];
        }

        if(sum1 > sum2){
            System.out.println("Сумма левой части больше правой части");
        }else if(sum1 < sum2){
            System.out.println("Cумма правой части больше левой части");
        }else {
            System.out.println("Суммы равны");
        }
    }
}
