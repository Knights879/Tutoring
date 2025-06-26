package cards;

public class Deck {
    public int[] myDeck;  // TODO: Change to ArrayList
    public static final int NUMCARDS = 52;

    // Constructor
    public Deck() {
        myDeck = new int[NUMCARDS];

        for (int i = 0; i < NUMCARDS; i++)
            myDeck[i] = i;
    }

    // Helper Function for shuffle(), Mutator
    public void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    // Mutator Method
    public void shuffle() {
        int index;

        for (int i = NUMCARDS - 1; i > 0; i--) {
            index = (int) (Math.random() * (i + 1));
            swap(myDeck, i, index);
        }
    }

    // Accessor Method
    public void printDeck() {
        System.out.println("Deck:");
        for (int card : myDeck)
            System.out.print(card + " ");
        System.out.println();
    }
}
