package Oving4;
public class Terningspill {
    public static void main(String[] args) {
        Player player1 = new Player();
        Player player2 = new Player();

        boolean run = true;

        while (run) {
            for (int i = 1; i <= 2; i++) {
                if (i == 1) {
                    player1.throwDice();
                    player1.getPoints();
                    System.out.println("Player 1 threw the die, and got " + player1.throwDice() + " and now have " + player1.getPoints() + " points");

                    if (player1.getPoints() >= 100) {
                        System.out.println("Player1 is the winner!");
                        run = false;
                        break;
                    }
                } else if (i == 2) {
                    player2.throwDice();
                    player2.getPoints();
                    System.out.println("Player 2 threw the die, and got " + player2.throwDice() + " and now have " + player2.getPoints() + " points");

                    if (player2.getPoints() >= 100) {
                        System.out.println("Player2 is the winner!");
                        run = false;
                        break;
                    }
                }
            }
        }
    }
}
