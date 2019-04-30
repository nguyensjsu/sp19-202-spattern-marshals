import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TreasureContext extends World
{
    //move the below actors to game play screen
    private LuckyPower coin1;
    private LuckyPower coin2;
    private LuckyPower coin3;
    private LuckyPower charm;
    private NegativePower snake1;
    private NegativePower snake2;
    private NegativePower snake3;
    private NegativePower snake4;

    private Hero hero;
    private HealthBar healthBar;
    
    //Context for treasure state and observer subject
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
        hero = new Hero();
        addObject(hero,70,500);

        scoreboard = new ScoreBoardSubject();
        addObject(scoreboard, 425, 100);
       
        healthBar = new HealthBar();
        addObject(healthBar,500,36);

        //Setupobserver for scoreboard
        scoreboard.attach(this);

        //setup observer for Hero subject
        hero.attach(scoreboard);
        
        //move coins/snakes addition to main play screen component
        coin1 = new Coin();
        coin2 = new Coin();
        coin3 = new Coin();
        charm = new LuckyCharm();
        
        
        snake1 = new Snake();
        snake2 = new Snake();
        snake3 = new Snake();
        //snake4 = new Snake();

        addObject(coin1,696,459);
        addObject(coin2,728,544);
        addObject(coin3,890,467);
        addObject(charm,954,377);

        addObject(snake1,639,541);
        addObject(snake2,793,462);
        addObject(snake3,893,544);
        //addObject(snake4,951,546);

        GreenfootImage image = coin1.getImage();
        GreenfootImage snakeimage = snake1.getImage();
        snakeimage.scale(50,50);
        snakeimage = snake2.getImage();
        snakeimage.scale(50,50);
        snakeimage = snake3.getImage();
        snakeimage.scale(50,50);
        //snakeimage = snake4.getImage();
       // snakeimage.scale(50,50);

         image.scale(50,50);
         image = coin2.getImage();
         image.scale(50,50);
         image = coin3.getImage();
         image.scale(50,50);
         image = charm.getImage();
         image.scale(50,50);

        // set the context for treasure/display complete message
        treasureShowState = new Show(this);
        treasureNoShowState = new NoShow(this);
        treasureTakenState = new Taken(this);
        currentState = treasureNoShowState ;
        //set actor win event to test- replace this with actor winning the game
        scoreboard.setState("Actor wins..");
    }   
    public void update(){
        if (scoreboard.getState().equalsIgnoreCase("Actor wins..")){
            //set current treasure state to no show
            completeLevel();
            displayTreasure();
        }
        else if(scoreboard.getState().equalsIgnoreCase("Actor looses")){
           scoreboard.setState("Actor lost..");
        }
    }  
    public void completeLevel(){
       System.out.println("completed level...");
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
            System.out.println("set state "+currentState);
            currentState.doDisplaylevelCompleted();
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