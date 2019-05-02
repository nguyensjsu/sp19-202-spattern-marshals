import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class HealthIcon here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class HealthIcon extends Actor
{
    GreenfootImage img = new GreenfootImage("health_icon.png");
    /**
     * Act - do whatever the HealthIcon wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        img.scale(50,50);
        setImage(img);
    }    
}
