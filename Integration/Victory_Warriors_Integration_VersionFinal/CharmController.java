import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.*;
/**
 * Write a description of class CharmController here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CharmController extends Actor
{
    /**
     * Act - do whatever the CharmController wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    LuckyCharm luckyCharm;
    LuckyCharm charmprime;
    int max_num_of_charm = 2;
    int num_of_charm = 1;
    MyWorld world;
    Random rand = new Random();
    private int RivalSpawnTimer;    
    
    public void act() 
    {
        world = (MyWorld)getWorld();
        int current_charm = world.getObjects(LuckyCharm.class).size();
        if ( current_charm < max_num_of_charm) {
             runLuckyCharmTimer();
             num_of_charm +=1;
         }
         // if ( num_of_charm < 3) {
            // runLuckyCharmTimer();
        // }
    } 
    public void createLuckyCharm(int x,MyWorld w) {
       this.world = w;
       try{
       charmprime = w.charmPrime;
       LuckyCharm lc = charmprime.clone();
       //w.addObject(lc,x,465);
       }
       catch (CloneNotSupportedException ex) {
           // System.out.println("Caught exception lucky charm");
       }
    }
    private void runLuckyCharmTimer()
    {
        RivalSpawnTimer = (RivalSpawnTimer+1)%1000; // adjust '300' as desired
        if (RivalSpawnTimer == 0) {
                spawnLC();
        }
    }
    public void spawnLC()
    {       
        try{
            LuckyCharm lCharm=world.charmPrime.clone();
            //LuckyCharm lCharm1=world.charmPrime.clone();
            world.addObject(lCharm,690,rand.nextInt(100)+220);
            //world.addObject(lCharm,590,225);
       }
        catch (CloneNotSupportedException ex) {
           System.out.println("Caught exception in lucky charm");
        }
    }
}
