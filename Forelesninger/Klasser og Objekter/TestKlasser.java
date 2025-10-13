
// KLASSER OG OBJEKTER

class Katter{
    String navn;
    String farge;
    int alder;
    boolean kjonn;

    void presenterKatt(){
        if (kjonn == false){
            System.out.println("Dette er en katt som heter " + navn + ". Han er en " + alder + " gammel med " + farge + " pels");
        }
        else{
            System.out.println("Dette er en katt som heter " + navn + ". Hun er en " + alder + " gammel med " + farge + " pels");
        }
    }
}

public class TestKlasser{
    public static void main(String[] args) {
        
        // Lager et objekt og tildeler egenskaper
        Katter k1 = new Katter();
        k1.navn = "Juli";
        k1.farge = "Hvit";
        k1.alder = 3;
        k1.kjonn = true;

        k1.presenterKatt();


    }
}

// UML (unified modelling language)