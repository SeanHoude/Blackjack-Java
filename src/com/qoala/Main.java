package com.qoala;

public class Main {

    public static void main(String[] args) {
        Deck deck = new Deck();
        for (Card card : deck.pile) {
            System.out.println(card.getSuit());
        }
    }
}
