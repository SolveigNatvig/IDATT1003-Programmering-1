package Oving4;

class Valuta {
    private double rateToNok;

    public Valuta(String name, double rateToNok){
        this.rateToNok = rateToNok;
    } 

    public double toNOK(double amount){
        return amount * rateToNok; 
    }

    public double fromNOK(double nok){
        return nok / rateToNok;
    }

    public double toOtherCurrency(double amount, Valuta other){
        return other.fromNOK(toNOK(amount));
    }
}