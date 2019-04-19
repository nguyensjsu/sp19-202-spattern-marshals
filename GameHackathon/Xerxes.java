import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Xerxes here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Xerxes extends Actor
{
    GifImage gifImage = new GifImage("Xerxes.gif");
    
    /**
     * Act - do whatever the Xerxes wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        setImage(gifImage.getCurrentImage());
    }    
}
