package com.qoala;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {
    List<Card> pile = new ArrayList<>();

    public Deck() {
        createDeck();
        shuffleDeck();
    }


    public Deck(int decks) {

        if (decks <= 0) {
            throw new InvalidRequestException("That is not a valid number of decks to use when creating a new deck!");
        }

        for (int i = 0; i < decks; i++) {
            createDeck();
        }
        shuffleDeck();
    }


    public void createDeck() {
        for (Rank rank : Rank.values()) {
            for (Suit suit : Suit.values()) {
                pile.add(new Card(suit, rank));
            }
        }
    }


    public void shuffleDeck() {
        Collections.shuffle(pile);
    }


    public void destroyDeck() {
        pile.clear();
    }


    @Override
    public String toString() {
        StringBuilder result = new StringBuilder(pile.size() + " cards:" + System.lineSeparator());

        for (Card card : pile) {
            result.append(card + ", ");
        }

        result.setLength(result.length() - 2);

        return result.toString();
    }

}

