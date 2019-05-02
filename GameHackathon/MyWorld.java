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
    private HealthBar healthBar;
    private Opponent opponent1;
    private Opponent opponent2;
    private static final String bgImageName = "bg_grass_grill.jpg";    //level1
    private static final double scrollSpeed = 2;
    private static final int picWidth = (new GreenfootImage(bgImageName)).getWidth();
    private GreenfootImage bgImage, bgBase;
    private int scrollPosition = 0;
    private Player player;
    private RivalController rivalController;
    RivalX rivalXPrime;
    GifImage gifImage  = new GifImage("RivalR.gif");
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

        //scrollPosition -= scrollSpeed;
        //while(scrollSpeed > 0 && scrollPosition < -picWidth) scrollPosition += picWidth;
        //while(scrollSpeed < 0 && scrollPosition > 0) scrollPosition -= picWidth;
        //paint(scrollPosition);
        //counter++;
 
    }
    
    public void scroll() {
        scrollPosition -= scrollSpeed;
        while(scrollSpeed > 0 && scrollPosition < -picWidth) scrollPosition += picWidth;
        while(scrollSpeed < 0 && scrollPosition > 0) scrollPosition -= picWidth;
        paint(scrollPosition);
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
        rivalXPrime = new RivalX();
        rivalXPrime.setImage(gifImage.getCurrentImage());
 
        rivalController = new RivalController();
        addObject(rivalController, 0,0);
        rivalController.createRivals(790,this);
        //wall = new Wall();
        //addObject(wall,585,600);
        player = new Player();
        addObject(player,90,482);
        player.setLocation(290,482);
        healthBar = new HealthBar();
        addObject(healthBar,500,36);
        //opponent1 = new Opponent();
        //addObject(opponent1,690,482);
        //opponent2 = new Opponent();
        //addObject(opponent2,890,482);
        
    }
    
    public Player getPlayer() {
        return player;
    }
     
    

}
