import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
/**
 * Write a description of class Snake here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Snake extends NegativePower
{
    /**
     * Act - do whatever the Snake wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
    CompleteLevelTimer = (CompleteLevelTimer+1)%700; 
   /* if (CompleteLevelTimer > 0 && CompleteLevelTimer < 200){
          setLocation(639,541);
      }
    if (CompleteLevelTimer > 200 && CompleteLevelTimer < 400){
          setLocation(793,462);
      }
    if (CompleteLevelTimer > 400 && CompleteLevelTimer < 600){
          setLocation(893,544);
      }*/
   if(Greenfoot.isKeyDown("right"))
        {
          if(this.getX()+this.getImage().getWidth() < getWorld().getWidth())
                this.setLocation(this.getX() - 10,this.getY());
        }
   if (isTouching(Hero.class)) 
         {
         hero = ((TreasureContext) getWorld()).getObjects(Hero.class);
         hero.get(0).setState("touch snake");
         ((TreasureContext) getWorld()).removeObject(this);
        // World world = getWorld();
        // world.removeObjects(world.getObjects(Hero.class));   
        }
   if (CompleteLevelTimer == 0 ){
           ((TreasureContext) getWorld()).removeObject(this);
        }
    }    
}