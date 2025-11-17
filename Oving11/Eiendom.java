package IDATT1003_Programmering_1.Oving11;

/*
 * Klassen Eiendom representerer en eiendom i et eiendomsregister.
 * Den inneholder informasjon om kommunenummer, kommunenavn, gårdsnummer (gnr),
 * bruksnummer (bnr), bruksnavn, areal og eier.
 *
 * Mutator-metoder (settere) er inkludert for felt som er naturlige å kunne endre:
 *  - eier: Eiendom kan skifte eier.
 *  - bruksnavn: Et bruksnavn kan endres over tid.
 *  - areal: Areal kan justeres ved målefeil eller justering av tomtegrenser.
 *
 * Øvrige felt (kommunenummer, gnr, bnr) er ikke gitt mutatorer fordi de unikt
 * identifiserer eiendommen og normalt ikke skal endres etter opprettelse.
*/
public class Eiendom {

    // ---------- Instansvariabler ----------
    private int kommunenummer;
    private String kommunenavn;
    private int gnr;
    private int bnr;
    private String bruksnavn;
    private double areal;
    private String eier;

    // ---------- Konstruktør ----------
    /**
     * Oppretter et nytt Eiendom-objekt med all nødvendig informasjon.
     */

    public Eiendom(int kommunenummer, String kommunenavn, int gnr, int bnr, String bruksnavn, double areal, String eier) {
        this.kommunenummer = kommunenummer;
        this.kommunenavn = kommunenavn;
        this.gnr = gnr;
        this.bnr = bnr;
        this.bruksnavn = bruksnavn;
        this.areal = areal;
        this.eier = eier;
    }

    // ---------- Aksessor-metoder (gettere) ----------
    public String getKGB() {
        return kommunenummer + "-" + gnr + "/" + bnr;
    }

    public double getAreal() {
        return areal;
    }

    public int getKommunenummer() {
        return kommunenummer;
    }

    public int getGnr() {
        return gnr;
    }

    public int getBnr() {
        return bnr;
    }

    // ---------- Mutator-metoder (settere) ----------   
    public void setEier(String eier) {
        this.eier = eier;
    }

    public void setBruksnavn(String bruksnavn) {
        this.bruksnavn = bruksnavn;
    }

    public void setAreal(double areal) {
        this.areal = areal;
    }

    // ---------- toString ---------
    @Override
    public String toString() {
        return "Eiendom{" +
                "kommunenummer=" + kommunenummer +
                ", kommunenavn='" + kommunenavn + '\'' +
                ", gnr=" + gnr +
                ", bnr=" + bnr +
                ", bruksnavn='" + bruksnavn + '\'' +
                ", areal=" + areal +
                ", eier='" + eier + '\'' +
                '}';
    }
}

