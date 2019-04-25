import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Enemy extends Actor implements IObserver
{
    protected int RivalSpeed;
    protected int RivalHealth;
    BattleField world = (BattleField)getWorld();
    
    public void act() 
    {
        // Add your action code here.
    }    
    
    public void walkevent(int x,int y){
        
    }
    
     protected void setHealth(int health)
    {
        RivalHealth = health;
    }
    
     protected void setSpeed(int speed)
    {
        if(isTouching(Player.class))
        {
            RivalSpeed = 0;
        }
        else
        {
            RivalSpeed = speed;
        }
    }
    
    protected void RivalHit()
    {   
       if(isTouching(Player.class))
        {
            RivalHealth = 0;
            for (Object obj : getWorld().getObjects(RivalR.class))
            {
                RivalR rivalR = (RivalR) obj;
                if (rivalR.RivalHealth == 0) //x is your specific number and the y is the one which it is compared
                {
                    //getWorld().removeObject(rivalR);
                }
            }
        }
           
    }
    
    
}
