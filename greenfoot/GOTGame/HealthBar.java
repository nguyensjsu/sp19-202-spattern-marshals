import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class HealthBar here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class HealthBar extends Actor implements PlayerObserver
{
    /**
     * Act - do whatever the HealthBar wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    GreenfootImage image;
    public HealthBar() {
        image = new GreenfootImage("health.png");
        image.scale(300, 120);
        setImage(image);
    }
    public void act() 
    {
        // Add your action code here.
    }
    
    public void playerUpdate(String type) {
        image.scale(image.getWidth() - 50, image.getHeight());
    }
}
