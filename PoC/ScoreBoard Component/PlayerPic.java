import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class PlayerPic here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class PlayerPic extends Actor
{
    public PlayerPic()
    {
        GreenfootImage playerpic = getImage();
        playerpic.scale(playerpic.getWidth() - 10, playerpic.getHeight() - 10);
        setImage(playerpic);
    }
    /**
     * Act - do whatever the PlayerPic wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
    } 
    
}
