/*
Exercise 1
You have been asked to develop a new computer game called, Card Busters!!! There are two players playing the game.
Both players are given seven cards each.
Here are the values of player one’s cards.
10,6,8,9,7,12,7
Here are the values of player two’s cards.
7,6,9,5,2,8,11
There are seven rounds in the game. Each round, the value of the players’ cards for that particular round are compared to see who has the highest valued card.
The player with the highest value card wins the round.
For example, in round 1, player one will play a card with a value of 10. Player two will play a card with a value of 7.
Player one wins the round.
If both cards have the same value, it is a tie.
At the end of the game (after seven rounds), the program should determine which player has won the game overall (won the most rounds) or if the game has ended in a tie.
*/

package javacourse.exercises;

public class Exercise1 {

    public static void main (String[] args) {
        int [] playerFirstCards = {10, 6, 8, 9, 7, 12, 7};
        int [] playerSecondCards = {7, 6, 9, 5, 2, 8, 11};

        checkWhoWins(playerFirstCards, playerSecondCards);
    }
    //method to check who wins each round and also call method (printWhoWinsTheGame)
    private static void checkWhoWins (int [] playerFirstCards, int [] playerSecondCards) {
        String message;
        int roundCounter = 1;
        int playerFirstScore = 0;
        int playerSecondScore = 0;

        System.out.println("******************** Play Cards Busters!!! ********************\n");

        String tieMessage = "Round No %s - Tie! %s ties with %s \n";
        String winMessage = "Round No %s - Player %s wins the round: %s beats %s \n";

        for (int counter = 0; counter < playerFirstCards.length; counter++) { //for loop to go through the seven rounds in the game
            int cardPlayerTwo = playerSecondCards[counter];
            int cardPlayerOne = playerFirstCards[counter];

            if (cardPlayerOne == cardPlayerTwo) { //if the round is a tie, all players get a point.
                message = String.format(tieMessage, roundCounter, cardPlayerTwo, cardPlayerOne);
                playerFirstScore++;
                playerSecondScore++;
            } else if (cardPlayerOne > cardPlayerTwo) {
                message = String.format(winMessage, roundCounter, "one", cardPlayerOne, cardPlayerTwo);
                playerFirstScore++;
            } else {
                message = String.format(winMessage, roundCounter, "two", cardPlayerTwo, cardPlayerOne);
                playerSecondScore++;
            }

            System.out.println(message);
            roundCounter++;
        }

        printWhoWinsTheGame(playerFirstScore, playerSecondScore);
    }
    //method (printWhoWinsTheGame) to print which player has won the game overall
    private static void printWhoWinsTheGame (int playerFirstScore, int playerSecondScore) {
        String message;
        String winMessage = "Player %s wins!";
        winMessage += " He won %s rounds ";
        winMessage += "beating Player %s who won %s rounds!"+"\n";
        winMessage += "\nGoodbye!";

        if (playerFirstScore == playerSecondScore) {
            message = "The game has ended in a tie!";
            message += "\nPlayer one won "+ playerFirstScore+" rounds";
            message += " and Player two won "+ playerSecondScore+" rounds"+"\n";
            message += "\nGoodbye!";
        } else if (playerFirstScore > playerSecondScore) {
            message = String.format(winMessage, "one", playerFirstScore, "two", playerSecondScore);
        } else {
            message = String.format(winMessage, "two", playerSecondScore, "one", playerFirstScore);
        }
        System.out.println(message);
    }
}
