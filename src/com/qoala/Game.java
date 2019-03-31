package com.qoala;

import java.util.List;
import java.util.Scanner;

public class Game {

    private int bet;
    private int chips;
    private Deck deck = new Deck();
    private Player player = new Player();
    private Player dealer = new Player();

    Scanner input = new Scanner(System.in);

    public Game() {
        this.chips = 100;
        this.bet = 0;
    }

    // Game loop
    while (this.chips > 0) {
        System.out.println("You have %s chips. How many would you like to bet?  ");

        while (bet < 0 || bet > chips) {
            bet = input.nextInt();
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

