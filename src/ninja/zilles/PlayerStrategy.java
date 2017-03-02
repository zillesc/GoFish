package ninja.zilles;

import java.util.List;

/**
 * An interface that specifies how a player interacts with the game engine.  Specifically, the game engine
 * provides information to the player and requests (through the 'doTurn' method) how the player responds.
 *
 * Created by zilles on 2/28/17.
 */
public interface PlayerStrategy {

    /**
     * The first function called on the object to provide information that is true for the whole execution.
     * @param yourPlayerNumber a number between 0 and (totalNumberOfPlayers - 1) specifying the current player
     * @param totalNumberOfPlayers a positive integer indicating the total number of players in the game
     */
    public void initialize(int yourPlayerNumber, int totalNumberOfPlayers);

    /**
     * The method invoked on a player each time it is their turn to act.
     * @param hand The current state of the player's hand when they are to act
     * @return The action they choose to take in response to their current hand/game state
     */
    public Play doTurn(Hand hand);

    /**
     * Every time a game action takes place, the game engine invokes the following function on each player.
     * @param recordedPlay an object representing the information of the play that just occurred and its results.
     */
    public void playOccurred(RecordedPlay recordedPlay);
}
