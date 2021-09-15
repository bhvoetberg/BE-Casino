package novi.basics.nl.BlackjackGame;

import java.util.Scanner;

public class BlackjackGame {
    private Scanner inputScanner;
    private boolean gameIsRunning;

    private Player player;
    private Dealer dealer;
    private Deck deck;


    public BlackjackGame (Scanner inputScanner) {
        this.inputScanner = inputScanner;
    }

    public void playGame() {
        gameIsRunning = true;
        while (gameIsRunning) {
            System.out.println("Make a guess");
            break;
        }
    }
}
