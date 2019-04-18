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
        this.getImage().scale(2500,100);
    }
    /**
     * Act - do whatever the river wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private static int Y=0;
    public void display() {
       
            
            /*IDisplayComponent c;
        Actor obj, land;
        World myWorld = getWorld();

        c = getChild(0);    

        land = (Actor) c;
        myWorld.addObject(land,0,getY()); */  // adding land 
        
        World myWorld = getWorld();
        IDisplayComponent rd;
        Actor road;
        int y = getY()+100;
        for (int i=0; i<2; i++) {
            rd = getChild(i);
            road = (Actor)rd;
            myWorld.addObject(road,0,y);
            y-=100;
        }

    }
    public void act() {
     display();  
   }
    public void update(){
    }
}
