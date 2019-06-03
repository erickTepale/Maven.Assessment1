package com.zipcodewilmington.assessment1.part1;

/**
 * Created by leon on 2/16/18.
 */
public class RockPaperSissorsEvaluator {
    protected static final String ROCK = "rock";
    protected static final String PAPER = "paper";
    protected static final String SCISSOR = "scissor";

    /**
     * @param handSign a string representative of a hand sign
     * @return the respective winning move
     */
    public String getWinningMove(String handSign) {
        switch (handSign){
            case "rock":
                return "paper";
            case "paper":
                return "scissor";
            case "scissor":
                return "rock";

                default:
                    return null;
        }
    }

    /**
     * @param handSign a string representative of a hand sign
     * @return the respective losing move
     */
    public String getLosingMove(String handSign) {
        switch (handSign){
            case "rock":
                return "scissor";
            case "paper":
                return "rock";
            case "scissor":
                return "paper";

            default:
                return null;
        }
    }

    /**
     * @param handSignOfPlayer1 a string representative of a hand sign of a player
     * @param handSignOfPlayer2 a string representative of a hand sign of a challenger
     * @return a string representative of the winning hand sign between the two players
     */
    public String getWinner(String handSignOfPlayer1, String handSignOfPlayer2) {
        if(getWinningMove(handSignOfPlayer1).equals(getLosingMove(handSignOfPlayer2)))
            return handSignOfPlayer1;
        else if(getWinningMove(handSignOfPlayer2).equals(getLosingMove(handSignOfPlayer1)))
            return handSignOfPlayer2;
        else
            return "draw";
    }
}
