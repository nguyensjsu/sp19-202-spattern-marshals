import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Composite here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Composite extends Actor implements Component
{
    /**
     * Act - do whatever the Composite wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    
    private Wall wall;
    private static final String bgImageName = "city4.jpg";  
     private static final double scrollSpeed = 1;
     private static final int picWidth = (new GreenfootImage(bgImageName)).getWidth();
    private Scroller scroller;
    private GreenfootImage bgImage, bgBase;
    private int scrollPosition = 0;
    private World w;
   
    
    public Composite(MyWorld w)
    {
        this.w=w;
       // scroller = new Scroller(w, new GreenfootImage("city3.jpg"),5466,613);
        this. setImage(w.getBackground());
        bgBase = new GreenfootImage(picWidth, w.getHeight());
        bgBase.drawImage(this.getImage(), 0, 0);
       
    
    }
    public void act() 
    {
        // Add your action code here.
         scrollPosition -= scrollSpeed;
        while(scrollSpeed > 0 && scrollPosition < -picWidth) scrollPosition += picWidth;
        while(scrollSpeed < 0 && scrollPosition > 0) scrollPosition -= picWidth;
        paint(scrollPosition);
        //scroll();
    }  
    public void scroll(){
         scroller.scroll(5,0);
    }
    public void paint (int position)
    {
        GreenfootImage bg = w.getBackground();
        //bg.mirrorHorizontally();
        bg.drawImage(bgBase, position, 0);
        bg.drawImage(bgImage, position + picWidth, 0);
         //GreenfootImage bgwall=wall();
        //bg.mirrorHorizontally();
        bg.drawImage(bgBase, position, 0);
        bg.drawImage(bgImage, position + picWidth, 0);
    }
    
    public void load(){
        
        wall = new Wall();
       
        w.addObject(wall,585,600);

        ScoreBoard scoreBoard = new ScoreBoard();
        w.addObject(scoreBoard,85,24);
        scoreBoard.setLocation(56,7);
        scoreBoard.setLocation(75,38);
        scoreBoard.setLocation(66,25);
        Hero hero = new Hero();
        w.addObject(hero,80,426);
        hero.setLocation(90,402);
        scoreBoard.setLocation(234,47);

        scoreBoard.setLocation(300,47);
        scoreBoard.setLocation(300,47);
        
    }
    
}
