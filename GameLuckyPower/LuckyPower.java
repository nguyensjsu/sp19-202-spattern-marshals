import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.List;
/**
 * Write a description of class LuckyPower here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class LuckyPower extends Actor

{ 
  public List<Player> player;
  public List<HealthBar> healthbar;
  protected int CompleteLevelTimer;
   /**
     * Act - do whatever the LuckyPower wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
  public void act() 
    {
       CompleteLevelTimer = (CompleteLevelTimer+1)%600; 
       if (CompleteLevelTimer == 0 ){
       ((MyWorld) getWorld()).addObject( new Coin(),956,225);
       ((MyWorld) getWorld()).addObject( new LuckyCharm(),954,377);
    }
    }    
}
