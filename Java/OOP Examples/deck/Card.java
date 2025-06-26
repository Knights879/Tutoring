package deck;

import deck.Constants.Color;
import deck.Constants.FaceValues;
import deck.Constants.Suits;

public class Card {
    // Declare member variables of the enum types defined in "Constants.java"
    private Color color;
    private FaceValues faceVal;
    private Suits suit;

    public int hashCode() {
        int hashCode = 0;

        // Concatenate the hash code values for color, faceval, and suit
        hashCode += this.color.hashCode();
        hashCode += this.faceVal.hashCode();
        hashCode += this.suit.hashCode();

        return hashCode;
    }

    public boolean equals(Object obj) {
        if (obj instanceof Card) {
            // convert obj to instance of class Card
            Card card = (Card) obj;

            return (card.faceVal.equals(this.faceVal) && card.color.equals(this.color) &&
                    card.suit.equals(this.suit));
        }
        else {
            return false;
        }
    }

    /* ACCESSORS - GETTERS AND SETTERS */

    public Color getColor() {
        return color;
    }
    public void setColor(Color color) {
        this.color = color;
    }

    public FaceValues getFaceVal() {
        return faceVal;
    }
    public void setFaceVal(FaceValues faceVal) {
        this.faceVal = faceVal;
    }

    public Suits getSuit() {
        return suit;
    }
    public void setSuit(Suits suit) {
        this.suit = suit;
    }
}
