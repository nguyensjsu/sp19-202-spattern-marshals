import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.*;
/**
 * Write a description of class BackGround here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class BackGround extends World
{

    /**
     * Constructor for objects of class BackGround.
     * 
     */

    private int imageCount = 0;
    private Frame frame;

    
    public BackGround()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
       super(1200, 800, 1);
       setPaintOrder(Frame.class);
        frame=new Frame();
        prepare();
        
    }
     
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        List objects = getObjects(null);
        removeObjects(objects);
        Boat boat = new Boat();
        addObject(boat,413,253);
        addObject((Actor) frame,67,25);
        frame.loadTerrains(); 
        System.out.println("Hello");
        
    }
}
