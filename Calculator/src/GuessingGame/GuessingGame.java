package GuessingGame;

import java.util.Scanner;
public class GuessingGame {
    private Scanner scanner = new Scanner(System.in);
    private int igroki;
    private int chislo;
    private String[] a;
    private int[] b;
    public void guessinggame() {
        double nedorandom = Math.random() * 100;
        int random = (int) nedorandom;
        int hod = 2;
        while (true) {
            if (chislo < random) {
                System.out.println("Введённое число меньше чем загаданное компьютером");
            } else if (chislo > random) {
                System.out.println("Введённое число больше чем загаданное компьютером");
            } else {
                    System.out.println(a[hod-1] + " угадал на " + b + "ходу!" );
                    break;
                }
            }
            System.out.println("Ходит игрок №" + hod);
            chislo = scanner.nextInt();
            if (hod < igroki) {
                hod++;
            } else {
                hod = 1;
            }
        }
    private void initialize() {
        System.out.println("Введите количество игроков");
        igroki = scanner.nextInt();
        System.out.println("Игрок вводит число от 1 до 100");
        chislo = scanner.nextInt();
    }
    private void repeat() {
        while (true) {
            System.out.println("Хотите продолжить? Да/Нет");
            String  prodoljenie = scanner.nextLine();
            switch (prodoljenie) {
                case "Да":
                    initialize();
                    guessinggame();
                    break;
                case "Нет":
                    return;
                default:
                    System.out.println("Вы ввели неправильное значение");
                    break;
            }
        }
    }
    public void start() {
        initialize();
        player();
        guessinggame();
        repeat();
    }
    private void player() {
        a = new String[igroki];
        for (int i = 0; i < igroki; i++, a[i]=scanner.nextLine());
        b = new int[10000];
        for (int i = 0; i < 10000; i++, b[i] = i);
    }
}
