/**
 * Write a description of class PlayerDeadState here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class PlayerDeadState implements IPlayerState
{
    Player player;
    
    public PlayerDeadState(Player player) {
        this.player = player;
    }
    
    public void setState(IPlayerState state) {
        
    }
}
