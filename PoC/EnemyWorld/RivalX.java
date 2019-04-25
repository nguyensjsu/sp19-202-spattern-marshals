import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class RivalX here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class RivalX extends Enemy 
{
    GifImage gifImage = new GifImage("RivalX.gif");
    boolean isTrans = false;
    int n=0;
    BattleField world = (BattleField)getWorld();
    /**
     * Act - do whatever the RivalX wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
            setSpeed(-100);
    }  
    
    public void walkevent(int x,int y){
        if (isTrans) {
            //this.setLocation(476,260);
            this.getImage().setTransparency(100);
            isTrans = false;
        }
        if (getX()==250) {
           
           this.setImage(new GreenfootImage ("ahhhh.png"));
           RivalHit();
           
           
        } else {
            setImage(gifImage.getCurrentImage());
            this.setLocation(this.getX()-1, 280);
            n=n+1;
        }
        //world.RivalWalk(n);
    }
}
