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


    public ArrayList<Integer> calcHandScore() {
        ArrayList<Integer> score = new ArrayList<>();
        int aces = 0;
        int blackjack = 0;
        int total = 0;
        for (Card card : this.hand) {
            if (card.getRank() == Rank.Ace) { aces++; }
            if (card.getRank() == Rank.Jack &&
                card.getSuit() == Suit.Clubs ||
                card.getSuit() == Suit.Spades) {
                blackjack = 1;
            }
            total += card.getValue();
        }
        while (total > 21 && aces > 0) {
            aces--;
            total -= 10;
        }
        score.add(total);
        score.add(blackjack);
        System.out.println(score);
        return score;
    }



}

