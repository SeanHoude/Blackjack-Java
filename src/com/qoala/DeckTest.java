package com.qoala;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class DeckTest {

    private Deck deck = new Deck();
    private Deck deck2 = new Deck();
    private Deck doubleDeck = new Deck(2);


    @org.junit.jupiter.api.Test
    void deckHas52Cards() {
        assertEquals(52, deck.pile.size());
    }

    @org.junit.jupiter.api.Test
    void doubleDeckHas104Cards() {
        assertEquals(104, doubleDeck.pile.size());
    }

    @org.junit.jupiter.api.Test
    void shuffleTest() {
        ArrayList<Card> firstTen = new ArrayList(deck.pile.subList(0, 10));
        deck.shuffle();
        assertNotEquals(firstTen, deck.pile.subList(0, 10));
    }

    @org.junit.jupiter.api.Test
    void initialDealTest() {
    }

    @org.junit.jupiter.api.Test
    void getHandValueTest() {
    }

    @org.junit.jupiter.api.Test
    void over21AceIsOne() {
    }

    @org.junit.jupiter.api.Test
    void under21AceIsEleven() {
    }

    @org.junit.jupiter.api.Test
    void blackJackBeatsTwentyOne() {
    }

    @org.junit.jupiter.api.Test
    void moreThanOneAceIsNotTreatedEqually() {
    }
}