import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Snake here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Snake extends NegativePower
{
    /**
     * Act - do whatever the Snake wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        GreenfootImage i = getImage();
       // i.setTransparency(0);
        if (isTouching(Hero.class)) 
         {
             World world = getWorld();
             world.removeObjects(world.getObjects(Hero.class));
        }
       
      // int t = i.getTransparency();
      // i.setTransparency(100);
      // Greenfoot.delay(30);
      
      // Greenfoot.delay(30);
    }    
}
