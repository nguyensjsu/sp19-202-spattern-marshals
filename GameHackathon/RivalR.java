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
    BattleField world = (BattleField)getWorld();

    /**
     * Act - do whatever the RivalR wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        
    }
    
    public void walkevent(int x,int y){
        
        //world.addObject(rivalX,getX(),getY());
        //world.removeStaticRival();
        setImage(gifImage.getCurrentImage());
        this.setLocation(this.getX()-1, this.getY());
    }
}
