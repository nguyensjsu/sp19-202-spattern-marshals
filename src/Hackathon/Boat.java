
import java.util.*;
import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
/**
 * Write a description of class Boat here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Boat extends Leaf
{
    /**
     * Act - do whatever the Boat wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    World world;
    private int direction=1;
    
    public Boat()
    {
        
    }
    public void act() 
    {
        
        setLocation(getX(), getY()+direction);
       if (isTouching(Ground.class)) {
    direction = -direction;
}
}

    
      
}