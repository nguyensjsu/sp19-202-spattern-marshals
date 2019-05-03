import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.lang.*;
/**
 * Write a description of class Context here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Context extends Actor
{
    /**
     * Act - do whatever the Context wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private Component composite;
    private Component hero;
    private Component wall,scoreboard;
    private Component cloud,treasure;

    public void act() 
    {
        // Add your action code here.
        //composite.display();
    }    
    
    public void load(MyWorld w)
    {
        //System.out.println("loaded");
     /*   composite=new Composite(w);
        hero= new Hero(w);
        wall=new Wall(w);
        scoreboard=new ScoreBoard(w);
        treasure=new Treasure(w);
        try{
        Cloud cloud1=new Cloud(w);
        Cloud cloud2=cloud1.clone();
        Cloud cloud3=cloud1.clone();
        Cloud cloud4=cloud1.clone();
        Cloud cloud5=cloud1.clone();
        Cloud cloud6=cloud1.clone();
        //Cloud cloud7=cloud1.clone();
        composite.addChild(cloud1);
        composite.addChild(cloud2);
        composite.addChild(cloud3);
        composite.addChild(cloud4);
        composite.addChild(cloud5);
        composite.addChild(cloud6);
        //composite.addChild(cloud7);*/
        
        
    }
  /*  catch (CloneNotSupportedException ex) {
            System.out.println("Caught exception");
        }
        
        
        
        composite.addChild(wall);
        composite.addChild(hero);
        composite.addChild(scoreboard);
        composite.addChild(treasure);
        
        composite.display();
        
   
    }
    */         
}
