package com.beltransoftware.deckOfCards;

import static org.junit.Assert.*;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

import java.util.ArrayList;

/**
 * Unit test for Deck class.
 */
public class DeckTest
{
	/**
	 * When a new deck is created and shuffle, number of cards have to be the same than before
	 */
	@Test
	public void givenNewDeck_whenShuffle_thenNumberOfCardIsTheSame() {
		final Deck deck = new Deck();
		int previousNumOfCards = deck.getNumberOfCards();
		deck.shuffle();
		int currentNumOfCards = deck.getNumberOfCards();
		assertEquals(previousNumOfCards, currentNumOfCards);
	}
	
	
	@Test
	public void givenNewDeck_whenShuffle_thenNotDuplicatedCards() {
    	int numberOfCards = Card.Suits.values().length * (Card.Ranks.length-1);
    	
		final Deck deck = new Deck();
		deck.shuffle();
		
		ArrayList<Card> deckDealtCards= new ArrayList<Card>();
		deckDealtCards.add(deck.dealOneCard());
		
		Boolean noRepeated = false;
		Card dealtCard;
		do {		
			dealtCard = deck.dealOneCard();
			noRepeated = deckDealtCards.contains(dealtCard);
			deckDealtCards.add(dealtCard);			
		} while (!noRepeated && deckDealtCards.size() < numberOfCards);
		
		assertFalse(noRepeated);
	}
	
    /**
     * When a new deck is created and a card is dealt(less than53), then gotten card cannot be null
     */
    @Test
    public void givenNewDeck_whenOneCardIsDealtLess53_thenCardIsNotNull() {
    	final Deck deck = new Deck();
    	Card card = deck.dealOneCard();
    	
    	assertNotNull(card);
    }
    
    /**
     * When a new deck is created and a card is dealt(more than52), then gotten card cannot be null
     */
    @Test
    public void givenNewDeck_whenOneCardIsDealtMore52_thenCardIsNotNull() {
    	final Deck deck = new Deck();
    	Card card = new Card();
	
    	for (int i=0; i<60; i++) {
    		card = deck.dealOneCard();	
    	}
    	    	
    	assertNull(card);
    } 
}
