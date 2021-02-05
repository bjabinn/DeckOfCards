package com.beltransoftware.deckOfCards;


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
