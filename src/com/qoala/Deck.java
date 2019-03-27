package com.qoala;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {

    public List<Card> pile = new ArrayList<>();
    public int decks;



    public Deck() {
        createDeck();
        shuffle();
        this.decks = 1;
    }


    public Deck(int decks) {
        if (decks <= 0) {
            throw new InvalidRequestException("That is not a valid number of decks to use when creating a new deck!");
        }

        for (int i = 0; i < decks; i++) {
            createDeck();
        }
        shuffle();
        this.decks = decks;
    }


    public void createDeck() {
        for (Rank rank : Rank.values()) {
            for (Suit suit : Suit.values()) {
                this.pile.add(new Card(suit, rank));
            }
        }
    }


    public void shuffle() {
        Collections.shuffle(this.pile);
    }


    public boolean playerWins(Hand player, Hand dealer) {
        List<Integer> playerValue = player.getHandValue();
        List<Integer> dealerValue = dealer.getHandValue();
        if (playerValue.get(0) == dealerValue.get(0)) {
            if (playerValue.get(1) > dealerValue.get(1)) {
                return true;
            }
            return false;
        }
        return playerValue.get(0) == dealerValue.get(0) ? true : false;
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

