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
            switch (arr1[i]) {
                case 0:
                    arr1[i] = 1;
                    break;
                case 1:
                    arr1[i] = 0;
                    break;
            }

            System.out.print(arr1[i] + " ");
        }

    }

    public static void task2() {
        int[] arr2 = new int[8];
        int n = 0;
        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = n++ * 3;
            System.out.print(arr2[i] + " ");
        }

    }

    public static void task3() {
        int[] arr3 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < arr3.length; i++) {

            if (arr3[i] < 6) {

                arr3[i] *= 2;

            } else {

                arr3[i] *= 1;

            }

            System.out.print(arr3[i] + " ");
        }
    }

    public static void task4() {
        int[][] arr4 = new int[5][5];
        int n;
        for (int i = 0; i < arr4.length; i++) {
            for (int j = 0; j < arr4[i].length; j++) {

                if (arr4[i] == arr4[j]) {

                    n = 1;

                    arr4[i][j] = n;

                } else {
                    n = 0;
                }


//                System.out.print(arr4[i][j] + "\t"); Alternative array output
                System.out.printf("%4d", arr4[i][j]);
            }
//            System.out.println(Arrays.toString(arr4[i])); Alternative array output
            System.out.println();
        }
    }  //Not ready

    public static void task5() {
        int[] arr5 = {5, 1, 7, 4, 11, 9};
        for (int i = 0; i < arr5.length; i++) {
            Arrays.sort(arr5);

        }
        System.out.println("Минимальное число: " + arr5[0]);
        System.out.println("Максимальное число: " + arr5[arr5.length - 1]);
    }

}


