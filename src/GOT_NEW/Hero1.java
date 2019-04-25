import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Hero1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Hero1 extends Actor
{
    /**
     * Act - do whatever the Hero1 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    
    
    {
        
        
        
                      if(Greenfoot.isKeyDown("right"))
        {
            
            if(this.getX()+this.getImage().getWidth() < getWorld().getWidth())
                this.setLocation(this.getX() + 10,this.getY());
             // ww  = getWorld().getWidth();
             // wh = 
             
        }
        else if(Greenfoot.isKeyDown("left"))
        {
            
            if(this.getX()-this.getImage().getWidth()> 0)
                this.setLocation(this.getX() - 5, this.getY());
               //setLocation((getX()+ww)%ww, (getY()+wh)%wh);
        }
        else if(Greenfoot.isKeyDown("up"))
        {
           
            if(this.getY()-this.getImage().getHeight() > 0)
                this.setLocation(this.getX(), this.getY() - 5);
               //setLocation((getX()+ww)%ww, (getY()+wh)%wh);
        }
        else if(Greenfoot.isKeyDown("down"))
        {
            
            if(this.getY()+this.getImage().getHeight() < getWorld().getHeight())
               this.setLocation(this.getX(), this.getY() + 5);
               //setLocation((getX()+ww)%ww, (getY()+wh)%wh);
        }
        // Add your action code here.
    }    
}
