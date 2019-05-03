import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
/**
 * Write a description of class Treasure here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Treasure extends Actor implements Component
{
    TreasureContext tc;
    private boolean success;
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
        if (isTouching(Player.class)) {
           TreasureContext tc = (TreasureContext) getWorld();
           tc.takeTreasure();
           ((TreasureContext) getWorld()).removeObject(this);
        }
    }
    public void display()
    {
        if(success==true)
        {
        MyWorld w = (MyWorld) getWorld();
        w.addObject(this,300,300);
    }
    }
    public void getNotifyonSucess()
    {
    }
}
