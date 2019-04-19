import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Ground here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Ground extends Leaf
{
    /**
     * Act - do whatever the Ground wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
      public Ground() {
        //this.getImage().scale(1250,50);
        this.getImage().scale(2500,100);
    }
    
    public void act()
    {
        World myWorld = getWorld();
       if (myWorld != null)
            myWorld.addObject(this,67,25);
    }
    /**
     * Act - do whatever the land wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
     private static int Y=0;
}

