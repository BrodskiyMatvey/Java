package lesson3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class MainLesson3 {
    public static void main(String[] args) throws IOException {
//        testString();
//        int[] arr = {0, 0, 0, 0, 0};
//        testArrayChange(arr.clone());
//        testArrayChange(arr.clone());
//        System.out.println(Arrays.toString(arr));

//        testOverload(3, 4);
//        testOverload(4, 5);
//        testOverload(2.4, 6.2);
//        testOverload(7);
//        testOverload(7.4);
//        testOverload(new int[]{1, 2, 3, 4, 5, 6, 7});
//        testOverload(1, 2, 3, 4, 5, 6, 7);

//        testConsoleInput();

        exampleFromGoogleConsoleInputInt();
//        exampleFromGoogleConsoleInputString();
//        exampleFromGoogleConsoleInputTheFirstWord();

//        testRandom();

//        print2DArray(new int[][]{{4, 5, 6}, {7, 8, 9}});

//        sumArray(new int[]{1, 2, 3, 4});
    }


    public static void testString() {
        String str1 = "Java";
        String str2 = "Java";
        String str3 = new String("Java");

        System.out.println(str1.equals(str2));
        System.out.println(str1.equals(str3));
    }

    public static void testArrayChange(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] += i;
        }
        System.out.println("method: " + Arrays.toString(arr));
    }

    private static void testOverload(int a, int b) {
        int multiple = a * b;
        System.out.printf("Произведение чисел: %d * %d = %d(int)%n", a, b, multiple);
    }

    private static void testOverload(double a, double b) {
        double multiple = a * b;
        System.out.printf("Произведение чисел: %.1f * %.1f = %.1f(double)%n", a, b, multiple);
    }

    private static void testOverload(double a) {
        double multiple = a * a;
        System.out.printf("Квадрат числа: %.1f = %.1f(double)%n", a, multiple);
    }

    private static void testOverload(int a) {
        testOverload((double) a);
    }

    private static void testOverload(int... a) {
        int multiple = 1;
        for (int i = 0; i < a.length; i++) {
            multiple *= a[i];
        }
        System.out.printf("Произведение всех чисел: %d%n", multiple);
    }

    private static void exampleFromGoogleConsoleInputInt() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите 2 любых целых числа: ");
        int number1 = sc.nextInt();//считывает первое число и присваивает значение в number1
        int number2 = sc.nextInt();//считывает второе число и присваивает значение в number2
        System.out.print(number1 + number2);//выводит сумму number1 + number2
    }

    private static void exampleFromGoogleConsoleInputString() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите любое слово или фразу: ");
        String phrase1 = sc.nextLine();
        System.out.println(phrase1);
    }

    private static void exampleFromGoogleConsoleInputTheFirstWord() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите любое слово или фразу: ");
        String phrase1 = sc.next();
        System.out.println(phrase1);
    }

    private static void testConsoleInput() throws IOException {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.hasNextInt() ? scanner.nextInt() : 0;
        if (a == 0) {
            scanner.next();
        }
        int b = scanner.nextInt();

        testOverload(a, b);

    }

    private static void testRandom() {
        Random random = new Random();

        int[] data = new int[30];

        for (int i = 0; i < data.length; i++) {
            data[i] = random.nextInt(10); //0 - 9
            data[i] = random.nextInt(8) + 3; //3 - 10
            data[i] = random.nextInt(12) - 5; //-5 - +6

            data[i] = (int) (Math.random() * 10); //0 - 9
            data[i] = (int) (Math.random() * 8) + 3; //3 - 10
            data[i] = (int) (Math.random() * 12) - 5; //-5 - +6
        }

        System.out.println(Arrays.toString(data));
    }


    public static void print2DArray(int[][] arr) {
        for (int i = 0; i <= arr[0].length; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
        for (int i = 0; i < arr.length; i++) {
            System.out.print(i + 1 + " ");
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void sumArray(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }

        System.out.println(sum);
    }


}
