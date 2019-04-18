import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

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
        Actor obj, land;
        World myWorld = getWorld();

        c = getChild(0);    

        land = (Actor) c;
        myWorld.addObject(land,0,getY());   // adding land 
        
        

    }
    public void act() {
     display();  
   }
    public void update(){
    } 
}
