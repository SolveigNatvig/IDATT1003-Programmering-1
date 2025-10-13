
import java.util.Scanner;

public class input {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Hva heter du? ");
        String navn = scanner.nextLine();

        System.out.println("Hei, " + navn + "!");

        scanner.close();
    }
} 
