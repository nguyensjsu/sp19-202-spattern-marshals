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
    Random rand = new Random();
    RivalX rivalX;
    GifImage gifImage = new GifImage("RivalR.gif");
    private int RivalSpawnTimer;
    private int rivalCount = 0;
    private ScoreBoardSubject scoreboard;
    
    
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
        
        //counter++;
        //scroll();
 
    }
    public void createRivals(int x) {
        rivalX = new RivalX();
        rivalX.setImage(gifImage.getCurrentImage());
        addObject(rivalX,x,465);
    }
    
    /*private void runRivalSpawnTimer()
    {
        RivalSpawnTimer = (RivalSpawnTimer+1)%180; // adjust '300' as desired
        if (RivalSpawnTimer == 0) {
            if (rivalCount < 10) {
                spawnRival();
                rivalCount += 1;
            }
        }
    }*/
    
    public void paint(int position)
    {   
 
        GreenfootImage bg = getBackground();
        
        //bg.mirrorHorizontally();
        bg.drawImage(bgBase, position, 0);
        bg.drawImage(bgImage, position + picWidth, 0);
         //GreenfootImage bgwall=wall();
        //bg.mirrorHorizontally();
       // bg.drawImage(bgBase, position, 0);
       //bg.drawImage(bgImage, position + picWidth, 0);
    } 
    
    public void prepare()
    {   
        
        //System.out.println("calling load");
        level1.load(this);
       // scoreboard = new ScoreBoardSubject(this);
        
        coin1 = new Coin();
        coin2 = new Coin();
        coin3 = new Coin();
        charm = new LuckyCharm();
        
        
        snake1 = new Snake();
        snake2 = new Snake();
        snake3 = new Snake();
        //snake4 = new Snake();

        addObject(coin1,368,230);
        addObject(coin2,402,524);
        addObject(coin3,890,467);
        addObject(charm,954,377);

        addObject(snake1,639,541);
        addObject(snake2,793,462);
       /* addObject(snake3,893,544);
        //addObject(snake4,951,546);*/

        GreenfootImage image = coin1.getImage();
        GreenfootImage snakeimage = snake1.getImage();
        snakeimage.scale(50,50);
        snakeimage = snake2.getImage();
       /* snakeimage.scale(50,50);
        snakeimage = snake3.getImage();
        snakeimage.scale(50,50);*/
        //snakeimage = snake4.getImage();
       // snakeimage.scale(50,50);

         image.scale(50,50);
         image = coin2.getImage();
         image.scale(50,50);
         image = coin3.getImage();
         image.scale(50,50);
         image = charm.getImage();
         image.scale(50,50);


        /*wall = new Wall();

        addObject(wall,585,600);

        ScoreBoard scoreBoard = new ScoreBoard();
        addObject(scoreBoard,85,24);
        scoreBoard.setLocation(56,7);
        scoreBoard.setLocation(75,38);
        scoreBoard.setLocation(66,25);
        Hero hero = new Hero();
        addObject(hero,80,426);
        hero.setLocation(90,402);
        scoreBoard.setLocation(234,47);

        scoreBoard.setLocation(300,47);
        scoreBoard.setLocation(300,47);*/

        
    }
    
    public void leftScroll()
    {
        scrollPosition -= scrollSpeed;
        while(scrollSpeed > 0 && scrollPosition < -picWidth) scrollPosition += picWidth;
        while(scrollSpeed < 0 && scrollPosition > 0) scrollPosition -= picWidth;
        //paint(scrollPosition);
        GreenfootImage bg = getBackground();
        
        //bg.mirrorHorizontally();
        bg.drawImage(bgBase, scrollPosition, 0);
        bg.drawImage(bgImage, scrollPosition + picWidth, 0);
    }
    public void scroll(){
        scrollPosition -= scrollSpeed;
        while(scrollSpeed > 0 && scrollPosition < -picWidth) scrollPosition += picWidth;
       
   while(scrollSpeed < 0 && scrollPosition > 0) scrollPosition -= picWidth;
   paint(scrollPosition);
    }
    
    public void rightScroll()
    {
        scrollPosition += scrollSpeed;
        while(scrollSpeed > 0 && scrollPosition < -picWidth) scrollPosition += picWidth;
        while(scrollSpeed < 0 && scrollPosition > 0) scrollPosition -= picWidth;
        GreenfootImage bg = getBackground();
        
        //bg.mirrorHorizontally();
        bg.drawImage(bgBase, scrollPosition, 0);
        bg.drawImage(bgImage,scrollPosition-picWidth , 0);
    }
    
    
    public void stopped()
    {
        music.pausegamemusic();
    }
   /*public void spawnRival()
    {
        // add code spawning zombie here
        RivalX new_rivalX;
        new_rivalX = new RivalX();
        new_rivalX.setImage(gifImage.getCurrentImage());
        addObject(new_rivalX,490,290);
        //this.getPlayer().attach(new_rivalX);
    }*/
    
    public void wait(int n) {
        while (n > 0)
            n--;
    }
    public void started(){
    
        music.pauseGameOver();
        
        
        music.playgamemusic();
    }
}
