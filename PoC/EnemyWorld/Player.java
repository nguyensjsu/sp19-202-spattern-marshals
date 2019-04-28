import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.ArrayList;
import java.util.Iterator; 

public class Player extends Actor implements ISubject
{
    GifImage gifImage = new GifImage("Rival.gif");
    private ArrayList<IObserver> observers = new ArrayList<>() ;
    BattleField world = (BattleField)getWorld();
    
    int x,y;
    int cnt = 100;
    public Player()
    {   
    int scalePercent = 120;
    
    for (GreenfootImage image : gifImage.getImages())
    {
        int wide = image.getWidth()*scalePercent/100;
        int high = image.getHeight()*scalePercent/100;
        image.scale(wide, high);
    
    }
    
    
    }
    
    /**
     * Act - do whatever the Rival wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        setImage(gifImage.getCurrentImage());
        
        if(cnt == 0) {
            startWalk(this.getX()+1,this.getY());
        } else {
            cnt--;
        }
        
    }
    
    
    public void attach(IObserver obj) {
        observers.add(obj) ;
    }

    public void detach(IObserver obj) {
        observers.remove(obj) ;
    }

    public void notifyObservers(int x, int y) {
        
        Iterator<IObserver> itr = observers.iterator();
        try {
            for(int i=0; i<observers.size(); i++)
            {
                IObserver obj;
                obj = observers.get(i);
                obj.walkevent(x,y);
            }
        } catch (java.util.ConcurrentModificationException exception) {
            // Catch ConcurrentModificationExceptions.
            
        } catch (Throwable throwable) {
            // Catch any other Throwables.
            
        }
    }
    
    public void startWalk(int x, int y) {
    
        if (this.getX()==250) {
           
        }
        else{
            setLocation(x, y);
            
        }
        notifyObservers(x,y);
    }
    
    
}
