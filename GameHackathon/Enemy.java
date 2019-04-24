import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Enemy extends Actor implements IObserver
{
    protected int RivalSpeed;
    protected int RivalHealth;
    public void act() 
    {
        // Add your action code here.
    }    
    
    public void walkevent(int x,int y){
        
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
    
    
}
