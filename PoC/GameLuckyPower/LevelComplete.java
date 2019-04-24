import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class LevelComplete here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class LevelComplete extends Actor
{
    private int CompleteLevelTimer;
    public LevelComplete(String imageFilename)
    {
        setImage(new GreenfootImage(imageFilename));
       
    }
   
      /**
     * Act - do whatever the LevelComplete wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
      CompleteLevelTimer = (CompleteLevelTimer+1)%300; 
      // Add your action code here.
       if (Greenfoot.mouseClicked(this) || (CompleteLevelTimer == 0 )) {
            ((TreasureContext) getWorld()).removeObject(this);
      }
    }    
}
