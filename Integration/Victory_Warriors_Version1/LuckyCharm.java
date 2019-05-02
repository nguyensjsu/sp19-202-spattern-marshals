;import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
/**
 * Write a description of class LuckyCharm here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class LuckyCharm extends LuckyPower
{
    /**
     * Act - do whatever the LuckyCharm wants to do. This method is called whenever
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
         //hero = ((TreasureContext) getWorld()).getObjects(Hero.class);
         //hero.get(0).setState("gains lucky charm");
         healthbar = ((MyWorld) getWorld()).getObjects(HealthBar.class);
         healthbar.get(0).HeroUpdate("gains lucky charm");
         //hero.notifyOnTouch("lucky");
         ((MyWorld) getWorld()).removeObject(this);
        }
       if (CompleteLevelTimer == 0 ){
        //  ((MyWorld) getWorld()).removeObject(this);
     }
    }    
}