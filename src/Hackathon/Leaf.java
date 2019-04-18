import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Leaf here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Leaf extends Actor implements IDisplayComponent
{
    /**
     * Act - do whatever the Leaf wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    private boolean isFinishLevelReached = false;
    public void act() 
    {
        World world = getWorld();
        // Add your action code here.
        int worldX = world.getWidth();      
        int worldY = world.getHeight();
        if(getFinishLevel()==false)
            setLocation((getX())%worldX, (getY()+1)%worldY);
        
    }  
 public Leaf ()
    {
       
    }
    
    public Leaf ( String d )
    {
       
        
    }
    

    public void addSubComponent(IDisplayComponent c) {
        
    }
     
    public void removeComponent(IDisplayComponent c) {
        
    }
     
    public IDisplayComponent  getChild(int i) {
        return null;
    }
    
    public void display(){
       
        }
        
        
        public void scale(int x, int y) {
        this.getImage().scale(x,y);
    }
    public void update(boolean state){
        this.isFinishLevelReached =  state;
    }
    public boolean getFinishLevel(){
        return isFinishLevelReached;
    }
    }

