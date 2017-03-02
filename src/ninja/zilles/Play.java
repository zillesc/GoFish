package ninja.zilles;

/**
 * A 'Play' is the action that a Go Fish player (as per the
 * PlayerStrategy interface) takes on their turn.
 * The Play represents the action as communicated to the game
 * engine, but does not include the consequences of that action.
 *
 * Created by zilles on 2/28/17.
 */
public class Play {

    private int targetPlayer;
    private int rank;

    public Play(int targetPlayer, int rank) {
        this.targetPlayer = targetPlayer;
        this.rank = rank;
    }

    public int getTargetPlayer() {
        return targetPlayer;
    }

    public int getRank() {
        return rank;
    }
}
