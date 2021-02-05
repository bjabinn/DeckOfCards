package com.beltransoftware.deckOfCards;

public class Card {
	//Public variables
	public static String[] Ranks = {null, "Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"};
	
	//Private variables
	private int value;
    private Suits suit;  
    
    /**
     * Enums
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
	
	//Constructor
	public Card(int value, Suits suit) {
		this.suit = suit;
	    this.value = value;
	}	
	
	//Public methods
	public String toString() {
        return Ranks[this.value] + " of " + this.suit;
    }
	
    //Private methods
}
