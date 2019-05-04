import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
/**
 * Write a description of class Treasure here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Treasure extends Actor implements Component, IProgressObserver
{
    TreasureContext tc;
    private boolean success;
    private MyWorld w;
    GreenfootImage image;
    boolean isAdded = false;
     public Treasure(String imageFilename, MyWorld w)
    {
        image = new GreenfootImage(imageFilename);
        //setImage(new GreenfootImage(imageFilename));
        this.w = w;
    }
    
    /**
     * Act - do whatever the Treasure wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        //if (isTouching(Player.class)) {
           //TreasureContext tc = (TreasureContext) getWorld();
           //tc.takeTreasure();
           //((TreasureContext) getWorld()).removeObject(this);
           //w.removeObject(this);
        //}
    }
    public void display()
    {
        w.addObject(this,0,0);
    }
    public void getNotifyonSucess()
    {
    }
    
    public void updateProgress(int progress) {
        if (progress == 4000) {
            success = true;
            image.scale(100,100);
            setImage(image);
            setLocation(900,500);
            isAdded = true;
        }
    }
}
