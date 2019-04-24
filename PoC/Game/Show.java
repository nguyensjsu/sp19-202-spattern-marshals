import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class NoShow here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Show extends TreasureState
{
    public Show(TreasureContext tc){
       super(tc);
       treasureContext.removeObject(treasureContext.treasureShowState);
    }
    @Override
    public void doTakeTreasure() {
        System.out.println("you took the treasure...");
	treasureContext.setState(treasureContext.gettreasureTakenState());
     }
    @Override
    public void doDisplayTreasure(){
        Treasure treasure = new Treasure("treasure.jpeg");
        treasureContext.addObject(treasure, 450, 300);
        //treasureContext.addObject(treasureContext.treasureShowState, 500, 300);
        //GreenfootImage image = treasureContext.treasureShowState.getImage() ;
        //image.scale( 150, 180 ) ; 
    }
    /**
     * Act - do whatever the NoShow wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
    }    
}
