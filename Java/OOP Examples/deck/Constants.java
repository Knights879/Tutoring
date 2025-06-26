package deck;

public class Constants {
    public static final int NUMCARDSINDECK = 52;

    public enum Color {
        RED, BLACK
    }

    public enum Suits {
        CLUBS(0), DIAMONDS(1), HEARTS(2), SPADES(3);

        private int rank;

        // Private Constructor
        private Suits(int rank) {
            this.rank = rank;
        }

        /**
         * @return the rank
         */
        public int getRank() {
            return rank;
        }
    }

    public enum FaceValues {
        ONE(1), TWO(2), THREE(3), FOUR(4), FIVE(5),
        SIX(6), SEVEN(7), EIGHT(8), NINE(9), TEN(10),
        JACK(11), QUEEN(12), KING(13), ACE(14);

        private int value;

        // Private Constructor
        private FaceValues(int value) {
            this.value = value;
        }

        /**
         * @return the value
         */
        public int getValue() {
            return value;
        }
    }
}
