import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Hero here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Hero extends Composite
{
    /**
     * Act - do whatever the Hero wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
     private int dir = -1;
private int speed = 2;
private World w;
    public Hero(World w)
    
    {
        this.w=w;
        this.getImage().scale(this.getImage().getWidth() + 50, this.getImage().getHeight() + 50);
    }
    public void act()
    {
       
   

        
               if(Greenfoot.isKeyDown("right"))
        {
            
            if(this.getX()+this.getImage().getWidth() < w.getWidth())
                this.setLocation(this.getX() + 2,this.getY());
                
                MyWorld world = (MyWorld) getWorld();
            world.leftScroll();
             // ww  = getWorld().getWidth();
             // wh = 
             
        }
        else if(Greenfoot.isKeyDown("left"))
        {
            
            if(this.getX()-this.getImage().getWidth()> 0)
                this.setLocation(this.getX() - 2, this.getY());
                MyWorld world = (MyWorld) getWorld();
            world.rightScroll();
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
            
            if(this.getY()+this.getImage().getHeight() < w.getHeight())
               this.setLocation(this.getX(), this.getY() + 5);
               //setLocation((getX()+ww)%ww, (getY()+wh)%wh);
        }
        
            }
           
     
    
   
 
/*public void act()
{
    //move(dir*speed);
    if (isAtEdge()) getWorld().removeObject(this);
          if(Greenfoot.isKeyDown("right"))
        {
            
            if(this.getX()+this.getImage().getWidth()/2 < getWorld().getWidth())
                this.setLocation(this.getX() + 10,this.getY());
             // ww  = getWorld().getWidth();
             // wh = 
             
        }
        else if(Greenfoot.isKeyDown("left"))
        {
            
            if(this.getX()-this.getImage().getWidth()/2 > 0)
                this.setLocation(this.getX() - 5, this.getY());
               //setLocation((getX()+ww)%ww, (getY()+wh)%wh);
        }
        else if(Greenfoot.isKeyDown("up"))
        {
           
            if(this.getY()-this.getImage().getHeight()/2 > 0)
                this.setLocation(this.getX(), this.getY() - 5);
               //setLocation((getX()+ww)%ww, (getY()+wh)%wh);
        }
        else if(Greenfoot.isKeyDown("down"))
        {
            
            if(this.getY()+this.getImage().getHeight()/2 < getWorld().getHeight())
               this.setLocation(this.getX(), this.getY() + 5);
               //setLocation((getX()+ww)%ww, (getY()+wh)%wh);
        }
        
   

}*/
/*public void act(){
      int dx = 0, dy = 0;
        if (Greenfoot.isKeyDown("left")) dx--;
        if (Greenfoot.isKeyDown("right")) dx++;
        if (Greenfoot.isKeyDown("up")) dy--;
        if (Greenfoot.isKeyDown("down")) dy++;
        // if moving
        if (dx != 0 || dy != 0)
        {
            // remove any gun
            //removeTouching(Gun.class);
            // limit movement to keep boy image in world window at all times
            if (getX()+dx < getImage().getWidth()/2 || getX()+dx > getWorld().getWidth()-getImage().getWidth()/2) dx = 0;
            if (getY()+dy < getImage().getHeight()/2 || getY()+dy > getWorld().getHeight()-getImage().getHeight()/2) dy = 0;
            /** these last two statements go hand in hand with the boy being the central actor in the world */
            // move
            
            public void display()
            {
                 
                  //System.out.println("Display Hero");
                  w.addObject(this,139,480);
}
}
