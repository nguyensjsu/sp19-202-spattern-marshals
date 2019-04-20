import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class TreasureState here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TreasureState extends Actor 
{
    TreasureContext treasureContext;
    public TreasureState(TreasureContext tc){
       treasureContext = tc;
       treasureContext.removeObject(treasureContext.treasureShowState);
    }
    /**
     * Act - do whatever the TreasureState wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here. 
    } 
    public void doCompleteLevel(){
    }
    public void doTakeTreasure(){
    }
    public void doDisplaylevelCompleted(){
    }
    public void doDisplayTreasure(){
    }
}
