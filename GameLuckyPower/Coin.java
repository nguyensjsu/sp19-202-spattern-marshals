import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Coin here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Coin extends LuckyPower
{
    /**
     * Act - do whatever the Coin wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {   
    CompleteLevelTimer = (CompleteLevelTimer+1)%600; 
    if (CompleteLevelTimer > 0 && CompleteLevelTimer < 200){
         // this.setLocation(this.getX() + 10,this.getY());
         this.setLocation(728,544);
      }
    if (CompleteLevelTimer > 200 && CompleteLevelTimer < 400){
         this.setLocation(890,467);
         //this.setLocation(this.getX(),this.getY()+10);
      }
    if (CompleteLevelTimer > 400 && CompleteLevelTimer < 600){
         this.setLocation(950,350);
         //this.setLocation(this.getX(),this.getY()+10);
      }
    if ((isTouching(Hero.class)) )
         {
         hero = ((TreasureContext) getWorld()).getObjects(Hero.class);
         hero.get(0).setState("gains lucky power");
         ((TreasureContext) getWorld()).removeObject(this);
        }
    if (CompleteLevelTimer == 0 ){
          ((TreasureContext) getWorld()).removeObject(this);
     }
    }  
}
