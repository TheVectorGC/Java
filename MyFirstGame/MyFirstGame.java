import java.util.Scanner;
public class MyFirstGame {
    public static void main(String[] args) {
        double nedorandom = Math.random() * 100;
        int random = (int) nedorandom;
        Scanner scanner = new Scanner(System.in);
        System.out.println("������� ����� �� 1 �� 100");
        boolean vau = false;
        int chislo = scanner.nextInt();
        while (vau = true) {
            if (chislo < random) {
                vau = false;
                System.out.println("�������� ����� ������ ��� ���������� �����������");
            } else if (chislo > random) {
                vau = false;
                System.out.println("�������� ����� ������ ��� ���������� �����������");
            } else {
                vau = true;
                System.out.println("�� ������� �����, ���!");
            }
        	chislo = scanner.nextInt();
        }        
    }
}
