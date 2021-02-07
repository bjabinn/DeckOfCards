package com.beltransoftware.deckOfCards;

/**
* This program implements the Deck of Cards Problem
* 52 cards in four suits.
*
* @author  Beltrán
* @version 1.0
* @since   2021-02-06
*/
public class App {
    public static void main(final String[] args) {
        Deck deck = new Deck();
        System.out.println("Deck as is created");
        deck.print();

        System.out.println("---------------------------");
        System.out.println("Deck after being shuffled");
        System.out.println("---------------------------");
        deck.shuffle();
        deck.print();
    }
}
