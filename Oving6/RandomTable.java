package Oving6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;


public class RandomTable {
    private Random random;


    public RandomTable(){
        random = new Random();
    }

    public int nextInteger(int upper){
        return random.nextInt(upper);
    }    

    public static void main(String[] args) {
        java.util.Random random = new java.util.Random(); 
        ArrayList<Integer> countList = new ArrayList<>(Collections.nCopies(10, 0));

        for (int i = 1; i <= 1000; i++){
            int randomNumber = random.nextInt(10);
            countList.set(randomNumber, countList.get(randomNumber) + 1);
        }
        
        int number = 0;
        for (int i: countList){
            System.out.println(number + ":" + i);
            number++;
        }
    }
}
