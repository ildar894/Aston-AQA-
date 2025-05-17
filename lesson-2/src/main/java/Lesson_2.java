public class Lesson_2 {
    public static void main(String[] args) {
        // Задание 1: Печать трех слов
        System.out.println("Задание 1 printThreeWords():");
        printThreeWords();
        System.out.println();

        // Задание 2: Проверка знака суммы
        System.out.println("Задание 2 checkSumSign():");
        checkSumSign(5, 10);
        System.out.println();

        // Задание 3: Печать цвета
        System.out.println("Задание 3 printColor():");
        printColor(5);
        System.out.println();

        // Задание 4: Сравнение чисел
        System.out.println("Задание 4 compareNumbers():");
        compareNumbers(5, 10);
        System.out.println();

        // Задание 5: Проверка суммы в диапазоне
        System.out.println("Задание 5 checkSumInRange():");
        checkSumInRange(5, 10);
        System.out.println();

        // Задание 6: Проверка положительного или отрицательного числа
        System.out.println("Задание 6 checkPositiveOrNegative():");
        checkPositiveOrNegative(5);
        System.out.println();

        // Задание 7: Проверка положительного или отрицательного числа (boolean)
        System.out.println("Задание 7 checkBooleanPositiveOrNegative():");
        checkBooleanPositiveOrNegative(-5);
        System.out.println();

        // Задание 8: Печать строки указанное количество раз
        System.out.println("Задание 8 printString():");
        printString("Hello, World!", 5);
        System.out.println();

        // Задание 9: Проверка года на високосность
        System.out.println("Задание 9 checkYear():");
        checkYear(2025);
        System.out.println();

        // Задание 10: Изменение массива
        System.out.println("Задание 10 changingTheArray():");
        changingTheArray();
        System.out.println();
        System.out.println();

        // Задание 11: Пустой массив
        System.out.println("Задание 11 emptyArray():");
        emptyArray();
        System.out.println();
        System.out.println();

        // Задание 12: Умножение массива на два
        System.out.println("Задание 12 multiplyTheArrayByTwo():");
        multiplyTheArrayByTwo();
        System.out.println();
        System.out.println();

        // Задание 13: Диагональный массив
        System.out.println("Задание 13 diagonalArray():");
        diagonalArray();
        System.out.println();

        // Задание 14: Пример массива
        System.out.println("Задание 14 arrayExample():");
        arrayExample(5, 10);
        System.out.println();
    }

    public static void printThreeWords() {
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }

    public static void checkSumSign(int a, int b) {
        int sum = a + b;
        if (sum >= 0) {
            System.out.println("Сумма положительная");
        } else {
            System.out.println("Сумма отрицательная");
        }
    }

    public static void printColor(int value) {
        if (value <= 0) {
            System.out.println("Красный");
        } else if (value > 0 && value <= 100) {
            System.out.println("Желтый");
        } else {
            System.out.println("Зеленый");
        }
    }

    public static void compareNumbers(int a, int b) {
        if (a >= b) {
            System.out.println("a >= b");
        } else {
            System.out.println("a < b");
        }
    }

    public static boolean checkSumInRange(int a, int b) {
        int sum = a + b;
        boolean result = (sum >= 10 && sum <= 20);
        System.out.println(result);
        return result;
    }

    public static void checkPositiveOrNegative(int num) {
        if (num < 0) {
            System.out.println("Number is negative");
        } else {
            System.out.println("Number is positive");
        }
    }

    public static boolean checkBooleanPositiveOrNegative(int num) {
        boolean result = (num < 0);
        System.out.println(result);
        return result;
    }

    public static void printString(String str, int count) {
        for (int i = 0; i < count; i++) {
            System.out.println(str);
        }
    }

    public static boolean checkYear(int year) {
        boolean result = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
        System.out.println(result);
        return result;
    }

    public static void changingTheArray() {
        int[] array = {1, 1, 0, 0, 1, 1, 0, 0};

        for (int i = 0; i < array.length; i++) {
            array[i] = (array[i] == 0) ? 1 : 0;
        }

        for (int num : array) {
            System.out.print(num + " ");
        }
    }

    public static void emptyArray() {
        int[] array = new int[100];

        for (int i = 0; i < array.length; i++) {
            array[i] = i + 1;
        }

        for (int num : array) {
            System.out.print(num + " ");
        }
    }

    public static void multiplyTheArrayByTwo() {
        int[] array = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};

        for (int i = 0; i < array.length; i++) {
            if (array[i] < 6) {
                array[i] *= 2;
            }
        }

        for (int num : array) {
            System.out.print(num + " ");
        }
    }

    public static void diagonalArray() {
        int size = 5;
        int[][] array = new int[size][size];

        for (int i = 0; i < size; i++) {
            array[i][i] = 1;
        }

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void arrayExample(int len, int initialValue) {
        int[] array = createArray(len, initialValue);
        for (int value : array) {
            System.out.print(value + " ");
        }
    }

    public static int[] createArray(int len, int initialValue) {
        int[] array = new int[len];
        for (int i = 0; i < len; i++) {
            array[i] = initialValue;
        }
        return array;
    }
}


