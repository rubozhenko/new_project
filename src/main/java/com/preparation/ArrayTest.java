package com.preparation;

public class ArrayTest {
    public static void main(String[] args) {
//        new SomeClass().sing();
//        printLastLetters("Learning to write programs");
//        printLastLetters("Learning to write");
////        System.out.println(gProgress(3,9));
//        System.out.println(arraySum(new int[]{1,2,3,4,5}));
    }

    public static int gProgress(int step, int resultIndex) {
        int[] winArray = new int[resultIndex + 1];
        winArray[0] = 1;
        for (int i = 0; i <= winArray.length - 2; i++) {
            winArray[i + 1] = winArray[i] * step;

        }
        return winArray[resultIndex];
    }

    // Метод для додавання всіх чисел масиву
    // arr - масив який ми маємо передати в метод для виконання
    public static int arraySum(int[] arr) {
        // Створюємо змінну, в яку будемо додавати наші числа і яка і буде в резутьтаті сумою усіх чисел
        int sum = 0;
        // Цикл для того щоб по одному діставати усі значення (числа) з масиву
        // і - використовується як індекс, індекс першого елемента масиву 0, тому початкове значення "і" в нас теж 0
        // з кожним насиупним проходом цикла ми хочемо перейти на наступний елемент масива, тому збільшуємо "і" на 1
        // arr.length-1 - індекс останнього елемента масива, відповідно "і" збільшується і цикл виконується до моменту
        // поки "і" не дорівнюватиме індексу останнього елемента
        for (int i = 0; i <= arr.length - 1; i++) {
            // Ми додаємо до загальної суми "sum" нове число з масиву, кожного виконання циклу
            sum = sum + arr[i];
        }
        // Повертаємо занальну суму в метод який викликав даний метод

        return sum;
    }

    public static void printLastLetters(String sentence) {
        int size = sentence.length();
        char lastSymbol =  sentence.charAt(size-1);
        char oneBeforeLastSymbol = sentence.charAt(size - 2);
        System.out.println(lastSymbol);
        System.out.println(oneBeforeLastSymbol);
    }
}
