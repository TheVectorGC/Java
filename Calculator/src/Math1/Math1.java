package Math1;
import java.util.Scanner;
public class Math1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Введите угол");
        double ugol = scanner.nextDouble();
        System.out.println("Что вы хотите получить: sin, cos, tg или ctg?");
        String oper = scanner1.nextLine();
        double radians = Math.toRadians(ugol);
        double sin = Math.sin(radians);
        double cos = Math.cos(radians);
        double otvet;
        switch (oper) {
            case "sin":
                otvet = Math.sin(radians);
                break;
            case "cos":
                otvet = Math.cos(radians);
                break;
            case "tg":
                otvet = Math.tan(radians);
                break;
            default:
                otvet = cos / sin;
                break;
        }
        System.out.println(otvet);
    }
}