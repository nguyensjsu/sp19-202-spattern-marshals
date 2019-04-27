import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.List;
import java.util.ArrayList;
/**
 * Write a description of class Hero here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Player extends Actor
{
    GifImage gifw = new GifImage("walk.gif");
    GifImage gifa = new GifImage("attack.gif");
    GreenfootImage gifi = new GreenfootImage("Idle.png");
    HealthBar healthBar;
    private List<IObserver> observers = new ArrayList<IObserver>();
    private int ySpeed;
    private int apexTimer;
    public Player() {
        
    }
    /**
     * Act - do whatever the Hero wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        addObservers();
        gifi.scale(100,135);
        setImage(gifi);
        
        int groundLevel = -60 + getWorld().getHeight() - getImage().getHeight()/2;
        boolean onGround = (getY() == groundLevel);
        if (!onGround) // in middle of jump
        {
            if (ySpeed == 0 && apexTimer > 0) 
                apexTimer = apexTimer - 50; // run apex timer
            if (ySpeed == 0 && apexTimer > 0) return; // apex timer still running
            ySpeed++; // adds gravity effect
            setLocation(getX(), getY()+ySpeed); // fall (rising slower or falling faster)
            if (getY()>=groundLevel) // has landed (reached ground level)
            {
                setLocation(getX(), groundLevel); // set on ground
                Greenfoot.getKey(); // clears any key pressed during jump
           }
        }
        else // on ground
        {
            if ("up".equals(Greenfoot.getKey())) // jump key detected
            {
                ySpeed = -25; // add jump speed
                setLocation(getX(), getY()+ySpeed); // leave ground
                apexTimer = 100;  // set apex timer (adjust value to suit)
            }
            if (isInProximity(10)) { notifyObservers("got_hit");}
        }
        
        if (Greenfoot.isKeyDown("left")) {
            gifi.scale(100,135);
            setImage(gifi);
            MyWorld world = (MyWorld) getWorld();
            if (isInProximity(10)) { notifyObservers("got_hit");}
        }
        else if (Greenfoot.isKeyDown("right")) {
            gifw.resizeImages(300,200);
            setImage(gifw.getCurrentImage());
            MyWorld world = (MyWorld) getWorld();
            world.scroll();
            if (isInProximity(10)) { notifyObservers("got_hit");}
        }
        else if (Greenfoot.isKeyDown("x")) {
            gifa.resizeImages(300,200);
            setImage(gifa.getCurrentImage());
            setLocation(getX(), getY());
            if (isInProximity(20)) {
                notifyObservers("did_hit");
            }
        }
    }
    
    private boolean isInProximity(int n) {
        List<RivalX> rivals= getWorld().getObjects(RivalX.class);
        for (RivalX r : rivals) {
            int dist = getX() - r.getX();
            if (Math.abs(dist) < n) {
                return true;
            }
        }
        return false;
    }
    
    private void addObservers() {
        healthBar = getWorld().getObjects(HealthBar.class).get(0);
        if (!observers.contains(healthBar))
            observers.add(healthBar);
        List<RivalX> rivals = getWorld().getObjects(RivalX.class);
        for (RivalX r : rivals) {
            if (!observers.contains(r)) {
                observers.add(r);
            }
        }
    }
    
    private void notifyObservers(String type) {
        for(IObserver observer : observers) {
            observer.playerUpdate(type);
        }
    }
}
