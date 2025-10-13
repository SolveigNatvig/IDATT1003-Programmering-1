package Oving2;
// Øving 2 oppgave 2 Kilopris 

public class kiloPrice {
    static double pricePerKilo(double price, double kg) {
        Double kiloPrice = price/kg;
        return kiloPrice;
    }
    public static void main(String[] args) {

        // Meat A
        double meatAPrice = 35.90;
        double meatAWeight = 0.450; // kg
        
        // Meat B
        double meatBPrice = 39.50;
        double meatBWeight = 0.500; // kg

        double meatAPerKilo = pricePerKilo(meatAPrice, meatAWeight);
        double meatBPerKilo = pricePerKilo(meatBPrice, meatBWeight);

        if (meatAPerKilo > meatBPerKilo){
            System.out.println("Meat B is less expensive than Meat A per kg.");
        }
        else if (meatAPerKilo < meatBPerKilo){
            System.out.println("Meat A is less expensive than Meat B per kg.");
        }
        else {
            System.out.println("Meat A and Meat B is equally expensive");
        }
    }
}
