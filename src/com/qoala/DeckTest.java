package com.qoala;

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
    void deck1() {
    }

    @org.junit.jupiter.api.Test
    void createDeck() {
    }

    @org.junit.jupiter.api.Test
    void shuffleDeck() {
    }
}