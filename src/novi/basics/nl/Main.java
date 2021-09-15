package novi.basics.nl;

import java.util.Scanner;

import novi.basics.nl.BlackjackGame.BlackjackGame;
import novi.basics.nl.HigherLowerGame.HigherLowerGame;

public class Main {

    public static void main(String[] args) {

        Scanner inputScanner = new Scanner(System.in);
        System.out.println("Which game to play:");
        System.out.println("1: HigherLower");
        System.out.println("2: BlackJack");
        int choice = inputScanner.nextInt();
        switch (choice) {
            case 1:
                System.out.println("HigerLower");
//                HigherLowerGame game = new HigherLowerGame(inputScanner);
//                game.playGame();
                break;
            case 2:
                BlackjackGame game = new BlackjackGame(inputScanner);
                game.playGame();
                break;
            default:
                System.out.println("Geen keuze");
        }
    }
}

