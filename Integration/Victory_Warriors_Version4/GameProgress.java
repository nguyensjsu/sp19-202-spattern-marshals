import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)


/**
 * Write a description of class GameProgress here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class GameProgress extends Leaf
{
    GreenfootImage image;
    MyWorld w;
    public GameProgress(MyWorld w) {
        this.w = w;
        image = new GreenfootImage("progress.png");
        image.scale(10, 140);
        setImage(image);
    }
    /**
     * Act - do whatever the GameProgress wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        
    }    
    
    public void display()
    {
        w.addObject(this,320,20);
    }
}
