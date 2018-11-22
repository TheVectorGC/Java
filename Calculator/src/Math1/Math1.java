package Math1;
import java.util.Scanner;
public class Math1 {
    public static void main(String[] args) {
        String prodoljenie = "Да";
        Scanner scanner = new Scanner(System.in);
        while(prodoljenie.equals("Да")) {
            System.out.println("Введите угол");
            double ugol = scanner.nextDouble();
            System.out.println("Что вы хотите получить: sin, cos, tg или ctg?");
            scanner.nextLine();
            String oper = scanner.nextLine();
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
            int c = (int) (otvet * 1000000000);
            otvet = (double) c / 1000000000;
            System.out.println(otvet);
            System.out.println("Хотите продолжить? Да/Нет");
            prodoljenie = scanner.nextLine();
        }
    }
}