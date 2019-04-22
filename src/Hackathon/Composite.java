import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.*;
/**
 * Write a description of class Composite here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Composite extends Actor implements IDisplayComponent
{
    protected ArrayList<IDisplayComponent> components = new ArrayList<IDisplayComponent>()  ;
    
    /**
     * Act - do whatever the composite wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        display();
    }    
    
    public Composite ()
    {
       
    }
    
    public Composite ( String d )
    {
       
        
    }
    

    public void addSubComponent(IDisplayComponent c) {
        components.add( c ) ;
    }
     
    public void removeComponent(IDisplayComponent c) {
        components.remove(c) ;
    }
     
    public IDisplayComponent  getChild(int i) {
        return components.get( i ) ;
    }
    
    public void display(){
        // add implementation below
        System.out.println("Checking");
         for (IDisplayComponent obj  : components)
         {
             System.out.println("Checking");
             obj.display();
         }
        }
    }

