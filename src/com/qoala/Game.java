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

    public boolean playerWins(Player player, Player dealer) {
        List playerValue = player.calcHandScore();
        List dealerValue = dealer.calcHandScore();
        if (playerValue.get(0) == dealerValue.get(0)) {     // Dealer wins tie unless Player has sole blackjack
            if (playerValue.get(1) > dealerValue.get(1)) {
                return true;
            }
            return false;
        }
        return playerValue.get(0) == dealerValue.get(0) ? true : false;
    }

    public void hit() {
        player.hand.add(deck.pile.remove(0));
    }


}

