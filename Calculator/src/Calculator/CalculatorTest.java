package Calculator;
import java.util.Scanner;
public class CalculatorTest {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите математический оператор");
        char znak = scanner.nextLine().charAt(0);
        System.out.println("Введите первое число");
        int perv = scanner.nextInt();
        System.out.println("Введите второе число");
        int vtor = scanner.nextInt();
        calculator.calculate(znak, perv, vtor);
    }
}
