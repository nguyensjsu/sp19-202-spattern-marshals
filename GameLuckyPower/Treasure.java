import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Treasure here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Treasure extends Actor
{
    TreasureContext tc;
     public Treasure(String imageFilename)
    {
        setImage(new GreenfootImage(imageFilename));
    } 
    /**
     * Act - do whatever the Treasure wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        if (isTouching(Hero.class)) {
            //tc=getWorldOfType(TreasureContext.class);
            TreasureContext tc = (TreasureContext) getWorld();
            tc.takeTreasure();
            //((TreasureContext) getWorld()).takeTreasure();
            
            ((TreasureContext) getWorld()).removeObject(this);
        }
    }
}
