package lesson4;

public class Homework {
    public static void main(String[] args) {
        //создал один массив для всех заданий, ради экономии места и времени
        int n = 5;
        int m = 5;
        int[][] array = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                array[i][j] = (int) (Math.random() * 10);
            }
        }

        System.out.println("Исходная матрица:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(array[i][j] + "  ");
            }
            System.out.println();
        }

        //  1) Почитать сумму четных элементов стоящих на главной диагонали.
        int sum = 0;
        for (int i = 0; i < n; i++) {
            if (array[i][i] % 2 == 0) {
                sum = sum + array[i][i];
            }
        }
        System.out.println("Задание 1. Сумма четных элементов главной диагонали равна - " + sum);

        //  2)Вывести нечетные элементы находящиеся под главной диагональю(включительно).
        System.out.print("Задание 2. Нечетные элементы под главной диагональю -  ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                if (array[i][j] % 2 != 0) {
                    System.out.print(array[i][j] + " ");
                }
            }
        }
        System.out.println();

        //  3)Проверить произведение элементов какой диагонали больше.
        int productMain = 1;
        int productSide = 1;

        for (int i = 0; i < n; i++) {
            productMain = productMain * array[i][i];
        }

        for (int i = 0, j = m - 1; i < n; i++, j--) {
            productSide = productSide * array[i][j];
        }

        System.out.print("Задание 3. ");
        if (productMain > productSide) {
            System.out.println("Произведение элементов главной диагонали" +
                    " больше чем произвение элементов побочной диагонали");
        } else if (productSide > productMain) {
            System.out.println("Произведение элементов побочной диагонали" +
                    " больше чем произведение элементов главной диагонали");
        } else {
            System.out.println("Произведения диагоналей равны");
        }

        //  4)Посчитать сумму четных элементов стоящих над побочной диагональю (не включительно)
        int sumEvenElement = 0;
        int x = m - 1;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < x; j++) {
                if (array[i][j] % 2 == 0) {
                    sumEvenElement = sumEvenElement + array[i][j];
                }
            }
            x--;
        }
        System.out.println("Задание 4. Сумма четных элементов над побочной диагональю - " + sumEvenElement);

        //  5)Транспонировать матрицу(1 столбец станет 1-й строкой, 2-й столбец - 2-йстрокой и т. д.)
        int[][] transposedMatrix = new int[5][5];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                transposedMatrix[i][j] = array[j][i];
            }
        }
        System.out.println("Задание 5. Транспонированная матрица:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(transposedMatrix[i][j] + "  ");
            }
            System.out.println();
        }
    }
}
