package com.qoala;

import java.util.ArrayList;
import java.util.List;

public class Game {


    private Deck deck = new Deck();
    private Player player = new Player();
    private Player dealer = new Player();

    initialDeal();

    private void initialDeal() {
        if (deck.pile.size() < 2) {
            throw new InvalidRequestException("Ran out of cards!");
        }
        for (int i = 0; i < 2; i++) {
            dealer.hand.cards.add(deck.pile.remove(0));
            player.hand.cards.add(deck.pile.remove(0));
        }
    }


    public void hit() {
        player.hand.add(deck.pile.remove(0));
    }



}
