import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Castle here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CastleIcon extends Leaf
{
    GreenfootImage img = new GreenfootImage("castle_icon.png");
    private MyWorld w;
    public CastleIcon(MyWorld w) {
        this.w = w;
    }
    /**
     * Act - do whatever the Castle wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        img.scale(50,50);
        setImage(img);
    }    
    
    public void display()
    {
        w.addObject(this,280,20);
    }
}
