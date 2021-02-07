package com.beltransoftware.deckOfCards;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.beltransoftware.deckOfCards.Card.Suits;

/**
 * Unit test for Card class.
 */
public class CardTest
{
    /**
     * Once a card is create, all values (suit, value and rank) are successfully right
     */
	@Test
    public void when1CardIscreated_thenAllValuesAreSavedProperly() {
        final Card card = new Card(1, Suits.CLUBS);
        assertEquals(1, card.getValue());
        assertEquals(Suits.CLUBS, card.getSuit());
        assertEquals("Ace", card.getRank());
    }
	
	/**
     * The card printing should be shown as expected
     */
	@Test
    public void when1CardIsPrinted_thenValueIsShownAsExpected() {		
        final Card card = new Card(1, Suits.SPADES);
        assertEquals("Ace of SPADES", card.toString());
        
        final Card card2 = new Card(2, Suits.HEARTS);
        assertEquals("2 of HEARTS", card2.toString());
        
        final Card card3 = new Card(11, Suits.DIAMONDS);
        assertEquals("Jack of DIAMONDS", card3.toString());
        
        final Card card4 = new Card(13, Suits.CLUBS);
        assertEquals("King of CLUBS", card4.toString());   
    }
	
	/**
     * The setter of Value is doing the expected
     */
	@Test
	public void whenValueIsSet_thenValueIsTheExpected() {
		final Card card = new Card(1, Suits.SPADES);
		
		card.setValue(2);
		assertEquals(2, card.getValue());   
	}
	/**
	* The setter of Suit is doing the expected
	*/
	@Test
	public void whenSuitIsSet_thenSuitIsTheExpected() {
		final Card card = new Card(1, Suits.SPADES);
		
		card.setSuit(Suits.CLUBS);
		assertEquals(Suits.CLUBS, card.getSuit());   
	}
}

