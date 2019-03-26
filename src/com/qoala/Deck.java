package com.qoala;

import java.util.ArrayList;
import java.util.List;

public class Deck {
    private List<Card> pile = new ArrayList<>();

    public void deck() {
        createDeck();
        shuffleDeck();
    }


    public void deck(int decks) {
        for (int i = 0; i <= decks; i++) {
            createDeck();
        }
        shuffleDeck();
    }


    public void createDeck() {
        for (Rank rank : Rank.values()) {
            for (Suit suit : Suit.values()) {
                this.pile.add(new Card(suit, rank));
            }
        }
    }


    public void shuffleDeck() {

    }

}
