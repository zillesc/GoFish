package ninja.zilles;

/**
 * A class for representing playing cards in a 52-card deck.
 *
 * Each card is immutable.
 *
 * Created by zilles on 2/23/17.
 */
public class Card {
    enum Suit {SPADES, HEARTS, DIAMONDS, CLUBS};
    public static final int NUM_SUITS = 4;
    public static final int NUM_RANKS = 13;
    public static final String[] CARD_NAMES = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"};
    public static final String[] SHORT_NAMES = {"A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"};

    private int rank;
    private Suit suit;

    public Card(int rank, Suit suit) {
        assert rank >= 0 && rank < NUM_RANKS : "invalid rank";
        this.rank = rank;
        this.suit = suit;
    }

    public int getRank() {
        return rank;
    }

    public Suit getSuit() {
        return suit;
    }

    private String getSuitName() {
        switch (suit) {
            case SPADES:
                return "SPADES";
            case HEARTS:
                return "HEARTS";
            case DIAMONDS:
                return "DIAMONDS";
            case CLUBS:
                return "CLUBS";
            default:
                assert false : "unknown suit";
                return null;
        }
    }

    public String getCardName() {
        return CARD_NAMES[rank] + " of " + getSuitName();
    }

    public String getShortName() {
        return SHORT_NAMES[rank] + getSuitName().charAt(0);
    }

    /**
     * Return a unique number based on the (rank, suit) pair.
     *
     * @return integer hashCode
     */
    @Override
    public int hashCode() {
        int hashCode = 0;
        switch (suit) {
            case SPADES:
                hashCode = 0 * NUM_RANKS;
                break;
            case HEARTS:
                hashCode = 1 * NUM_RANKS;
                break;
            case DIAMONDS:
                hashCode = 2 * NUM_RANKS;
                break;
            case CLUBS:
                hashCode = 3 * NUM_RANKS;
                break;
        }
        return hashCode + rank;
    }


}
