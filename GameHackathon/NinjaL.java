import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class NinjaL here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class NinjaL extends Actor
{
    GifImage gifImage = new GifImage("NinjaL.gif");
    
    public NinjaL()
    { 
    } 
    
    /**
     * Act - do whatever the NinjaL wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
       setImage(gifImage.getCurrentImage());
    }    
}
