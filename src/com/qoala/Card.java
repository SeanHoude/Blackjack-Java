package com.qoala;

public class Card {

    private static Suit suit;
    private static Rank rank;


    public Card(Suit suit, Rank rank){
        this.suit = suit;
        this.rank = rank;
    }


    public Suit getSuit() {
        return this.suit;
    }


    @Override
    public String toString() {
        return String.format("%s of %s", this.rank, this.suit);
    }


}
