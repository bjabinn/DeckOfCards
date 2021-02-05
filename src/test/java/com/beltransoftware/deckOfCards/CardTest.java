package com.beltransoftware.deckOfCards;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import com.beltransoftware.deckOfCards.Card.Suits;

/**
 * Unit tests class.
 */
public class CardTest 
{
    /**
     * Once a card is create, all values (suit, value and rank) are successfully right
     */
    @Test
    public void when1CardIscreated_thenAllValuesAreSavedProperly()
    {
        final Card card = new Card(1, Suits.CLUBS);
        
        
    }
    
    
    
}
