package ninja.zilles;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * A traditional 52-card deck of playing cards.
 *
 * Created by zilles on 2/23/17.
 */
public class Deck {
    List<Card> cards;

    /**
     * Creates a shuffled deck of 52 playing cards.
     */
    public Deck() {
        this.cards = new ArrayList<>();
        for (Card.Suit suit : Card.Suit.values()) {
            for (int rank = 0; rank < Card.NUM_RANKS; rank++) {
                cards.add(new Card(rank, suit));
            }
        }
        shuffle();
    }

    /**
     * Have all the cards been drawn?
     *
     * @return true if empty, false otherwise
     */
    public boolean isEmpty() {
        return cards.isEmpty();
    }

    /**
     * Draw a single card, removing it from the deck
     *
     * @return the drawn card
     */
    public Card draw() {
        if (cards.isEmpty()) {
            return null;
        }
        return cards.remove(cards.size() - 1);
    }

    /**
     * Draw multiple cards.  Can return less than the requested number
     * if deck doesn't have enough cards.
     *
     * @param numberToDraw the desired number of cards to draw.
     * @return a List of the drawn cards.
     */
    public List<Card> draw(int numberToDraw) {
        List<Card> cards = new ArrayList<>();
        for (int i = 0; i < numberToDraw; i++) {
            Card card = draw();
            if (card != null) {
                cards.add(card);
            }
        }
        return cards;
    }

    /**
     * Shuffle the cards remaining in the deck.
     */
    public void shuffle() {
        Collections.shuffle(cards);
    }
}
