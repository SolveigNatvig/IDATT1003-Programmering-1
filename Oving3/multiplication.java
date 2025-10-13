package Oving3;
import java.util.Scanner;

class multiplication {
    public static void main(String[] args) {
        Scanner putin = new Scanner(System.in);
        System.out.println("Dette programmet skriver ut gangetabellen fra 1 til 10, fror et tall du velger til ett annet tall du velger. Velg to tall: ");
        int number1 = putin.nextInt();
        int number2 = putin.nextInt();

        while (number1 != number2+1){
            System.out.println(number1 + " - gangeren:");
            for (int i = 1; i < 10+1; i++){
                System.out.println(number1 + " x " + i + " = " + i*number1);
            }
            System.out.println(" ");
            number1 += 1;
        }

        putin.close();

    }

}