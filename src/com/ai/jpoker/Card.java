package com.ai.jpoker;

public class Card {
    private final SUIT suit;
    private final RANK rank;

    public Card(int suit, int rank) {
        if (suit <= 0 || suit > 4) {
            throw new IllegalArgumentException("Illegal suit specified");
        }

        if (rank <= 0 || rank > 13) {
            throw new IllegalArgumentException("Illegal RANK specified");
        }

        this.suit = SUIT.fromInt(suit);
        this.rank = RANK.fromInt(rank);
    }


    public final SUIT getSuit() {
        return suit;
    }

    public final RANK getValue() {
        return rank;
    }

    @Override
    public String toString() {
        return String.format("Card{RANK=%s, suit=%s}", rank.toString(), suit.toString());
    }

    public static void main(String []args) {
        Card c = new Card(1, 1); // Ace of spades
        System.out.println(c);
    }

    public enum RANK {
        ACE, TWO, THREE, FOUR, FIVE, SIX, SEVEN,
        EIGHT, NINE, JACK, QUEEN, KING;

        private static final RANK[] values = values();

        public static RANK fromInt(int v) {
            return values[v - 1];
        }

        public static int toInt(RANK v) {
            return v.ordinal() + 1;
        }
    }

    public enum SUIT {
        CLUB, DIAMOND,
        HEART, SPADE;

        private static final SUIT[] values = values();

        public static SUIT fromInt(int v) {
            return values[v - 1];
        }

        public static int toInt(SUIT s) {
            return s.ordinal() + 1;
        }
    }
}