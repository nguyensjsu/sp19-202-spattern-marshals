import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class BlackPower here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class BlackPower extends Actor
{
    GifImage gifImage = new GifImage("BlackPower.gif");
    
    /**
     * Act - do whatever the BlackPower wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        setImage(gifImage.getCurrentImage());
    }    
}
