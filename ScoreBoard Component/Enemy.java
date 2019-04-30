import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Enemy here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Enemy extends People
{
    /**
     * Act - do whatever the Enemy wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
       
       if(Greenfoot.isKeyDown("left"))
        {  
            if(this.getX()-this.getImage().getWidth()> 0)
                this.setLocation(this.getX() - 5, this.getY());
                MyWorld world= (MyWorld)getWorld(); //casting
                world.reduceScore();
        }
        else if(Greenfoot.isKeyDown("up"))
        {
            if(this.getY()-this.getImage().getHeight() > 0)
                this.setLocation(this.getX(), this.getY() - 5);
        }
        //MyWorld world= (MyWorld)getWorld(); //casting
        //world.reduceScore();
        
    
    }    
}
