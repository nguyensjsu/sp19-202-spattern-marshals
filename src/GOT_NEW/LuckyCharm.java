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
        if ((isTouching(Player.class)) )
         {
         //hero = ((TreasureContext) getWorld()).getObjects(Hero.class);
         //hero.get(0).setState("gains lucky charm");
         healthbar = ((TreasureContext) getWorld()).getObjects(HealthBar.class);
         healthbar.get(0).HeroUpdate("gains lucky charm");
         //hero.notifyOnTouch("lucky");
         ((TreasureContext) getWorld()).removeObject(this);
        }
    }    
}