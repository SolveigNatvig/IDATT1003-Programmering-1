package Oving4;
import java.util.Random;
public class Player {
    private int points;

    public int throwDice(){ // kaste terning, legge til poeng
        Random randomDice = new Random();
        int diceThrow = randomDice.nextInt(6) + 1;
        if (diceThrow == 1)
            points = 0;
        else {
            points += diceThrow;
        }
        return diceThrow;

    }

    public int getPoints(){ // hente ut poeng
        return points;
    }
}
