import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Boat1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Boat1 extends Leaf
{
   World world;
    private int direction=-1;
    
    public Boat1()
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
