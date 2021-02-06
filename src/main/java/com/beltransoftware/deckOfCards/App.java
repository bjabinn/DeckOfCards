package com.beltransoftware.deckOfCards;

/**
* This program implements the Deck of Cards Problem 
* 52 cards in four suits.
*
* @author  Beltrán
* @version 1.0
* @since   2021-02-06 
*/
public class App 
{
    public static void main( String[] args )
    {
        Deck deck = new Deck();
        deck.print();
        System.out.println("-------------");

        deck.shuffle();
        deck.print();
    }
}
