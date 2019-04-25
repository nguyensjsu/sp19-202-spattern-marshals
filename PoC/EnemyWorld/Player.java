import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.ArrayList;

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
        //if (isAtEdge() ) 
        /*if (this.getY()==400) {
           
           this.setImage(new GreenfootImage ("ahhhh.png"));
           //getWorld().removeObject(this);
           
        }
        else {
            setLocation(getX(), getY()+1);
        }  */  
    }
    
    public void attach(IObserver obj) {
        observers.add(obj) ;
    }

    public void detach(IObserver obj) {
        observers.remove(obj) ;
    }

    public void notifyObservers(int x, int y) {
        for (IObserver obj  : observers)
        {
            obj.walkevent(x,y);
        }
    }
    
    public void startWalk(int x, int y) {
    
        if (this.getX()==250) {
           
           //this.setImage(new GreenfootImage ("ahhhh.png"));
           //getWorld().removeObject(this);
           
        }
        else{
            setLocation(x, y);
            
        }
        notifyObservers(x,y);
    }
    
    
}
