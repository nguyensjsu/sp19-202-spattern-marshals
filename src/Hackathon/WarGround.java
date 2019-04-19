import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class WarGround here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class WarGround extends Composite
{
    public WarGround() {
        
    }
    /**
     * Act - do whatever the river wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private static int Y=0;
    public void display() {
       
            
            IDisplayComponent c;
        Actor obj, land;
        World myWorld = getWorld();

        c = getChild(0);    

        land = (Actor) c;
        myWorld.addObject(land,0,getY());   // adding land 
         int y = getY()+200;
        for (int i=1; i<4; i++) {
           
            c = getChild(i);
            land = (Actor)c;
            myWorld.addObject(land,0,y);
            y-=100;
        }

    }
    public void act() {
     display();  
   }
    public void update(){
    }
}
