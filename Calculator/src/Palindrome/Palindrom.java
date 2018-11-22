package Palindrome;
import java.util.Scanner;
public class Palindrom {
    public static void main(String[] args) {
        String prodoljenie = "Да";
        while(prodoljenie.equals("Да")) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Введите любую фразу или число");
            String phrase = scanner.nextLine();
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
            System.out.println("Хотите продолжить? Да/Нет");
            prodoljenie = scanner.nextLine();
        }
    }
}
