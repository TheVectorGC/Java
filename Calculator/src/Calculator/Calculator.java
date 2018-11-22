package Calculator;
import java.util.Scanner;
public class Calculator {
    private int perv;
    private char znak;
    private int vtor;
    private Scanner scanner = new Scanner(System.in);
    public void calculate() {
        long otvet;
        switch (znak) {
            case '+':
                otvet = perv + vtor;
                System.out.println(otvet);
                break;
            case '-':
                otvet = perv - vtor;
                System.out.println(otvet);
                break;
            case '*':
                otvet = perv * vtor;
                System.out.println(otvet);
                break;
            case '/':
                double otvet1 = (double) perv / (double) vtor;
                System.out.println(otvet1);
                break;
            case '^':
                otvet = 1;
                while (vtor > 0) {
                    otvet *= perv;
                    vtor--;
                }
                System.out.println(otvet);
                break;
            case '%':
                otvet = perv % vtor;
                System.out.println(otvet);
                break;
            case 'F':
                otvet = 1;
                for(int i = 1;i-1<perv;i++) {
                    otvet *= i;
                }
                System.out.println("Факториал первого числа равен " + otvet );
                long otvet2 = 1;
                for(int i = 1;i-1<vtor;i++) {
                    otvet2 *= i;
                }
                System.out.println();
                System.out.println("Факториал второго числа равен " + otvet2 );
                break;
        }
    }
    private void initialize() {
        System.out.println("Введите первое число");
        perv = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Введите математический оператор (+,-,*,/,^,%,F)");
        znak = scanner.nextLine().charAt(0);
        System.out.println("Введите второе число");
        vtor = scanner.nextInt();
        scanner.nextLine();
    }
    private void repeat() {
        while (true) {
            System.out.println("Хотите продолжить?");
            String prodoljenie = scanner.nextLine();
            switch (prodoljenie) {
                case "Да":
                    initialize();
                    calculate();
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
        calculate();
        repeat();
    }

}


