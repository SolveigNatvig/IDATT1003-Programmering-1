package Oving5;

public class Fractions {
    private double numerator;
    private double denominator;


    public Fractions(double numerator, double denominator){
        this.numerator = numerator;
        this.denominator = denominator;
        if (denominator == 0){
            throw new IllegalArgumentException("The denominator cannot be zero!");
        }
    }

    public Fractions (double numerator){
        this.numerator = numerator;
        this.denominator = 1;
        System.out.println(numerator);
    }

    // Addition method
    public void add(Fractions other){ 
        this.numerator = (this.numerator * other.denominator) + (other.numerator * this.denominator);
        this.denominator = this.denominator * other.denominator;
    }

    // Subtraction method
    public void subtract(Fractions other){ 
        this.numerator = (this.numerator * other.denominator) - (other.numerator * this.denominator);
        this.denominator = this.denominator * other.denominator;
    }

    // Multiplication method
    public void multiply(Fractions other){ 
        this.numerator = this.numerator * other.numerator;
        this.denominator = this.denominator * other.denominator;
    }

    // Division method
    public void divide(Fractions other){ 
        this.numerator = this.numerator * other.denominator;
        this.denominator = this.denominator * other.numerator;
    }

    // Method used to get the numerator
    public double getNumerator(){
        return numerator;
    }

    // Method used to get the denomerator
    public double getDenominator(){
        return denominator;
    }

    // Method used to return the fraction value
    public double getFractionValue(){
        return numerator/denominator;
    }

    public String getFraction(){
        return (this.numerator + "/" + this.denominator);
    }

    public static void main(String[] args) {
        Fractions fraction1 = new Fractions(3, 4);
        Fractions fraction2 = new Fractions(5, 2);

        //System.out.println(fraction1.getFractionValue());
        //System.out.println(fraction2.getFractionValue());
        //System.out.println(fraction1.getDenominator());
        //System.out.println(fraction1.getNumerator());

        //fraction1.subtract(fraction2);
        //fraction1.add(fraction2);
        fraction1.divide(fraction2);

        System.out.println(fraction1.getFractionValue());
        System.out.println(fraction2.getFractionValue());

        System.out.println(fraction1.getFraction());
        System.out.println(fraction2.getFraction());


    }



}