import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class NinjaR here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class NinjaR extends Actor
{
    GifImage gifImage = new GifImage("NinjaR.gif");
    
    public NinjaR()
    { 
    } 
    
    /**
     * Act - do whatever the NinjaR wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        setImage(gifImage.getCurrentImage());
    }    
}
