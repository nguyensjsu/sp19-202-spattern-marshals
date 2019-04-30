import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.*;
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
    
    protected ArrayList<Component> components=new ArrayList<>();
    private Wall wall;
    //private static final String bgImageName = "castle.png"; 
    private static final String bgImageName="fort.jpg";
     private static final double scrollSpeed = 1;
     //private static final int picWidth = this.getImage().getWidth();
    
    private GreenfootImage bgImage, bgBase;
    private int scrollPosition = 0;
    private World w;
    private int picWidth;
    private boolean loaded=false;
    
    
    public Composite(MyWorld w)
    {
        this.w=w;
       // scroller = new Scroller(w, new GreenfootImage("city3.jpg"),5466,613);
        this. setImage(bgImageName);
       // this.getImage().scale(1400,600);
        
        load();
       
       /* bgImage=getImage();
        picWidth=this.getImage().getWidth();
        //System.out.println(picWidth);
        //System.out.println(w);
        bgBase = new GreenfootImage(picWidth, w.getHeight());
        bgBase.drawImage(this.getImage(), 0, 0);*/
       
    
    }
    
    public  Composite()
    {
    }
    
    public void act() 
    {
        // Add your action code here.
         /*scrollPosition -= scrollSpeed;
        while(scrollSpeed > 0 && scrollPosition < -picWidth) scrollPosition += picWidth;
        while(scrollSpeed < 0 && scrollPosition > 0) scrollPosition -= picWidth;
        paint(scrollPosition);*/
        //scroll();
        if(!loaded)
        load();
        
        
    }  
    
    public void paint (int position)
    {
        GreenfootImage bg = this.getImage();
        //bg.mirrorHorizontally();
        bg.drawImage(bgBase, position, 0);
        bg.drawImage(bgImage, position + picWidth, 0);
         //GreenfootImage bgwall=wall();
        //bg.mirrorHorizontally();
        bg.drawImage(bgBase, position, 0);
        bg.drawImage(bgImage, position + picWidth, 0);
    }
    
    public void load(){
         //loaded=true;
        //w.setBackground(bgImageName);
        //wall = new Wall();
       
        

        //ScoreBoard scoreBoard = new ScoreBoard();
        
        
        
        
    }
   public void addChild(Component c) {
        components.add( c ) ;
    }
     
    public void remove(Component c) {
        components.remove(c) ;
    }
     
    public Component getChild(int i) {
        return components.get( i ) ;
    }
    
    public void display(){
        // add implementation below
        //System.out.println(components.size());
        if(loaded==false)
        {
         for (Component obj  : components)
         {
             obj.display();
         }
         loaded=true;
        }
        else
        {
            for(int i=0;i<=5;i++)
            {
                 System.out.println("Disply more clouds");
                components.get(i).display();
            }
        }
        
    }

}
