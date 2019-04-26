import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.*;
/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{
     
    private Wall wall;
    private static final String bgImageName = "city4.jpg";    //level1
    private static final double scrollSpeed = 1;
    private static final int picWidth = (new GreenfootImage(bgImageName)).getWidth();
    private GreenfootImage bgImage, bgBase;
    private int scrollPosition = 0;
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
       
 
        super(1000, 600, 1, false);
        setBackground(bgImageName);
        //backgroundMusic.playLoop();
        bgImage = new GreenfootImage(getBackground());
        bgBase = new GreenfootImage(picWidth, getHeight());
        bgBase.drawImage(bgImage, 0, 0);
        prepare();
    }
    
    public void act()
    {
       
        scrollPosition -= scrollSpeed;
        while(scrollSpeed > 0 && scrollPosition < -picWidth) scrollPosition += picWidth;
        while(scrollSpeed < 0 && scrollPosition > 0) scrollPosition -= picWidth;
        paint(scrollPosition);
        //counter++;

 
    }
    
    private void paint(int position)
    {   
        
        


        
        
        GreenfootImage bg = getBackground();
        //bg.mirrorHorizontally();
        bg.drawImage(bgBase, position, 0);
        bg.drawImage(bgImage, position + picWidth, 0);
         //GreenfootImage bgwall=wall();
        //bg.mirrorHorizontally();
        bg.drawImage(bgBase, position, 0);
        bg.drawImage(bgImage, position + picWidth, 0);
    } 
    
    private void prepare()
    {   

        wall = new Wall();
        addObject(wall,585,600);

        ScoreBoard scoreBoard = new ScoreBoard();
        addObject(scoreBoard,85,24);
        scoreBoard.setLocation(56,7);
        scoreBoard.setLocation(75,38);
        scoreBoard.setLocation(66,25);
        Hero hero = new Hero();
        addObject(hero,80,426);
        hero.setLocation(90,402);
    }
    
    
    
    
}
