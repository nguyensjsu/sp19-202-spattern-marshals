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
    private Context context;
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
         super(1000, 600, 1, false);
       
        music=Sound.getInstance();
        context=new Context();
         compo=new Composite(this);
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
       
        
        //counter++;
        //scroll();
 
    }
    
    public void paint(int position)
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
    
    public void prepare()
    {   
        
        System.out.println("calling load");
        context.load(this);

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
    
    
    
}
