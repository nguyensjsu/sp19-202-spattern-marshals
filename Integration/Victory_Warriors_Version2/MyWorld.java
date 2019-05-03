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
    private Sound music;
    //private static final String bgImageName = "city4.jpg";    //level1
    private static final double scrollSpeed = 2;
    private static  int picWidth ;
    private GreenfootImage bgImage, bgBase;
    private int scrollPosition = 0;
    private Component compo;
    private Strategy level1;
    private ScoreBoardSubject scoreboard;
    private Player player;
    private RivalController rivalController;
    RivalX rivalXPrime;
    GifImage gifImage  = new GifImage("RivalR.gif");
    
    
    
     private LuckyPower coin1;
    private LuckyPower coin2;
    private LuckyPower coin3;
    private LuckyPower charm;
    private NegativePower snake1;
    private NegativePower snake2;
    private NegativePower snake3;
    private NegativePower snake4;
    
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
         super(1000, 600, 1, false);
       
        music=Sound.getInstance();
        level1=new Level1();
         compo=new Composite(this,level1.getfileName());
        bgImage = ((Actor)compo).getImage();
        setBackground(bgImage);
        picWidth=bgImage.getWidth();
        bgBase = new GreenfootImage(picWidth, getHeight());
        bgBase.drawImage(bgImage, 0, 0);
        music.playgamemusic();  
        //
        /*Actor actor = new Cloud();
int x = Greenfoot.getRandomNumber(getWidth()); // random x (possible)
int y = Greenfoot.getRandomNumber(getHeight()); // random y (possible)
if (Greenfoot.getRandomNumber(2) == 0) // which edge to be on
{
    x = (getWidth()-Greenfoot.getRandomNumber(2))%getWidth(); // random edge (left or right)
}
else
{
    y = (getHeight()-Greenfoot.getRandomNumber(2))%getHeight(); // ranom edge (top or bottom)
}
addObject(actor, x, y);*/
  
   //addObject(new Cloud(), getWidth() - 1, Greenfoot.getRandomNumber(getHeight()));  

        prepare();
    }
    
    public void act()
    {
       
       
        
 
    }
   
    
    
    
    public void paint(int position)
    {   
 
        GreenfootImage bg = getBackground();
        
       
        bg.drawImage(bgBase, position, 0);
        bg.drawImage(bgImage, position + picWidth, 0);
      
    } 
    
    public void prepare()
    {   
        
        
        level1.load(this);
       createCoin();
        
        
        charm = new LuckyCharm();
        
        
        snake1 = new Snake();
        snake2 = new Snake();
        snake3 = new Snake();
        //snake4 = new Snake();

      
        addObject(charm,954,377);

        addObject(snake1,639,541);
        addObject(snake2,793,462);
       /* addObject(snake3,893,544);
        //addObject(snake4,951,546);*/

        
        GreenfootImage snakeimage = snake1.getImage();
        snakeimage.scale(50,50);
        snakeimage = snake2.getImage();
       /* snakeimage.scale(50,50);
        snakeimage = snake3.getImage();
        snakeimage.scale(50,50);*/
        //snakeimage = snake4.getImage();
       // snakeimage.scale(50,50);
       


       rivalXPrime = new RivalX();
        rivalXPrime.setImage(gifImage.getCurrentImage());
 
        rivalController = new RivalController();
        addObject(rivalController, 0,0);
        rivalController.createRivals(790,this);

        
    }
    
    
    public void scroll(){
        scrollPosition -= scrollSpeed;
        while(scrollSpeed > 0 && scrollPosition < -picWidth) scrollPosition += picWidth;
       
   while(scrollSpeed < 0 && scrollPosition > 0) scrollPosition -= picWidth;
   paint(scrollPosition);
    }
    
    
    
    
    public void stopped()
    {
        music.pausegamemusic();
    }
   
    
    public void wait(int n) {
        while (n > 0)
            n--;
    }
    public void started(){
    
        music.pauseGameOver();
        
        Greenfoot.setWorld(new MyWorld());
        music.playgamemusic();
    }
    
    public void createCoin()
    {
        coin1 = new Coin();
        coin2 = new Coin();
        coin3 = new Coin();
          //addObject(coin1,400+rand.nextInt(300),230);
        //addObject(coin2,400+rand.nextInt(300),230);
        //addObject(coin3,400+rand.nextInt(300),250);
         GreenfootImage image = coin1.getImage();
         image.scale(50,50);
         image = coin2.getImage();
         image.scale(50,50);
         image = coin3.getImage();
         image.scale(50,50);
         //image = charm.getImage();
         image.scale(50,50);
    }
    public void createsingle()
    {
        coin1 = new Coin();
        
         //addObject(coin1,400+rand.nextInt(300),230);
    }
    
    
    public Player getPlayer() {
        return player;
    }
}
