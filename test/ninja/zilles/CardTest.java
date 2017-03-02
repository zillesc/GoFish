package ninja.zilles;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by zilles on 2/28/17.
 */
public class CardTest {

    private static final int RANK = 7;
    private static final Card.Suit SUIT = Card.Suit.CLUBS;

    private Card card;

    @Before
    public void setUp() throws Exception {
        card = new Card(RANK, SUIT);
    }

    @Test
    public void getRank() throws Exception {
        assertEquals(RANK, card.getRank());
    }

    @Test
    public void getSuit() throws Exception {
        assertEquals(SUIT, card.getSuit());
    }

    @Test
    public void checkHashCode() throws Exception {
        assertEquals(13*3 + 7, card.hashCode());
    }

    @Test
    public void checkNames() throws Exception {
        assertEquals("8 of CLUBS", card.getCardName());
        assertEquals("8C", card.getShortName());
    }
}