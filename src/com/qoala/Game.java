package com.qoala;

import java.util.ArrayList;

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
        ArrayList<Integer> playerValue = player.calcHandScore();
        ArrayList<Integer> dealerValue = dealer.calcHandScore();
        if (playerValue.get(0) == dealerValue.get(0)) {
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

