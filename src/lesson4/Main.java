package lesson4;

import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
//        Создайте два массива из 10 целых случайных чисел из отрезка [0;9] и третий
//        массив из 10 действительных чисел. Каждый элемент с i-ым индексом третьего
//        массива должен равняться отношению элемента из первого массива с i-ым
//        индексом к элементу из второго массива с i-ым индексом. Вывести все три
//        массива на экран (каждый на отдельной строке), затем вывести количество
//        целых элементов в третьем массиве.
        var arrayOne = new int[10];
        var arrayTwo = new int[10];
        var arrayThree = new double[10];
        var random = new Random();

        for(int i = 0; i<arrayOne.length; i++){
            arrayOne[i] = random.nextInt(10);
            arrayTwo[i] = random.nextInt(10);
        }

        for(int i = 0; i<arrayOne.length; i++){
            arrayThree[i] = arrayOne[i]/arrayTwo[i];
        }


        System.out.println(Arrays.toString(arrayOne));
        System.out.println(Arrays.toString(arrayTwo));
        System.out.println(Arrays.toString(arrayThree));

        var counter = 0;
        for(int i = 0; i<arrayThree.length; i++){
            if(arrayThree[i]%10 == 0){
                counter++;
            }
        }

        System.out.println(counter);
    }
}
