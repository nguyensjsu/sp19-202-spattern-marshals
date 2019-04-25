import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class ScoreBoard here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ScoreBoard extends Composite
{
    private MyWorld w;
    public ScoreBoard(MyWorld w)
    {
        this.w=w;
    }
    /**
     * Act - do whatever the ScoreBoard wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
       // scoreBoard.setLocation(56,7);
        this.setLocation(118,53);
    }    
    public void display()
    {
        w.addObject(this,85,24);
    }
}
