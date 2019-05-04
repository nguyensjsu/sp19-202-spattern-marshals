import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.lang.*;
import java.util.*;
/**
 * Write a description of class Context here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Strategy extends Actor
{
    /**
     * Act - do whatever the Context wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private Composite composite;
    private Component mediator;
    private Component gameProgress;
    private Component castleIcon;
    private Component healthIcon;
    private Component gameOver;
    private Component levelComplete;
    private Component hero;
    private Component wall,scoreboard;
    private Component playerNameBox;
    private Component cloud,treasure,healthBar,board;
    private MyWorld w;
    protected String bgImageName;
    
    Random rand = new Random();
        RivalX rivalX;
    GifImage gifImage = new GifImage("RivalR.gif");
    private int RivalSpawnTimer;
    private int rivalCount = 0;

    public void act() 
    {
        // Add your action code here.
        //composite.display();
      
    }    
    
    public void load(MyWorld w)
    {
        //System.out.println("loaded");
        this.w=w;
        composite=new Composite(w,bgImageName);
        hero= new Player(w);
        wall=new Wall(w);
        healthBar= new HealthBar(w);
        treasure=new Treasure("treasure1.png", w);
         board=new ScoreBoardSubject(w);
       // w.addObject(board, 110, 53);
        try{
        Cloud cloud=new Cloud(w);
        Cloud cloud2=cloud.clone();
        Cloud cloud3=cloud.clone();
        Cloud cloud4=cloud.clone();
        Cloud cloud5=cloud.clone();
        Cloud cloud6=cloud.clone();
        //Cloud cloud7=cloud1.clone();
        composite.addChild(cloud);
        composite.addChild(cloud2);
        composite.addChild(cloud3);
        composite.addChild(cloud4);
        composite.addChild(cloud5);
        composite.addChild(cloud6);
        //composite.addChild(cloud7);*/
        
        
    }
    catch (CloneNotSupportedException ex) {
            System.out.println("Caught exception");
        }
        
        
        
        composite.addChild(wall);
        composite.addChild(hero);
        composite.addChild(board);
        composite.addChild(treasure);
        mediator = new PlayerMediator(w);
        composite.addChild(mediator);
        gameProgress = new GameProgress(w);
        composite.addChild(gameProgress);
        castleIcon = new CastleIcon(w);
        composite.addChild(castleIcon);
        healthIcon = new HealthIcon(w);
        composite.addChild(healthIcon);
        composite.addChild(healthBar);
        gameOver = new GameOver(w);
        composite.addChild(gameOver);
        levelComplete = new LevelComplete(w);
        composite.addChild(levelComplete);
        playerNameBox = new PlayerNameBox(w);
        composite.addChild(playerNameBox);
        composite.display();
        
        
    }
    
    
    
    
    
    public String getfileName()
    {
        return bgImageName;
    }
        
}
