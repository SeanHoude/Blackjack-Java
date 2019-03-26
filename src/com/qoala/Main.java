package com.qoala;

public class Main {

    public static void main(String[] args) {
        Deck deck = new Deck();
        Deck deck2 = new Deck(2);
//        for (Card card : deck.pile) {
//            System.out.println(card.getSuit());
//        }
        System.out.println(deck);
        System.out.println(deck2);
        deck2.destroyDeck();
        System.out.println(deck2);
        deck2.createDeck();
        System.out.println(deck2);

    }
}
