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
    public LuckyPower coin1;
    public LuckyPower coin2;
    public LuckyPower coin3;
    public LuckyPower coin4;
    public NegativePower snake1;
    public NegativePower snake2;
    public NegativePower snake3;
    public NegativePower snake4;
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
        //Setupobserver for scoreboard
        scoreboard.attach(this);
        
        Hero hero = new Hero();
        addObject(hero,80,426);
        hero.setLocation(90,402);
        
        coin1 = new Coin();
        coin2 = new Coin();
        coin3 = new Coin();
        coin4 = new Coin();
        snake1 = new Snake();
        snake2 = new Snake();
        snake3 = new Snake();
        snake4 = new Snake();
                
        addObject(coin1,400,100);
        addObject(coin2,300,100);
        addObject(coin3,200,100);
        addObject(coin3,100,100);
        
        addObject(snake1,700,500);
        addObject(snake2,600,500);
        addObject(snake3,500,500);
        addObject(snake4,400,500);
        
        coin1.setLocation(400,100);
        GreenfootImage image = coin1.getImage();
        GreenfootImage snakeimage = snake1.getImage();
        snakeimage.scale(50,50);
        snakeimage = snake2.getImage();
        snakeimage.scale(50,50);
        snakeimage = snake3.getImage();
        snakeimage.scale(50,50);
        snakeimage = snake4.getImage();
        snakeimage.scale(50,50);
        
        image.scale(50,50);
        image = coin2.getImage();
        image.scale(50,50);
        image = coin3.getImage();
        image.scale(50,50);
        image = coin4.getImage();
        image.scale(50,50);
       
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
