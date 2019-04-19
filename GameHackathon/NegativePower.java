import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class NegativePower here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class NegativePower extends Actor
{
    GifImage gifImage = new GifImage("NegativePower.gif");
    
    /**
     * Act - do whatever the NegativePower wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        setImage(gifImage.getCurrentImage());
    }    
}
