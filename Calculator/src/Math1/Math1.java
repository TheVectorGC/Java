package Math1;
import java.util.Scanner;
public class Math1 {
    private Scanner scanner = new Scanner(System.in);
    private double ugol;
    private String oper;
    public void math1() {
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
    }
    private void initialize() {
        System.out.println("Введите угол");
        ugol = scanner.nextDouble();
        System.out.println("Что вы хотите получить: sin, cos, tg или ctg?");
        scanner.nextLine();
        oper = scanner.nextLine();
    }
    private void repeat() {
        while (true) {
            System.out.println("Хотите продолжить? Да/Нет");
            String prodoljenie = scanner.nextLine();
            switch (prodoljenie) {
                case "Да":
                    initialize();
                    math1();
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
        math1();
        repeat();
    }






}