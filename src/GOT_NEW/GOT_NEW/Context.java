import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.lang.*;
import java.util.*;
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
    private Component cloud,treasure,healthBar;
    private MyWorld w;
    
    Random rand = new Random();
        RivalX rivalX;
    GifImage gifImage = new GifImage("RivalR.gif");
    private int RivalSpawnTimer;
    private int rivalCount = 0;

    public void act() 
    {
        // Add your action code here.
        //composite.display();
        
        wait(rand.nextInt(10) * 1000);
       if (w.getObjects(RivalX.class).size() < 3)
            createRivals(790 + rand.nextInt(300));
        //scrollPosition -= scrollSpeed;
        //while(scrollSpeed > 0 && scrollPosition < -picWidth) scrollPosition += picWidth;
        //while(scrollSpeed < 0 && scrollPosition > 0) scrollPosition -= picWidth;
        //paint(scrollPosition);
        //counter++;
        List<RivalX> rivals = w.getObjects(RivalX.class);
        for (RivalX r : rivals) {
            if (r.getX() < 0)
                w.removeObject(r);
        }
    }    
    
    public void load(MyWorld w)
    {
        //System.out.println("loaded");
        this.w=w;
        composite=new Composite(w);
        hero= new Player(w);
        wall=new Wall(w);
        scoreboard=new ScoreBoard(w);
        treasure=new Treasure(w);
        healthBar= new HealthBar(w);
        
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
        composite.addChild(scoreboard);
        composite.addChild(treasure);
        composite.addChild(healthBar);
        
        composite.display();
        
        
    }
    public void loadCloud()
    {
        composite.display();
    }
    
    
    public void spawnRival()
    {
        // add code spawning zombie here
        RivalX new_rivalX;
        new_rivalX = new RivalX();
        new_rivalX.setImage(gifImage.getCurrentImage());
        w.addObject(new_rivalX,490,290);
        //this.getPlayer().attach(new_rivalX);
    }
    
    public void wait(int n) {
        while (n > 0)
            n--;
    }
    
        private void createRivals(int x) {
        rivalX = new RivalX();
        rivalX.setImage(gifImage.getCurrentImage());
        w.addObject(rivalX,x,465);
    }
    
    private void runRivalSpawnTimer()
    {
        RivalSpawnTimer = (RivalSpawnTimer+1)%180; // adjust '300' as desired
        if (RivalSpawnTimer == 0) {
            if (rivalCount < 10) {
                spawnRival();
                rivalCount += 1;
            }
        }
    }
        
}
