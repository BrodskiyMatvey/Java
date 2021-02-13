package lesson2;

import java.util.Arrays;

public class MainLesson2 {
    public static void main(String[] args) {
//        System.out.println(seasonSwitch(1));
//        testFor();
//        testWhile();
        testArray();
    }

    public static String seasonSwitch(int seasonNumber) {
        String season;

        switch (seasonNumber) {
            case 1:
                season = "Winter";
                break;
            case 2:
                season = "Spring";
                break;
            case 3:
                season = "Summer";
                break;
            case 4:
                season = "Fall";
                break;
            default:
                season = "Unknown season";
        }

        return season;
    }


    public static void testFor() {
        int i = 0;

        for (; i < 10; i++) {
            if (i % 2 == 0) {
                continue;
            }
            System.out.println(i);
        }
        System.out.println("Final i: " + i);
    }

    public static void testWhile() {
        int i = 0;

        while (i < 10) {
            System.out.println(i);
            i++;
        }
    }

    public static void testArray() {
        final int SIZE = 7;

        int[] data = new int[SIZE];

        data[0] = 3;
        data[3] = 5;
        data[4] = 6;

//        System.out.println(data);
//
//        for (int i = 0; i < data.length; i++) {
//            System.out.println(data[i]);
//        }
        Arrays.sort(data);
        System.out.println(Arrays.toString(data));
        System.out.println(Arrays.toString(new int[]{1, 2, 3, 4, 5, 6, 7}));

        int[][] deepData = new int[SIZE][SIZE];
        int n = 0;
        for (int i = 0; i < deepData.length; i++) {
            for (int j = 0; j < deepData[i].length; j++) {
                deepData[i][j] = ++n;
            }
        }

        for (int i = 0; i < deepData.length; i++) {
            for (int j = 0; j < deepData[i].length; j++) {
                System.out.printf("%3d", deepData[i][j]);
            }
            System.out.println();
        }
    }
}
