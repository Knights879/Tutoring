package deck;

import deck.Constants.Color;
import deck.Constants.FaceValues;
import deck.Constants.Suits;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Deck {
    private Set<Card> deck; // This will represent the deck of cards
    private List<Card> cardList; // List of cards

    // Constructor
    public Deck() {
        System.out.println("****************************");
        System.out.println("Generating the deck of cards");
        System.out.println("****************************");
        generateDeck();

        System.out.println("****************************");
        System.out.println("Displaying the deck of cards");
        System.out.println("****************************");
        displayDeck();

        shuffleDeck();
        System.out.println("*************************************");
        System.out.println("Displaying the shuffled deck of cards");
        System.out.println("*************************************");
        // displayDeck();

        shuffleDeck();
        System.out.println("*************************************");
        System.out.println("Displaying the shuffled deck of cards");
        System.out.println("*************************************");
        // displayCardList();
    }

    public void generateDeck() {
        deck = new HashSet<Card>();

        for (FaceValues face : FaceValues.values()) {
            for (Suits suit : Suits.values()) {
                // Create a new card
                Card c = new Card();
                // Set the face value and suit of the card
                c.setFaceVal(face);
                c.setSuit(suit);
                // Set the color of the card
                if ((suit == Suits.DIAMONDS) || (suit == Suits.HEARTS))
                    c.setColor(Color.RED);
                else
                    c.setColor(Color.BLACK);
                // If the card is not in the hashset, then add it, else do nothing
                if (!deck.contains(c))
                    deck.add(c);
            }
        }
    }

    public void shuffleDeck() {
        // Create the list of cards
        /* ArrayList<Card> cards = new ArrayList<>(deck); */
        cardList = new ArrayList<>(deck);

        // Shuffle the cards
        Collections.shuffle(cardList);

        // Assign deck to the shuffled set of cards
        this.deck = new HashSet<>(cardList);
    }

    // Flips over, and displays the top card on the deck,
    // then puts it at the bottom of the deck.
    public void flipTopCard() {
        // TODO: Implement
    }

    public void displayDeck() {
        System.out.println("Deck size: " + Constants.NUMCARDSINDECK + " cards (in dd)");

        for (Card card : deck) {
            System.out.print("Card: " + card.getFaceVal() + " of " + card.getSuit());
            System.out.println(" is color " + card.getColor());
        }
    }

    public void displayCardList() {
        System.out.println("Deck size: " + Constants.NUMCARDSINDECK + " cards (in dcl)");

        for (Card c : cardList) {
            System.out.print("Card: " + c.getFaceVal() + " of " + c.getSuit());
            System.out.println(" is color " + c.getColor());
        }
    }

    /* ACCESSOR METHODS - GETTERS AND SETTERS */

    public Set<Card> getDeck() {
        return deck;
    }

    public void setDeck(Set<Card> deck) {
        this.deck = deck;
    }

    public List<Card> getCardList() {
        return cardList;
    }

    public void setCardList(List<Card> cardList) {
        this.cardList = cardList;
    }
}
