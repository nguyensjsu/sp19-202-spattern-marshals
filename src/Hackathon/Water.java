import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Water here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Water extends Leaf
{
    /**
     * Act - do whatever the Water wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
     //GifImage gifImage=new GifImage("ocean.gif");
    public Water() {
        this.getImage().scale(2500,300);
        /*int scalePercent = 50;
    for (GreenfootImage image : gifImage.getImages())
    {
        int wide = 2500;
        int high = 300;
        image.scale(wide, high);
    }*/
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
