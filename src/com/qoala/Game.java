package com.qoala;

import java.util.ArrayList;
import java.util.List;

public class Game {
    Private Deck deck = new Deck(deck);
    Private Hand player = new Hand(deck);

    initialDeal(player);

    public void initialDeal(Hand hand) {
        if (deck.pile.size() < 2) {
            throw new InvalidRequestException("Ran out of cards!");
        }
        hand.cards.add(this.pile.remove(0));
        cards.add(this.pile.remove(0));

    }


}
