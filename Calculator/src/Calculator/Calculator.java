package Calculator;

public class Calculator {
    public void calculate(char znak, int perv, int vtor) {
        if (znak == '+') {
            long otvet = perv + vtor;
            System.out.println(otvet);
        } else if (znak == '-') {
            long otvet = perv - vtor;
            System.out.println(otvet);
        } else if (znak == '*') {
            long otvet = perv * vtor;
            System.out.println(otvet);
        } else if (znak == '/') {
            double otvet = (double) perv / (double) vtor;
            System.out.println(otvet);
        } else if (znak == '^') {
            long otvet = 1;
            while (vtor > 0) {
                otvet = perv * otvet;
                vtor--;
            }
            System.out.println(otvet);
        } else if (znak == '%') {
            long otvet = perv % vtor;
            System.out.println(otvet);
        }
    }
}
