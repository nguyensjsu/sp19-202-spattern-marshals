import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TreasureContext extends World
{
    public String observerState;
    public ScoreBoardSubject scoreboard;
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
        super(1000, 600, 1, false);
        setBackground("city4.jpg");  
        prepare();
    }     
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    { 
        //removeObject(treasureShowState);
        scoreboard = new ScoreBoardSubject();
        addObject(scoreboard, 425, 100);
        scoreboard.setLocation(56,7);
        scoreboard.setLocation(75,38);
        scoreboard.setLocation(66,25);
        scoreboard.attach(this);
        Hero hero = new Hero();
        addObject(hero,80,426);
        hero.setLocation(90,402);
        treasureShowState = new Show(this);
        treasureNoShowState = new NoShow(this);
        treasureTakenState = new Taken(this);
        currentState = treasureNoShowState ;
        scoreboard.setState("Actor wins..");
    }
    public void update(){
        if (scoreboard.getState().equalsIgnoreCase("Actor wins..")){
            observerState = "Actor wins..";
            completeLevel();
            displayTreasure();
            takeTreasure();
            displaylevelCompleted();
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
