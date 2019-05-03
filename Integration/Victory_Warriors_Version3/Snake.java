import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
/**
 * Write a description of class Snake here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Snake extends NegativePower
{
    /**
     * Act - do whatever the Snake wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
   // RivalX rival = 
    public void act() 
    {
   CompleteLevelTimer = (CompleteLevelTimer+1)%300; 
   if(Greenfoot.isKeyDown("right"))
        {
          if(this.getX()+this.getImage().getWidth() < getWorld().getWidth())
                this.setLocation(this.getX() - 5,this.getY());
        }
   if (isTouching(Player.class)) 
         {
         player = ((MyWorld) getWorld()).getObjects(Player.class);
         player.get(0).setState("touch snake");
         ((MyWorld) getWorld()).removeObject(this); 
        }
   if (CompleteLevelTimer == 0 ){
         //  ((MyWorld) getWorld()).removeObject(this);
        }
    }    
}