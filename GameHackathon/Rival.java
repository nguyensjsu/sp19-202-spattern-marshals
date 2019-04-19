import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Rival here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Rival extends Actor
{
    GifImage gifImage = new GifImage("Rival.gif");
    
    public Rival()
    {   
    int scalePercent = 120;
    
    for (GreenfootImage image : gifImage.getImages())
    {
        int wide = image.getWidth()*scalePercent/100;
        int high = image.getHeight()*scalePercent/100;
        image.scale(wide, high);
    
    }
    
}
    
    /**
     * Act - do whatever the Rival wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        setImage(gifImage.getCurrentImage());
        //if (isAtEdge() ) 
        /*if (this.getY()==400) {
           
           this.setImage(new GreenfootImage ("ahhhh.png"));
           //getWorld().removeObject(this);
           
        }
        else {
            setLocation(getX(), getY()+1);
        }  */  
    }
}
