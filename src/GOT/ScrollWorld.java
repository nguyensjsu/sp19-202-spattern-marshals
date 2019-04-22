import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
 
/**
 * Write a description of class ScrollWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ScrollWorld extends World
{
 
    /**
     * Constructor for objects of class ScrollWorld.
     * 
     */
   
    private Scroller scroller;
     
    public ScrollWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
       super(1000, 600, 1, false);
        scroller = new Scroller(this, new GreenfootImage("city3.jpg"),5466,613);
        prepare();
    }
     
    public void prepare()
    {

        Hero hero = new Hero();
        addObject(hero,84,519);
    }
     
    public void act()
    {
        
        scroll();
    }
     
   
    private void scroll()
    {
        scroller.scroll(5,0);
    }
     
     
 
}