package com.qoala;

import java.util.ArrayList;
import java.util.List;

public class Player {
    public List<Card> cards = new ArrayList<>();


    public Player() {
    }


    public void hit() {
        this.cards.add(deck.pile.remove(0));
    }


    public List<Integer> getHandValue() {
        List<Integer> result = new ArrayList<>();
        int aces = 0;
        int blackjack = 0;
        int total = 0;
        for (Card card : this.cards) {
            if (card.getRank() == Rank.Ace) { aces++; }
            if (card.getRank() == Rank.Jack && card.getSuit() == Suit.Clubs || card.getSuit() == Suit.Spades) {
                blackjack = 1;
            }
            total += card.getValue();
        }
        while (total > 21 && aces > 0) {
            aces--;
            total -= 10;
        }
        result.add(total);
        result.add(blackjack);
        System.out.println(result);
        return result;
    }



}

