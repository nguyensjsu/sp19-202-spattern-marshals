import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.List;
import java.util.ArrayList;
/**
 * Write a description of class Hero here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Hero extends Actor
{
    GifImage gifw = new GifImage("walk.gif");
    GifImage gifa = new GifImage("attack.gif");
    GreenfootImage gifi = new GreenfootImage("Idle.png");
    /**
     * Act - do whatever the Hero wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        
        gifi.scale(100,135);
        setImage(gifi);
        if (Greenfoot.isKeyDown("left")) {
            gifw.resizeImages(300,200);
            setImage(gifw.getCurrentImage());
            setLocation(getX() - 2, getY());
        }
        else if (Greenfoot.isKeyDown("right")) {
            gifw.resizeImages(300,200);
            setImage(gifw.getCurrentImage());
            setLocation(getX() + 2, getY());
        }
        else if (Greenfoot.isKeyDown("space")) {
            gifa.resizeImages(300,200);
            setImage(gifa.getCurrentImage());
            setLocation(getX(), getY());
        }
        
        calculateDistance();
    }    
    
    private void calculateDistance() {
        List<Opponent> opponents= getWorld().getObjects(Opponent.class);
        for (Opponent o : opponents) {
            int dist = getX() - o.getX();
            if (Math.abs(dist) < 5) {
                getWorld().removeObject(o);
                GreenfootImage img = getWorld().getObjects(HealthBar.class).get(0).getImage();
                img.scale(img.getWidth() - 50, img.getHeight());
            }
        }
    }
}
