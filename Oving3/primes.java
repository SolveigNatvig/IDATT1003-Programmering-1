package Oving3;
import java.util.Scanner;

class primes {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Hvilket tall vil du sjekke om er et primtll? ");
        int possiblePrime = scan.nextInt();

        boolean isPrime = true;
        int i = 2;
        while (i <= (Math.sqrt(possiblePrime))){
            if ((possiblePrime % i) == 0){
                isPrime = false;
                System.out.println("Dette er ikke et primtall");
                break;
            }
            i++;
        }

        if (isPrime == true){
            System.out.println("Dette er et primtall");
        }
       
        scan.close();
    }
}
