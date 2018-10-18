import java.util.Scanner;
public class Naoborot {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("¬ведите слово которое хотите получить наоборот");
        String phrase = scanner.nextLine();
        int kolvo = phrase.length() - 1;
        char h = phrase.charAt(kolvo);
        String otvet = "";
        while(kolvo > 0) {
            otvet += h;           
            kolvo--;
            h = phrase.charAt(kolvo);
        }      
        otvet += h;		
        System.out.println(otvet);
    }
}

