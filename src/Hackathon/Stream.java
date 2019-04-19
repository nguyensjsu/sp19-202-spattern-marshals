import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.*;
/**
 * Write a description of class Stream here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Stream extends Composite
{
    public Stream() {
        this.getImage().scale(2500,100);
    }
    /**
     * Act - do whatever the river wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private static int Y=0;
    
    public void display() {
       
            
            IDisplayComponent c;
        Actor obj, land,boat;
        World myWorld = getWorld();

        c = getChild(0);    

        land = (Actor) c;
       myWorld.addObject(land,0,getY());   // adding land 


        int x = 200;
        
        for (int i=1; i<4; i++) {

            c = getChild(i);
            obj = (Actor)c;
            if (i> 7)
                myWorld.addObject(obj,x,getY());  //adding trees and rocks
            else
                myWorld.addObject(obj,x,getY()-getRandomNumber(25,75));  //adding trees and rocks

            x+=200;

        }
    }
    
  
 
    public int getRandomNumber(int start,int end)
{
       int normal = Greenfoot.getRandomNumber(end-start+1);
       return normal+start;
}

    
    public void act() {
     display();  
   }
    public void update(){
    } 
}
