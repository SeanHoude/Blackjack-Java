package com.qoala;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {
    private static List<Card> pile = new ArrayList<>();

    public void Deck() {
        createDeck();
        shuffleDeck();
    }


    public void Deck(int decks) {
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
        Collections.shuffle(Deck.pile);
    }

}
