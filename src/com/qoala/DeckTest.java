package com.qoala;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class DeckTest {

    Deck deck = new Deck();
    Deck deck2 = new Deck();
    Deck doubleDeck = new Deck(2);

    @org.junit.jupiter.api.BeforeEach
    void setUp() {
        Deck deck = new Deck();
        Deck deck2 = new Deck();
        Deck doubleDeck = new Deck(2);
    }

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
        List<Card> firstTen;
        firstTen = new ArrayList(deck.pile.subList(0, 10));
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