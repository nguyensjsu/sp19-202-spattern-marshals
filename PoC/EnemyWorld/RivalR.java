import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class RivalR here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class RivalR extends Enemy 
{
    GifImage gifImage = new GifImage("RivalX.gif");
    GifImage gifImage2 = new GifImage("RivalR.gif");
    BattleField world = (BattleField)getWorld();
    boolean start =true;

    /**
     * Act - do whatever the RivalR wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        setSpeed(-1);
        setHealth(10);
        setImage(gifImage2.getCurrentImage());
    }
    
    public void walkevent(int x,int y){
        
        this.getImage().setTransparency(0);
        
    }
}
