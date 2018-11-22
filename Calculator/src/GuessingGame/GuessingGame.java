package GuessingGame;

import java.util.Scanner;
public class GuessingGame {
    public static void main(String[] args) {
        String prodoljenie = "Да";
        while(prodoljenie.equals("Да")) {
            double nedorandom = Math.random() * 100;
            int random = (int) nedorandom;
            Scanner scanner = new Scanner(System.in);
            System.out.println("Введите количество игроков");
            int igroki = scanner.nextInt();
            System.out.println("Первый игрок вводит число от 1 до 100");
            int chislo = scanner.nextInt();
            int hod = 2;
            while (true) {
                if (chislo < random) {
                    System.out.println("Введённое число меньше чем загаданное компьютером");
                } else if (chislo > random) {
                    System.out.println("Введённое число больше чем загаданное компьютером");
                } else {
                    System.out.println("Игрок №" + (hod - 1) + " победил!!!");
                    break;
                }
                System.out.println("Ходит игрок №" + hod);
                chislo = scanner.nextInt();
                if (hod < igroki) {
                    hod++;
                } else {
                    hod = 1;
                }
            }
            System.out.println("Хотите продолжить? Да/Нет");
            scanner.nextLine();
            prodoljenie = scanner.nextLine();
        }
    }
}
