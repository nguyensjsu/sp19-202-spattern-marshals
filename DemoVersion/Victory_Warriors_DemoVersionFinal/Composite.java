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
    private static final String bgImageName = "castle.png"; 
    private static final double scrollSpeed = 1;
     
    
    private GreenfootImage bgImage, bgBase;
    private int scrollPosition = 0;
    private World w;
    private int picWidth;
    private boolean loaded=false;
    
    
    public Composite(MyWorld w,String bgImageName)
    {
        this.w=w;
       this. setImage(bgImageName);
        
       
       
    
    }
    
    public  Composite()
    {
    }
    
    public void act() 
    {
       
        
        
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
