package lesson3;

import java.util.Random;
import java.util.Scanner;

public class Hw3 {
    public static void main(String[] args) {
        task1();
    }

    public static void task1() {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        do {
            int nRandom = random.nextInt(10);
            System.out.println("Введите число от 0 до 9: ");
            for (int i = 3; i > 0; i--) {
                int nScanner = scanner.nextInt();
                if (nRandom == nScanner) {
                    System.out.println("Вы отгадали!");
                    break;
                }
                System.out.println(nScanner > nRandom ? "Ваше число больше" : "Ваше число меньше");
                System.out.println("У вас еще попыток: " + (i - 1));
            }
            System.out.println("Повторить игру еще раз? 1 – да / 0 – нет»(1 – повторить, 0 – нет)");
        } while (scanner.nextInt() == 1);
    }

    }



