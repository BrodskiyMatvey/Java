package lesson1;

public class Hw {
    public static void main(String[] args) {
        exercise2();
        exercise3(2, 5, 10, 2);
        exercise4(10, 2);
        exercise5(1);
        exercise6(-5);
        exercise7("Матвей");
        exercise8(2020);
    }

    public static void exercise2() {
        byte varA = 2;
        short varB = 500;
        int varC = 5;
        long varD = 10000L;
        float varE = 1.5f;
        double varF = 2.5;
        char varG = 150;
        boolean varH = true;
    }

    public static double exercise3(double a, double b, double c, double d) {
        double result = a * (b + (c / d));
        System.out.println(result);
        return result;
    }

    public static boolean exercise4(int a, int b) {
        int sum = a + b;

        if (sum >= 10 & sum <= 20) {
            System.out.println("True");
            return true;
        } else {
            System.out.println("False");
            return false;
        }

    }

    public static void exercise5(int a) {
//        if (a < 0) {
//            System.out.println("Число - отрицательное");
//        } else if (a >= 0) {
//            System.out.println("Число - положительное");
//        }
        String word = (a < 0) ? "negative" : "positive";
        System.out.printf("This number(%d) is %s%n", a, word);
    }

    public static boolean exercise6(int a) {
        if (a < 0) {
            System.out.println("True");
            return true;
        } else {
            System.out.println("False");
            return false;
        }
    }

    public static void exercise7(String name) {
//        System.out.println("Привет, " + name + "!");
        System.out.printf("Hello, %s%n", name);
    }

    public static void exercise8(int year) {
        if (year % 4 == 0) {
            System.out.println("Год - високосный");
        } else {
            System.out.println("Год - невисокосный");
        }
    }
}

