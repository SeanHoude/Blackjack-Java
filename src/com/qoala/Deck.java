package com.qoala;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {

    public List<Card> pile = new ArrayList<>();
    public int decks;



    public Deck() {
        createDecks(1);
        this.decks = 1;
    }


    public Deck(int decks) {
        if (decks <= 0) {
            throw new InvalidRequestException("That is not a valid number of decks to use when creating a new deck!");
        }
        createDecks(decks);
        this.decks = decks;
    }


    public void createDecks(int decks) {
        destroyDeck();
        for (int i = 0; i < decks; i++) {
            for (Rank rank : Rank.values()) {
                for (Suit suit : Suit.values()) {
                    this.pile.add(new Card(suit, rank));
                }
            }
        }
        shuffle();
    }


    public Card draw() {
        recirculateCardsIfNeeded();
        return this.pile.remove(0);
    }


    public void recirculateCardsIfNeeded() {
        if (this.pile.size() == 0) {
            createDecks(this.decks);
        }
    }


    public void shuffle() {
        Collections.shuffle(this.pile);
    }


    public void destroyDeck() {
        if (this.pile != null) { this.pile.clear(); }
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

