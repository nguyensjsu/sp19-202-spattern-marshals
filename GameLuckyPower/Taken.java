import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Taken here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Taken extends TreasureState
{
   
    public Taken(TreasureContext tc){
        super(tc);
    }
    public void doDisplaylevelCompleted() {
        System.out.println("LEVEL COMPLETED...");
        //treasureContext.removeObject(treasureContext.getObject);
        //getWorld().removeObjects(getWorld().getObjects(Treasure.class));
       // ((TreasureContext) getWorld()).removeObject(getWorld().getObjects(Treasure.class));
        treasureContext.addObject(new LevelComplete("completemsg.png"), 450, 300);
        treasureContext.setState(treasureContext.gettreasureNoShowState()); 
     }
    /**
     * Act - do whatever the Taken wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
    }    
}
