import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.*;

/**
 * Write a description of class RivalController here.
 * 
 * @author Priya Yadav 
 * @version (a version number or a date)
 */
public class RivalController extends Actor
{
    // instance variables - replace the example below with your own
    private int x;
    RivalX rivalX;
    MyWorld world;
    RivalX rivalXPrime;
    
    GifImage gifImage = new GifImage("RivalR.gif");
    private int RivalSpawnTimer;
    private int rivalCount = 0;
    Random rand = new Random();
    
    
    int num_of_rivals = 2;
    int max_num_of_rivals = 4;
    
    public void act()
    {
        MyWorld world = (MyWorld)getWorld();
        wait(rand.nextInt(10) * 1000);
       
        int current_rivals = world.getObjects(RivalX.class).size();
       
        //if ( current_rivals <= num_of_rivals && current_rivals <= max_num_of_rivals) {
        if ( current_rivals < max_num_of_rivals) {
            //createRivals(790 + rand.nextInt(300));
            runRivalSpawnTimer();
            //spawnRival();
            num_of_rivals +=1;
            //num_of_rivals +=1;
        }
    }
    
    /**
     * Constructor for objects of class RivalController
     */
    public RivalController()
    {
    }

    public void createRivals(int x,MyWorld w) {
        //MyWorld world = (MyWorld)getWorld();
        /*rivalX = new RivalX();
        rivalX.setImage(gifImage.getCurrentImage());
        getWorld().addObject(rivalX,x,465);*/
        world =w;
        //System.out.println(w);
        try{
        rivalXPrime = w.rivalXPrime;
        RivalX rivalX=rivalXPrime.clone();
        rivalX.setImage(gifImage.getCurrentImage());
        w.addObject(rivalX,x,465);;
        }
        catch (CloneNotSupportedException ex) {
            System.out.println("Caught exception");
        }
    }
    
    private void runRivalSpawnTimer()
    {
        RivalSpawnTimer = (RivalSpawnTimer+1)%100; // adjust '300' as desired
        if (RivalSpawnTimer == 0) {
                spawnRival();
        }
    }
    
    public void spawnRival()
    {
        
        /*MyWorld world = (MyWorld)getWorld();
        RivalX new_rivalX;
        new_rivalX = new RivalX();
        new_rivalX.setImage(gifImage.getCurrentImage());
        world.addObject(new_rivalX,790 + rand.nextInt(300),465);
        //this.getPlayer().attach(new_rivalX);*/
        try{
        RivalX new_rivalX=world.rivalXPrime.clone();
        new_rivalX.setImage(gifImage.getCurrentImage());
        world.addObject(new_rivalX,790 + rand.nextInt(300),465);
        
        }
        catch (CloneNotSupportedException ex) {
            System.out.println("Caught exception");
        }
    }
    
    public void wait(int n) {
        while (n > 0)
            n--;
    }
    
}
