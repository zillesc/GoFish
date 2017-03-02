package ninja.zilles;

import java.util.Collections;
import java.util.List;

/**
 * An object representing the state associated with a play in a Go Fish game.
 * It includes the results of the play.  The objects are immutable, so that the
 * same object can be distributed to all of the players without a fear for
 * cheating between the players.
 *
 * Created by zilles on 2/28/17.
 */
public class RecordedPlay {
    private int sourcePlayer;
    private int targetPlayer;
    private int rank;
    private List<Card> cardsReturned;

    public RecordedPlay(int sourcePlayer, int targetPlayer, int rank, List<Card> cardsReturned) {
        this.sourcePlayer = sourcePlayer;
        this.targetPlayer = targetPlayer;
        this.rank = rank;
        this.cardsReturned = Collections.unmodifiableList(cardsReturned);
    }

    public int getSourcePlayer() {
        return sourcePlayer;
    }

    public int getTargetPlayer() {
        return targetPlayer;
    }

    public int getRank() {
        return rank;
    }

    public List<Card> getCardsReturned() {
        return cardsReturned;
    }
}
