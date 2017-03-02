package ninja.zilles;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by zilles on 2/28/17.
 */
public class HandTest {

    private static final Card _8ofClubs = new Card(7, Card.Suit.CLUBS);
    private static final Card _JackOfSpades = new Card(10, Card.Suit.SPADES);
    private static final Card _3ofDiamonds = new Card(2, Card.Suit.DIAMONDS);
    private static final Card _KingOfHearts = new Card(12, Card.Suit.HEARTS);
    private Hand hand;

    @Before
    public void setUp() throws Exception {
        List<Card> cards = new ArrayList<>();
        cards.add(_8ofClubs);
        cards.add(_JackOfSpades);
        cards.add(_3ofDiamonds);
        cards.add(_KingOfHearts);
        hand = new Hand(cards);
    }

    @Test
    public void testIterator() throws Exception {
        Iterator<Card> cardIterator = hand.iterator();
        Card card = cardIterator.next();
        assertEquals(_8ofClubs, card);
        card = cardIterator.next();
        assertEquals(_JackOfSpades, card);
        card = cardIterator.next();
        assertEquals(_3ofDiamonds, card);
        card = cardIterator.next();
        assertEquals(_KingOfHearts, card);
        assertFalse(cardIterator.hasNext());
    }

    @Test
    public void testSize() throws Exception {
        assertEquals(4, hand.size());
    }

    @Test
    public void testGetCard() throws Exception {
        assertEquals(_3ofDiamonds, hand.getCard(2));
    }

    @Test
    public void testHasRank() throws Exception {
        assertTrue(hand.hasRank(7));
        assertFalse(hand.hasRank(8));
    }

    @Test
    public void testToString() throws Exception {
        assertEquals("8C JS 3D KH ", hand.toString());
    }
}