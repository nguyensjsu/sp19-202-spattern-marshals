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
    Random rand = new Random();
    
    RivalX rivalX;
    GifImage gifImage = new GifImage("RivalR.gif");
    private int RivalSpawnTimer;
    private int rivalCount = 0;
    
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
       wait(rand.nextInt(10) * 1000);
       if (getObjects(RivalX.class).size() < 3)
            createRivals(790 + rand.nextInt(300));
        //scrollPosition -= scrollSpeed;
        //while(scrollSpeed > 0 && scrollPosition < -picWidth) scrollPosition += picWidth;
        //while(scrollSpeed < 0 && scrollPosition > 0) scrollPosition -= picWidth;
        //paint(scrollPosition);
        //counter++;
        List<RivalX> rivals = getObjects(RivalX.class);
        for (RivalX r : rivals) {
            if (r.getX() < 0)
                this.removeObject(r);
        }
 
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
        List<RivalX> rivals = getObjects(RivalX.class);
        for (RivalX r : rivals) {
            r.setLocation(r.getX()-1, r.getY());
        }
        bg.drawImage(bgBase, position, 0);
        bg.drawImage(bgImage, position + picWidth, 0);
    } 
    
    private void prepare()
    {   
        
        createRivals(790);
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
    
    private void createRivals(int x) {
        rivalX = new RivalX();
        rivalX.setImage(gifImage.getCurrentImage());
        addObject(rivalX,x,465);
    }
    
    private void runRivalSpawnTimer()
    {
        RivalSpawnTimer = (RivalSpawnTimer+1)%180; // adjust '300' as desired
        if (RivalSpawnTimer == 0) {
            if (rivalCount < 10) {
                spawnRival();
                rivalCount += 1;
            }
        }
    }
    
    public Player getPlayer() {
        return player;
    }
     
    public void spawnRival()
    {
        // add code spawning zombie here
        RivalX new_rivalX;
        new_rivalX = new RivalX();
        new_rivalX.setImage(gifImage.getCurrentImage());
        addObject(new_rivalX,490,290);
        //this.getPlayer().attach(new_rivalX);
    }
    
    public void wait(int n) {
        while (n > 0)
            n--;
    }
    
}
