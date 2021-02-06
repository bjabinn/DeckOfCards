package com.beltransoftware.deckOfCards;

public class Card {
	/**
	 * Public variable to represent the number and faces
	 */
	public static String[] Ranks = {null, "Ace", "2", "3", "4", "5", "6", "7",
			                              "8", "9", "10", "Jack", "Queen", "King"};

	/**
	 * vaule: Private variable that represent the number of the card 1-13 
	 */	
	private int value;

	/**
	 * suits: Private variable that represent the different suits
	 */
    private Suits suit;

    /**
     * Enum Suits. It is not an object due to just represent a collection of values 
     */
	public enum Suits {
	    SPADES(1),
	    HEARTS(2),
	    DIAMONDS(3),
	    CLUBS(4);

		private int suitsValue;

		Suits(int suitsValue) {
	        this.suitsValue = suitsValue;
	    }
	}

	/**
     * Constructor
     */
	public Card() {}
	
	/**
     * Build a card with the value and suit given
     * 
     * @param value The value of the card
     * @param suit The suit Enum
     */
	public Card(int value, Suits suit) {
		this.suit = suit;
	    this.value = value;
	}

	/**
     * Write a human representation of a card in text
     */
	public String toString() {
        return Ranks[this.value] + " of " + this.suit;
    }

	/**
     * Getter of value attribute
     */
	public int getValue() {
		return this.value;
	}

	/**
     * Getter of Rank attribute
     */
	public String getRank() {
		return Ranks[this.value];
	}

	/**
     * Getter of Suit attribute
     */
	public Suits getSuit() {
		return this.suit;
	}
	
	/**
     * Getter of Value attribute
     */
	public void setValue(int value) {
		this.value = value;
	}
		
	/**
     * Getter of Suit attribute
     */
	public void setSuit(Suits suit) {
		this.suit = suit;
	}

    //Private methods
}
