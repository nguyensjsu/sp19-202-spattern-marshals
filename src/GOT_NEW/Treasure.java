import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Treasure here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Treasure extends Composite
{
    /**
     * Act - do whatever the Treasure wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private MyWorld w=null;
    private Sound beep;
    public Treasure(MyWorld w)
    {
        beep = Sound.getInstance();
        this.w=w;
        
    }
    public void act() 
    {
        // Add your action code here.
        if ( (isTouching(Hero.class)) )
         {
             
             w.removeObject(this);
             Greenfoot.playSound("coinsuccess.mp3");
            }
    }    
    public void display()
    {
       w.addObject(this,831,492);
}
}
