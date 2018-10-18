import java.util.Scanner;
public class SecondHelloWorld {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите фразу");
        String phrase = scanner.nextLine();
        int prob = 0;
        int simv = 0;
        char simvol = phrase.charAt(simv);
        while (simvol != '.') {
            if(simvol == ' ') {
                prob++;
            }
            else {}
            simv++;
            simvol = phrase.charAt(simv);
        }
        System.out.println(prob);
    }
}
