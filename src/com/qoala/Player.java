package com.qoala;

import java.util.ArrayList;
import java.util.List;

public class Player {

    public List<Card> hand;
    public int currentScore;

    public Player() {
        this.hand = new ArrayList<>();
    }


    public List<Integer> calcHandScore() {
        List<Integer> score = new ArrayList<>();
        boolean hasAce = false;
        int hasBlackjack = 0;
        int total = 0;
        for (Card card : this.hand) {
            if (card.getRank() == Rank.Ace) { hasAce = true; }
            total += card.getValue();
        }
        if (total <= 11 && hasAce) { total += 10; }
        if (total == 21 && this.hand.size() == 2) { hasBlackjack = 1; }
        score.add(total);
        score.add(hasBlackjack);
        this.currentScore = total;
        System.out.println(score);
        return score;
    }



}

