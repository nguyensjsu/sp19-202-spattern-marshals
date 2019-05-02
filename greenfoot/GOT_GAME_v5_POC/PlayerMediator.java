import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class PlayerMediator here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class PlayerMediator extends Actor
{
    Player player;
    
    public PlayerMediator() {
        
    }
    
    public void addedToWorld(World world) {
        player = getWorld().getObjects(Player.class).get(0);
    }
    /**
     * Act - do whatever the PlayerMediator wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
    }
    
    public void setState(IPlayerState state) {
        player.setState(state);
    }
    
    public IPlayerState getDeadState() { return player.getDeadState(); }
    public IPlayerState getNormalState() { return player.getNormalState(); }
    public IPlayerState getSuperState() { return player.getSuperState(); }
}
