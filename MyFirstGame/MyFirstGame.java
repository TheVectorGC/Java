import java.util.Scanner;
public class MyFirstGame {
    public static void main(String[] args) {
        double nedorandom = Math.random() * 100;
        int random = (int) nedorandom;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число от 1 до 100");
        boolean vau = false;
        int chislo = scanner.nextInt();
        while (vau = true) {
            if (chislo < random) {
                vau = false;
                System.out.println("Введённое число меньше чем загаданное компьютером");
            } else if (chislo > random) {
                vau = false;
                System.out.println("Введённое число больше чем загаданное компьютером");
            } else {
                vau = true;
                System.out.println("Вы угадали число, ВАУ!");
            }
        	chislo = scanner.nextInt();
        }        
    }
}
