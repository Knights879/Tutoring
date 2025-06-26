package cards;

public class DeckMain {
    public static void main(String args[]) {
        Deck d = new Deck();
        d.printDeck();
        d.shuffle();
        d.printDeck();
    }
}
