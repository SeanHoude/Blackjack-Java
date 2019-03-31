package com.qoala;

import java.util.List;
import java.util.Scanner;

public class Game {

    private int chips;
    private Deck deck = new Deck();
    private Player player = new Player();
    private Player dealer = new Player();

    Scanner input = new Scanner(System.in);

    public Game() {
        this.chips = 0;
    }

    // Game loop
    public void startGame() {
        while (this.chips > 0) {
            int bet = -1;
            System.out.printf("You have %s chips.\n", this.chips);
            System.out.printf("How many chips would you like to bet? (0 to %s)\n", this.chips);
            while (bet < 0 || bet > this.chips) {
                bet = input.nextInt();
            }
            initialDeal();
            showHands();
            hitOrStay();
            
        }
        System.out.println("You're all out of chips! Would you like to play again? (y/n)");
        char playAgain;
        while (playAgain != 'y' && playAgain != 'n') {
            playAgain = Character.toLowerCase(input.next().charAt(0));
        }
        if (playAgain == 'y') {
            this.chips = 100;
            startGame();
        }
    }

    public void initialDeal() {
        player.hand.clear();
        dealer.hand.clear();
        for (int i = 0; i < 2; i++) {
            hit(dealer);
            hit(player);
        }
    }


    public void hitOrStay() {
        char hitOrStay = 'x';
        System.out.println("Would you like to (h)it or (s)tay? (h/s)");
        while (hitOrStay != 'h' && hitOrStay != 's') {
            hitOrStay = Character.toLowerCase(input.next().charAt(0));
        }
        if (hitOrStay == 'h') {
            hit(player);
            hitOrStay();
        }
    }


    public void showHands() {
        System.out.println(player.showPlayerHand());
        System.out.println(dealer.showDealerHand());
    }
    public int playerWins(Player player, Player dealer) { // 1 player wins, 0 tie, -1 dealer wins
        List<Integer> playerScore = player.calcHandScore();
        List<Integer> dealerScore = dealer.calcHandScore();
        if (player.currentScore > dealer.currentScore) {
            return 1;
        }
        else if (player.currentScore == dealer.currentScore) {
            if (playerScore.get(1) == 1 && dealerScore.get(1) == 0) { // check if player has only blackjack
                return 1;
            }
            return 0;
        }
        else return -1;
    }


    public void hit(Player player) {
        player.hand.add(deck.draw());
    }


}

