import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Wall here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Wall extends Leaf

{
    private MyWorld w;
    /**
     * Act - do whatever the Wall wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Wall(MyWorld w)
    {
        this. w=w;
    }
    public void act() 
    {
        // Add your action code here.
    }  
    public void display()
            {
                
               w.addObject(this,585,600);   
                  
}
}
