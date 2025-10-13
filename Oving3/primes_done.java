package Oving3;
import java.util.Scanner;

class primes_done {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // While løkke som kjører helt til break
        while (true){ 
            System.out.println("Hvilket tall vil du sjekke om er et primtll? (dersom du ønsker å avslutte, skriv s)");
            String input = scan.nextLine();

            // Dersom input er S eller s
            if (input.equalsIgnoreCase("s")){
                System.out.println("Avslutter programmet...");
                break; // Ber while løkken om å avslutte 
            }

            else{
                int possiblePrime; //deklarerer variabel
                possiblePrime = Integer.parseInt(input); //tolker input som int

                boolean isPrime = true;
                int i = 2;
                while (i <= (Math.sqrt(possiblePrime))){
                    if ((possiblePrime % i) == 0){
                        isPrime = false;
                        System.out.println(possiblePrime + " Dette er ikke et  primtall");
                        break;
                    }
                    i++;
                }

                if (isPrime == true){
                System.out.println(possiblePrime + " Dette er et primtall");


                }

            }
            
        }
    
        scan.close();
    }
}
