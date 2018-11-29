package Palindrome;
import java.util.Scanner;
public class Palindrom {
    private Scanner scanner = new Scanner(System.in);
    private String phrase;
    public void palindrom() {
            int kolvo = phrase.length();
            int ch = 0;
            for (int i = 0; i < kolvo / 2; i++) {
                char last = phrase.charAt(kolvo - 1);
                char first = phrase.charAt(i);
                if (first == last) {
                    ch = 1;
                } else {
                    System.out.println("Это не палиндром!");
                    ch = 0;
                    break;
                }
                kolvo--;
            }
            if (ch == 1) {
                System.out.println("Это палиндром!");
        }
    }
    private void initialize() {
        System.out.println("Введите любую фразу или число");
        phrase = scanner.nextLine();
    }
    private void repeat() {
        while (true) {
            System.out.println("Хотите продолжить? Да/Нет");
            String prodoljenie = scanner.nextLine();
            switch (prodoljenie) {
                case "Да":
                    initialize();
                    palindrom();
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
        palindrom();
        repeat();
    }
}
