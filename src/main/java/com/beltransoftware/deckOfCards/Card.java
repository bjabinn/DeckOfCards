/**
* This package try to representate a card game.
*/
package com.beltransoftware.deckOfCards;

public class Card {
    /**
    * Public variable to represent the number and faces.
    */
    public static String[] ranks = {null, "Ace", "2", "3", "4", "5", "6",
                                    "7", "8", "9", "10", "Jack", "Queen",
                                    "King"};

    /**
    * value: Private variable that represent the number of the card 1-13.
    */
    private int value;

    /**
    * suits: Private variable that represent the different suits.
    */
    private Suits suit;

    /**
    * Enum Suits. It is not an object due to represent a collection of values.
    */
    public enum Suits {
        SPADES(1),
        HEARTS(2),
        DIAMONDS(3),
        CLUBS(4);

        Suits(final int i) {
        }
    }

    /**
    * Constructor.
    */
    public Card() { }

    /**
    * Build a card with the value and suit given.
    *
    * @param valueC The value of the card
    * @param suitC The suit Enum
    */
    public Card(final int valueC, final Suits suitC) {
        this.suit = suitC;
        this.value = valueC;
    }

    /**
     * Write a human representation of a card in text.
     *
     * @return Humanized value of the card
     */
    public String toString() {
        return ranks[this.value] + " of " + this.suit;
    }

    /**
    * Getter of value attribute.
    *
    * @return Numeric value of the card (1-12).
    */
    public int getValue() {
        return this.value;
    }

    /**
    * Getter of Rank attribute.
    *
    * @return String that represent the card (Ace, 2,3, ..., King (1-12)
    */
    public String getRank() {
        return ranks[this.value];
    }

    /**
    * Getter of Suit attribute.
    *
    * @return Return suit which the card belong
    */
    public Suits getSuit() {
        return this.suit;
    }

    /**
    * Setter of Value attribute.
    *
    * @param valueV  Set the value of the card
    */
    public void setValue(final int valueV) {
        this.value = valueV;
    }

    /**
    * Setter of Suit attribute.
    *
    * @param suitV  Set the suit of the card
    */
    public void setSuit(final Suits suitV) {
        this.suit = suitV;
    }

    //Private methods
}
