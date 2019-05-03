import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class PlayerName here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class PlayerNameBox extends Leaf
{
    MyWorld w;
    GreenfootImage image;
    public static final float FONT_SIZE = 40.0f;
    public PlayerNameBox(MyWorld w) {
        this.w = w;
        image = new GreenfootImage("player_name_box.png");
        image.scale(250,190);
    }
    /**
     * Act - do whatever the PlayerName wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        setImage(image);
    }    
    
    public void display()
    {
       w.addObject(this,860,-20);
    }
}
