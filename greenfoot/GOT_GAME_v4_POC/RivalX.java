import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class RivalX here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class RivalX extends Actor implements IObserver
{
    GifImage gifImage = new GifImage("RivalX.gif");
    boolean waitOver = false;
    int n=0;
    MyWorld world = (MyWorld)getWorld();
    private int RivalWaitTimer;
    private boolean dead = false;
    /**
     * Act - do whatever the RivalX wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        setImage(gifImage.getCurrentImage());
        this.setLocation(this.getX()-2, 465);
    }  
    
    public void addedToWorld(World world) {
        getWorld().getObjects(Player.class).get(0).attach(this);
    }
    
    
    private void runRivalXSpawnTimer()
    {
        if (waitOver == false) {
            RivalWaitTimer = (RivalWaitTimer+1)%60; // adjust '300' as desired
            if (RivalWaitTimer == 0) waitOver = true;
        }
    }
    
    public boolean isDead() {
        return this.dead;
    }
    
    public void playerUpdate(String type, RivalX rival) {
        if (type.equals("did_hit") && this == rival) {
            this.setImage(new GreenfootImage ("ahhhh.png"));
            dead=true;
            int x = getX();
            int y = getY();
            getWorld().addObject(new Ahhhh(), x + 40, y);
            getWorld().removeObject(this);
        }
    }
}