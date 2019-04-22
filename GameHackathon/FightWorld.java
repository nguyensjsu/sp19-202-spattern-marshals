import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class FightWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class FightWorld extends World
{
    private int timer = 0;
    
    /**
     * Constructor for objects of class FightWorld.
     * 
     */
    public FightWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(900, 700, 1); 
        prepare();
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {

        RivalX rivalX = new RivalX();
        addObject(rivalX,773,555);
        RivalX rivalX2 = new RivalX();
        addObject(rivalX2,646,626);
    }
    
    
}
