
import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class NoShow here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class NoShow extends TreasureState
{
    public NoShow(TreasureContext tc)
    {
       super(tc);
       //treasureContext.removeObject(treasureContext.treasureShowState);
    }
    @Override
    public void doCompleteLevel() {
        System.out.println("you completed the level..."); 
        treasureContext.setState(treasureContext.gettreasureShowState());
     }
    @Override
    public void doDisplayTreasure(){
         World world = getWorld();
         world.removeObjects(world.getObjects(Treasure.class));
        //treasureContext.removeObject(treasureContext.treasureShowState);
    }
    /**
     * Act - do whatever the NoShow wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
       
    }    
}
