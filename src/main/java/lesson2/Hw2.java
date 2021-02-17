package lesson2;

import java.util.Arrays;

public class Hw2 {
    public static void main(String[] args) {
//        example();
//        task1();
//        task2();
//        task3();
//        task4();
//        task5();
//        System.out.println(task6(new int[]{1, 3, 1, 5}));
//        task7(new int[]{1, 2, 3, 4, 5}, 1);
    }

    public static void example() {
        int[] arr = new int[6];
        arr[0] = 5;
        arr[1] = 10;

//        for (int o : arr) {
//            System.out.print(o + " ");
//        }

//        System.out.println(Arrays.toString(arr));

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

    }

    public static void task1() {
        int[] arr1 = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        for (int i = 0; i < arr1.length; i++) {
            /*switch (arr1[i]) {
                case 0:
                    arr1[i] = 1;
                    break;
                case 1:
                    arr1[i] = 0;
                    break;
            }*/

            arr1[i] = (arr1[i] == 0) ? 1 : 0; //Alternative

            System.out.print(arr1[i] + " ");
        }

    }

    public static void task2() {
        int[] arr2 = new int[8];
        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = i * 3;
            System.out.print(arr2[i] + " ");
        }

    }

    public static void task3() {
        int[] arr3 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < arr3.length; i++) {

            if (arr3[i] < 6) {

//                arr3[i] *= 2;
                arr3[i] = arr3[i] * 2; //Alternative

            }

            System.out.print(arr3[i] + " ");
        }
    }

    public static void task4() {
        int[][] arr4 = new int[5][5];
        int lastIndex = arr4.length - 1;
        for (int i = 0; i < arr4.length; i++) {
            arr4[i][i] = arr4[i][lastIndex - i] = 1;

            System.out.println(Arrays.toString(arr4[i]));
        }
    }

    public static void task5() {
        int[] arr5 = {5, 1, 7, 4, 11, 9};
        for (int i = 0; i < arr5.length; i++) {
            Arrays.sort(arr5);
        }

        System.out.println("Минимальное число: " + arr5[0]);
        System.out.println("Максимальное число: " + arr5[arr5.length - 1]);

    }

    public static boolean task6(int[] arr6) {
        int leftSum = 0;
        int rightSum = sum(arr6, 0, arr6.length);
        boolean result = false;

        if (rightSum % 2 != 0) {
            return false;
        }

        for (int i = 0; i < arr6.length; i++) {
            leftSum += arr6[i];
            rightSum -= arr6[i];

            if (leftSum == rightSum) {
                result = true;
            } else if (leftSum > rightSum) {
                return result;
            }
        }
        return result;
    }

    public static int sum(int[] arr6, int start, int end) {
        int sum = 0;
        for (int i = start; i < end; i++) {
            sum += arr6[i];
        }
        return sum;
    }

    public static void task7(int[] arr7, int n) {
        int shiftNumber = n % arr7.length;
        if (shiftNumber < 0) {
            shiftLeft(arr7, shiftNumber);
        } else {
            shiftRight(arr7, shiftNumber);
        }
        System.out.println(Arrays.toString(arr7) + "; shiftNumber = " + n);
    }

    public static void shiftRight(int[] arr7, int n) {
        for (int i = 0; i < Math.abs(n); i++) {
            int lastValue = arr7[arr7.length - 1];
            for (int j = arr7.length - 1; j > 0; j--) {
                arr7[j] = arr7[j - 1];
            }
            arr7[0] = lastValue;
        }
    }

    public static void shiftLeft(int[] arr7, int n) {
        for (int i = 0; i < Math.abs(n); i++) {
            int firstValue = arr7[0];
            for (int j = 0; j < arr7.length; j++) {
                arr7[j] = arr7[j + 1];
            }
            arr7[0] = firstValue;
        }
    }

}


