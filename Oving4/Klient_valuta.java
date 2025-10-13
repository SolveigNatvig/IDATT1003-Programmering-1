package Oving4;
import java.util.Scanner;

public class Klient_valuta {
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Lager objekter for hver av valutaene
        Valuta nok = new Valuta("NOK", 1);
        Valuta sek = new Valuta("SEK", 1.5);
        Valuta usd = new Valuta("USD", 10);
        Valuta eur = new Valuta("EUR", 11.6);

        boolean run = true;

        // Kjører så lenge run = true
        while (run){
            System.out.println("Velg valuta å konvertere til:");
            System.out.println("1: Amerikanske dollar (USD)");
            System.out.println("2: Euro (EUR)");
            System.out.println("3: Svenske kroner (SEK)");
            System.out.println("4: Norske kroner (NOK)");
            System.out.println("5: Avslutt");
            int newValuta = Integer.parseInt(scan.nextLine());

            // Lager en "variabel" for oblektet (valutaen) bruker vil konvertere til
            Valuta to = null;

            if (newValuta == 1){
                to = usd;
            }
            else if (newValuta == 2){
                to = eur;
            }
            else if (newValuta == 3){
                to = sek;
            }
            else if (newValuta == 4){
                to = nok;
            }
            else if (newValuta == 5){
                System.out.println("Avslutter programmet...");
                run = false;
                break;
            }


            
            System.out.println("Skriv inn hvilken valuta du bruker nå (USD, EUR, SEK, NOK): ");
            String valuta = scan.nextLine().toUpperCase();

            // Lager en "variabel" for oblektet (valutaen) bruker vil konvertere fra
            Valuta from = null; 

            if (valuta.equals("NOK")){
                from = nok;
            }

            else if (valuta.equals("SEK")){
                from = sek;
            }

            else if (valuta.equals("USD")){
                from = usd;
            }

            else if (valuta.equals("EUR")){
                from = eur;
            }


            System.out.println("Enter amount: ");
            double amount = scan.nextDouble();
            scan.nextLine();


            System.out.println(String.format("%.2f", from.toOtherCurrency(amount, to)) + " " + valuta);

        }

        scan.close();
    }
}
