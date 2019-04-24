import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Opponent here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Opponent extends Actor implements PlayerObserver
{
    GifImage gifo = new GifImage("fight1.gif");
    /**
     * Act - do whatever the Opponent wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        gifo.resizeImages(100,135);
        setLocation(getX(), getY());
        setImage(gifo.getCurrentImage());
    }    
    
    public void playerUpdate(String type) {
        getWorld().removeObject(this);
    }
}
