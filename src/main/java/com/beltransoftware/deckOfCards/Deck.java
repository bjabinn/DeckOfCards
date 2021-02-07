package com.beltransoftware.deckOfCards;

import java.util.ArrayList;
import java.util.Random;
import java.util.function.Consumer;

public class Deck {

    /**
     * Private variables
     */
    private ArrayList<Card> cards= new ArrayList<Card>();

    private static final Random R = new Random();
    
    /**
     * Constructor: create a sorted new deck by kind of suits and ranks 
     */
    public Deck() {
         create();
    }

    /**
	   * This method unsorted the deck using a random sequence
	   * 
	   */
    public void shuffle() {
    	int numberOfSuits = Card.Suits.values().length;
    	int numberOfCardsBySuit= Card.Ranks.length-1;

    	for (int i = 0; i <  numberOfSuits * numberOfCardsBySuit; i++) {
    		int newPosition = R.nextInt(numberOfSuits * numberOfCardsBySuit);
    		Card cardToSwap = cards.get(i);
    		cards.set(i,cards.get(newPosition));
    		cards.set(newPosition, cardToSwap);
    	}
    }

    /**
	   * This method return null when no card remain in the deck or, in another case, the first card in the deck 
	   * 
	   * @return null / Card.
	   */
    public Card dealOneCard() {
    	if (cards.isEmpty()) {
    		return null;
    	}
    	Card cardToReturn = cards.get(0);
    	cards.remove(0);
    	return cardToReturn;
    }

    /**
	   * This method show the cards not dealt = the cards that there are still in the deck 
	   * 
	   */    
    public void print() {
    	Consumer<? super Card> lambdaExpression = x -> System.out.println(x.toString());	    	 
        cards.forEach(lambdaExpression);
    }
    
    /**
	   * This method return the number of cards still in the deck
	   * 
	   * @return int
	   */     
    public int getNumberOfCards() {
    	return cards.size();
    }


    //Private methods 
    private void create() {
    	for (Card.Suits suit : Card.Suits.values()) {
            for (int j=1; j < Card.Ranks.length; j++) {
        		Card card = new Card(j, suit);	        		
	            this.cards.add(card); 
        	}            
        } 
    }
}
