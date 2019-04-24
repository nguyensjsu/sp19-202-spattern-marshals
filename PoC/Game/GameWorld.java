import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * class GameWorld concrete observer for scoreBoard subject.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class GameWorld extends World
{
    public String observerState;
    public ScoreBoardSubject scoreboard;
    /**
     * Constructor for objects of class GameWorld.
     * 
     */
    public GameWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
       super(1000, 600, 1, false);       
       prepare();
    }
    public void update(){        
    }
    private void prepare()
    {
        TreasureContext tc = new TreasureContext();
        ScoreBoardSubject scoreboard = new ScoreBoardSubject();
        //setup observers
       scoreboard.attach(tc);
       scoreboard.setState("Actor Wins");
    }
}
