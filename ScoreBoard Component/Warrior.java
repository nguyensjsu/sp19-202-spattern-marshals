import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Warrior here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Warrior extends People
{
    /**
     * Act - do whatever the Warrior wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        if(Greenfoot.isKeyDown("right"))
        {
            if(this.getX()+this.getImage().getWidth() < getWorld().getWidth())
                this.setLocation(this.getX() + 10,this.getY());
                MyWorld world= (MyWorld)getWorld(); //casting
                world.updateScore();
        }
        else if(Greenfoot.isKeyDown("up"))
        {
            if(this.getY()-this.getImage().getHeight() > 0)
                this.setLocation(this.getX(), this.getY() - 5);
        }
        else if(Greenfoot.isKeyDown("down"))
        { 
            if(this.getY()+this.getImage().getHeight() < getWorld().getHeight())
               this.setLocation(this.getX(), this.getY() + 5);
        }
        //MyWorld world= (MyWorld)getWorld(); //casting
        //world.updateScore();
    } 
    
    public void destroyEnemy()
     {
    Actor enemy = getOneIntersectingObject(Warrior.class);  
     
         
             MyWorld world= (MyWorld)getWorld(); 
             world.updateScore();
      
        
    }
}
