import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Coin here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Coin extends LuckyPower
{
    /**
     * Act - do whatever the Coin wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {   
    CompleteLevelTimer = (CompleteLevelTimer+1)%600; 
    if(Greenfoot.isKeyDown("right"))
       {
         if(this.getX()+this.getImage().getWidth() < getWorld().getWidth())
                this.setLocation(this.getX() - 2,this.getY());
        }
    if ((isTouching(Player.class)) )
         {
         player = ((MyWorld) getWorld()).getObjects(Player.class);
         player.get(0).setState("gains lucky power");
         ((MyWorld) getWorld()).removeObject(this);
        }
    if (CompleteLevelTimer == 0 ){
      // ((MyWorld) getWorld()).removeObject(this);
    }
    }
}