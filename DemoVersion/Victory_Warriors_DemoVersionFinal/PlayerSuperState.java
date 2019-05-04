/**
 * Write a description of class PlayerSuperState here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class PlayerSuperState implements IPlayerState 
{
    Player player;
    
    public PlayerSuperState(Player player) {
        this.player = player;
    }
    
    public void setState(IPlayerState state) {
        
    }
}
