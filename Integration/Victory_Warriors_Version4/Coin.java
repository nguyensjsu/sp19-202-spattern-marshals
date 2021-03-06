import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Coin here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Coin extends LuckyPower
{
    /**
     * Act - do whatever the Coin wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {   
        CompleteLevelTimer = (CompleteLevelTimer+1)%600; 
        if(Greenfoot.isKeyDown("right"))
           {
             if(this.getX()+this.getImage().getWidth() < getWorld().getWidth())
                    this.setLocation(this.getX() - 2,this.getY());
            }
        if ((isPlayerTouchingCoin()) )
             {
             player = ((MyWorld) getWorld()).getObjects(Player.class);
             player.get(0).setState("gains lucky power");
             ((MyWorld) getWorld()).removeObject(this);
            }
        if (CompleteLevelTimer == 0 ){
          // ((MyWorld) getWorld()).removeObject(this);
        }
    }
    
    private boolean isPlayerTouchingCoin() {
        Player player = ((MyWorld) getWorld()).getObjects(Player.class).get(0);
            int distX = getX() - player.getX();
            int distY = getY() - player.getY();
            if (Math.abs(distX) < 40 && Math.abs(distY) < 40) {
                return true;
            }
        
        return false;
    }
}
