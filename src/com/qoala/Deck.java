package com.qoala;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {

    public List<Card> pile = new ArrayList<>();
    public int decks;



    public Deck() {
        createDecks(1);
        shuffle();
        this.decks = 1;
    }


    public Deck(int decks) {
        if (decks <= 0) {
            throw new InvalidRequestException("That is not a valid number of decks to use when creating a new deck!");
        }
        createDecks(decks);
        shuffle();
        this.decks = decks;
    }


    public void createDecks(int decks) {
        for (int i = 0; i < decks; i++) {
            for (Rank rank : Rank.values()) {
                for (Suit suit : Suit.values()) {
                    this.pile.add(new Card(suit, rank));
                }
            }
        }
    }


    public void shuffle() {
        Collections.shuffle(this.pile);
    }


    public void destroyDeck() {
        this.pile.clear();
    }


    @Override
    public String toString() {
        StringBuilder result = new StringBuilder(this.pile.size() + " cards:" + System.lineSeparator());

        for (Card card : this.pile) {
            result.append(card + ", ");
        }

        result.setLength(result.length() - 2);

        return result.toString();
    }

}

