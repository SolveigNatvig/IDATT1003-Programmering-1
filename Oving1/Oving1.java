package Oving1;
import java.util.Scanner;

public class Oving1 {
    public static void main(String args[]) {
        // Oppgave 1
        double inches = 21;
        double centimetre = inches / 2.54;
        System.out.println(inches + " inches is equal to " + centimetre + " inches");

        // Oppgave 2
        int hours = 2;
        int minuttes = 4;
        int seconds = 6;
        int totalSeconds = hours * 60 * 60 + minuttes * 60 + seconds;
        System.out.println(hours + " hours + " + minuttes + " minuttes + " + seconds + " seconds is equal to " + totalSeconds + " seconds");

        // Oppgave 3
        Scanner scanner = new Scanner(System.in);

        System.out.print("How many seconds? ");
        int seconds1 = scanner.nextInt();

        int hours1 = seconds1 / (60 * 60);

        int minutes1 = (seconds1 % (60 * 60)) / 60;

        int secondsLeft = (seconds1 % (60 * 60)) - minutes1 * 60;

        System.out.println(seconds1 + " seconds is equal to: " + hours1 + " hours " + minutes1 + " minutes " + secondsLeft + " seconds");

        scanner.close();
    }
}
