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
    }
    @Override
    public void doTakeTreasure() {
        System.out.println("you took the treasure...");
        treasureContext.setState(treasureContext.gettreasureTakenState());
     }
    @Override
    public void doDisplayTreasure(){
        System.out.println("Display Treasure...");
        Treasure treasure = new Treasure("treasure.png", null);
        treasureContext.addObject(treasure, 528, 491);
        GreenfootImage image = treasure.getImage();
        image.scale( 150, 180 ) ; 
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
