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
    boolean isTrans = false;
    boolean waitOver = false;
    int n=0;
    BattleField world = (BattleField)getWorld();
    private int RivalWaitTimer;
    private boolean dead = false;
    /**
     * Act - do whatever the RivalX wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        runRivalXSpawnTimer();
    }  
    
    public void walkevent(int x,int y){
        if (isTrans) {
            this.getImage().setTransparency(100);
            isTrans = false;
        }
        if (getX()==x+20) {
           
           this.setImage(new GreenfootImage ("ahhhh.png"));
           dead=true;
           ((BattleField)getWorld()).detachRival(this);
           getWorld().removeObject(this);
           
           
        } else {
            if (waitOver == true) {
                setImage(gifImage.getCurrentImage());
                this.setLocation(this.getX()-1, 290);
                n=n+1;
            }
        }
        //world.RivalWalk(n);
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
}
