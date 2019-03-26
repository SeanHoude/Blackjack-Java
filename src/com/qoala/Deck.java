package com.qoala;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {
    static List<Card> pile = new ArrayList<>();

    public Deck() {
        createDeck();
        shuffleDeck();
    }


    public Deck(int decks) {

        if (decks <= 0) {
            throw new InvalidRequestException("That is not a valid number of decks to use when creating a new deck!");
        }

        for (int i = 0; i <= decks; i++) {
            createDeck();
        }
        shuffleDeck();
    }


    public void createDeck() {
        for (Rank rank : Rank.values()) {
            for (Suit suit : Suit.values()) {
                Card card = new Card(suit, rank);
                this.pile.add(card);
                System.out.println(card.getSuit());
            }
        }
    }


    public void shuffleDeck() {
        Collections.shuffle(Deck.pile);
    }


    public void destroyDeck() {
        Deck.pile.clear();
    }


    @Override
    public String toString() {
        String cardList = "";
        for (Card card : Deck.pile) {
            cardList += ", " + card;
        }
        return cardList;
    }


}
