package ie.com.certification.topic8;

public class Exercise1 {

    public static void main (String[] args){
        int [] playerFirstCards = {10, 6, 8, 9, 7, 12, 7};
        int [] playerSecondCards = {7, 6, 9, 5, 2, 8, 11};

        checkWhoWins(playerFirstCards, playerSecondCards);
    }

    private static void checkWhoWins(int [] playerFirstCards, int [] playerSecondCards) {
        String message;
        int roundCounter = 1;
        int playerFirstScore = 0;
        int playerSecondScore = 0;

        System.out.println("******************** Play Cards Busters!!! ********************\n");

        String tieMessage = "Round No %s - Tie! %s ties with %s \n";
        String winMessage = "Round No %s - Player %s wins the round: %s beats %s \n";

        for (int counter = 0; counter < playerFirstCards.length; counter++) {
            int cardPlayerTwo = playerSecondCards[counter];
            int cardPlayerOne = playerFirstCards[counter];

            if (cardPlayerOne == cardPlayerTwo){
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

    private static void printWhoWinsTheGame(int playerFirstScore, int playerSecondScore) {
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
