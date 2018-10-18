import java.util.Scanner;

public class HelloWorld {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите свою земную массу в килограммах");
        double mass = scanner.nextDouble();
        mass = mass / 100 * 17;
        System.out.println(mass);
    }
}

