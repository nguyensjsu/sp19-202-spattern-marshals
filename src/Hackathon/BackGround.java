import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.*;
/**
 * Write a description of class BackGround here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class BackGround extends ScrollingWorld
{

    /**
     * Constructor for objects of class BackGround.
     * 
     */

    private int imageCount = 0;
    private Frame frame;
    private Stream stream;
    GreenfootImage bg; 
    
    public BackGround()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
       super(1200, 800, 1);
       setPaintOrder(Frame.class);
        frame=new Frame();
        setScrollingBackground(getBackground());
        prepare();
        
    }
     
    public void act(){
     int scrollAmt=2;
    
        bg =getBackground();
getBackground().drawImage(bg, 0, scrollAmt); // scroll image down
getBackground().drawImage(bg, 0, scrollAmt-getHeight());
    
}
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        List objects = getObjects(null);
        removeObjects(objects);
        addObject((Actor) frame,67,25);
        frame.loadTerrains();
        //addObject(new Hero(), getWidth()/2, getHeight()/2);
    }
}
