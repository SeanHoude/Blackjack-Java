package com.qoala;

import java.util.ArrayList;
import java.util.List;

public class Player {

    public List<Card> hand;
    public boolean dealer;

    public Player() {
        this.hand = new ArrayList<>();
        this.dealer = false;
    }


    public Player(int oneIfDealer) {
        this.hand = new ArrayList<>();
        if (oneIfDealer == 1) {
            this.dealer = true;
        }
    }


    public boolean isDealer() {
        return this.dealer;
    }


    public List calcHandScore() {
        List score = new ArrayList();
        boolean hasAce = false;
        boolean hasBlackjack = false;
        int total = 0;
        for (Card card : this.hand) {
            if (card.getRank() == Rank.Ace) { hasAce = true; }
            else if (card.getRank() == Rank.Jack &&
                card.getSuit() == Suit.Clubs ||
                card.getSuit() == Suit.Spades) {
                hasBlackjack = true;
            }
            total += card.getValue();
        }
        if (total <= 11 && hasAce) {
            total += 10;
        }
        score.add(total);
        score.add(hasBlackjack);
        System.out.println(score);
        return score;
    }



}

