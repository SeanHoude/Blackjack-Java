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
        score.add((hasAce) ? 1 : 0);
        this.currentScore = total;
        System.out.println(score);
        return score;
    }


    public String showPlayerHand() {
        StringBuilder hand = new StringBuilder("Your hand: ");
        for (Card card : this.hand) {
            hand.append(card).append(", ");
        }
        hand.setLength(hand.length() - 2);
        hand.append(String.format(". Value = %s.", calcHandScore().get(0)));
        return hand.toString();
    }


    public String showDealerHand(boolean reveal) {
        StringBuilder hand = new StringBuilder("Dealer's hand: ");
        boolean hiddenCard;
        if (reveal) {
            hiddenCard = true;
        }
        else {
            hiddenCard = false;
        }
        for (Card card : this.hand) {
            if (!hiddenCard) {
                hiddenCard = true;
                hand.append("[Hidden], ");
                continue;
            }
            hand.append(card).append(", ");
        }
        hand.setLength(hand.length() - 2);
        if (reveal) {
            hand.append(String.format(". Value = %s.", calcHandScore().get(0)));
        }
        return hand.toString();
    }


}

