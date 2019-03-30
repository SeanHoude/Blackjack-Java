package com.qoala;

public enum Rank {
    /**
     * if hand <= 21 ace == 11, else ace == 1. Jack, queen, and king == 10.
     * Jack of clubs or spades and hand of 21 beats hand of 21 without.
     */
    Ace     (1),
    Two     (2),
    Three   (3),
    Four    (4),
    Five    (5),
    Six     (6),
    Seven   (7),
    Eight   (8),
    Nine    (9),
    Ten     (10),
    Jack    (10),
    Queen   (10),
    King    (10);

    private final int value;

    Rank(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
