import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class RivalX here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class RivalX extends Enemy 
{
    GifImage gifImage = new GifImage("RivalX.gif");
    boolean isTrans = false;
    
    /**
     * Act - do whatever the RivalX wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {

    }  
    
    public void walkevent(int x,int y){
        if (isTrans) {
            this.setLocation(476,260);
            this.getImage().setTransparency(100);
            isTrans = false;
        }
        this.setLocation(this.getX()-1, this.getY());
    }
}
