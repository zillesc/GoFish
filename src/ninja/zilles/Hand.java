package ninja.zilles;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Representation of a hand of cards.
 *
 * DON'T CHANGE THIS CLASS, YOU CAN DERIVE FROM THIS CLASS IF YOU WANT TO EXTEND IT
 * FOR USE IN THE GAME IMPLEMENTATION, BUT NOT
 *
 * Created by zilles on 2/28/17.
 */
public class Hand implements Iterable<Card> {

    protected List<Card> cards;

    public Hand(List<Card> cards) {
        assert cards != null;
        this.cards = cards;
    }

    /**
     * Returns an iterator that can be used in a foreach loop (for example) to iterate through the cards in the hand.
     * @return A Card iterator
     */
    @Override
    public Iterator<Card> iterator() {
        return cards.iterator();
    }

    /**
     * Get the number of cards in the hand
     * @return the number of cards in the hand.
     */
    public int size() {
        return cards.size();
    }

    /**
     *
     * @param index index of the card in the hand
     * @return the Card at that index
     */
    public Card getCard(int index) {
        return cards.get(index);
    }

    /**
     * Search the hand for a given rank card.
     * @param rank The rank of the card we should search the hand for
     * @return true if the hand includes at least one card of that rank, false otherwise.
     */
    public boolean hasRank(int rank) {
        for (Card card : cards) {
            if (card.getRank() == rank) {
                return true;
            }
        }
        return false;
    }

    /**
     * A dense representation of the hand, useful for debugging purposes
     * @return A string of space separated
     */
    @Override
    public String toString() {
        String string = "";
        for (Card card : cards) {
            string += card.getShortName() + " ";
        }
        return string;
    }
}
