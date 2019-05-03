import greenfoot.*;
/**
 * Write a description of class Ahhhh here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Ahhhh extends Actor
{
    // instance variables - replace the example below with your own
    private int x;
    GreenfootImage img = new GreenfootImage("ahhhh.png");
    int cnt = 100;
    /**
     * Constructor for objects of class Ahhhh
     */
    public Ahhhh()
    {
        
    }

    public void act() 
    {
        setImage(img);
        cnt--;
        if (cnt == 0)
            getWorld().removeObject(this);
    }
}
