package Oving5;

import java.util.ArrayList;
import java.util.Random;

public class MyRandom {
    private Random random;


    public MyRandom(){
        random = new Random();
    }

    // Returns a random integer between lower and upper, inclusive
    public int nextInteger(int lower, int upper){
        if (lower > upper){
            throw new IllegalArgumentException("Lower bound must be <= Upper bound");
        }
        return random.nextInt((upper - lower) + 1) + lower;
    }

    // Returns a decimal number in a range that includes the lower bound but excludes the upper bound
    public double nextFloat(double lower, double upper){
        if (lower > upper){
            throw new IllegalArgumentException("Lower bound must be <= Upper bound");
        }
        return lower + random.nextDouble() * (upper - lower);
    }
    public static void main(String[] args) {
        MyRandom number = new MyRandom();
        ArrayList<Integer> integerList = new ArrayList<>();
        ArrayList<Double> floatList = new ArrayList<>();

        for (int i = 1; i <= 10; i++) {
            int integerNumber = number.nextInteger(0, 10);
            double floatNumber = number.nextFloat(0.0, 10.0);

            integerList.add(integerNumber);
            floatList.add(floatNumber);
        }
        System.out.println(integerList);
        System.out.println(floatList);
    }
}
