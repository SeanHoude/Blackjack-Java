package com.qoala;

import java.util.ArrayList;
import java.util.List;

public class Game {

    private Deck deck = new Deck();
    private Player player = new Player();
    private Player dealer = new Player(1);


    public Game() {
    }


    void initialDeal() {
        if (deck.pile.size() < 2) {
            deck.destroyDeck();
            deck.createDecks(deck.decks);
        }
        player.hand.clear();
        dealer.hand.clear();
        for (int i = 0; i < 2; i++) {
            dealer.hand.add(deck.pile.remove(0));
            player.hand.add(deck.pile.remove(0));
        }
    }

    public int playerWins(Player player, Player dealer) {
        List<Integer> playerValue = player.calcHandScore();
        List<Integer> dealerValue = dealer.calcHandScore();
        if (player.currentScore > dealer.currentScore) {
            return 1;
        }
        else if (player.currentScore == dealer.currentScore) {
            if (playerValue.get(1) == 1 && dealerValue.get(1) == 0) { // check if player has only blackjack
                return 1;
            }
            return 0;
        }
        else { return -1; }
    }

    public void hit() {
        player.hand.add(deck.pile.remove(0));
    }


}

