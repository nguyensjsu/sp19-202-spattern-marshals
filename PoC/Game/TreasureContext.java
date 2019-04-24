import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TreasureContext extends GameWorld
{
    TreasureState treasureShowState ;
    TreasureState treasureNoShowState ;
    TreasureState treasureTakenState ;
    TreasureState currentState ;
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public TreasureContext()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
       // super(600, 400, 1); 
        //super(1000, 600, 1, false);
        //prepare();
        treasureShowState = new Show(this);
        treasureNoShowState = new NoShow(this);
        treasureTakenState = new Taken(this);
        currentState = treasureNoShowState ;
    }     
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    { 
        //removeObject(treasureShowState);
        //removeObject(treasureTakenState);
        treasureShowState = new Show(this);
        treasureNoShowState = new NoShow(this);
        treasureTakenState = new Taken(this);
        currentState = treasureNoShowState ;
        //displayTreasure();
       // completeLevel();
        // displayTreasure();
        // takeTreasure();
        // displaylevelCompleted();
        //displayTreasure();
        
    }
    public void update(){
        if (scoreboard.getState().equalsIgnoreCase("Actor Wins")){
            observerState = "Actor wins..";
            completeLevel();
            displayTreasure();
            takeTreasure();
        }
        else if(scoreboard.getState().equalsIgnoreCase("Actor looses")){
            observerState = "Actor lost..";
        }
     }
    public void completeLevel(){
        System.out.println( "completed level...");
        currentState.doCompleteLevel();
    }
    public void takeTreasure(){
        System.out.println( "taking treasure...");
        currentState.doTakeTreasure();
    }
    public void displaylevelCompleted(){
        System.out.println( "displaying level completed...");
        currentState.doDisplaylevelCompleted();
    }
    public void displayTreasure(){
        System.out.println( "Treasure seen..");
        currentState.doDisplayTreasure();
        }
    public void setState(TreasureState nextState) {
            currentState = nextState ; 
     }  
    public TreasureState gettreasureShowState() {
        return treasureShowState;
    }
    public TreasureState gettreasureTakenState() {
        return treasureTakenState;
    }
    public TreasureState gettreasureNoShowState() {
        return treasureNoShowState;
    }
    public void showState()
    {
        System.out.println( "Current State: " + currentState.getClass().getName());
    }
 }
