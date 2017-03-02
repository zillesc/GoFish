package ninja.zilles;

import org.junit.Before;
import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.Assert.*;

/**
 * Created by zilles on 2/28/17.
 */
public class DeckTest {

    private Deck deck;

    @Before
    public void setUp() throws Exception {
        deck = new Deck();
    }

    @Test
    public void newDeckIsNotEmpty() throws Exception {
        assertFalse(deck.isEmpty());
    }

    @Test
    public void newDeckHas52Cards() throws Exception {
        assertEquals(52, getRemainingCardCount());
    }

    private int getRemainingCardCount() {
        int cardCount = 0;
        while(!deck.isEmpty()) {
            deck.draw();
            cardCount++;
        }
        return cardCount;
    }

    @Test
    public void noRepeatedCards() throws Exception {
        Set<Integer> cardSet = new HashSet<>();

        while(!deck.isEmpty()) {
            Card card = deck.draw();
            int hashCode = card.hashCode();
            assertFalse(cardSet.contains(hashCode));
            cardSet.add(hashCode);
        }
    }

    @Test
    public void drawMultiple() throws Exception {
        assertEquals(17, deck.draw(17).size());
        assertEquals(52 - 17, getRemainingCardCount());

    }
}