import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Coin here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Coin extends LuckyPower implements Cloneable
{
    /**
     * Act - do whatever the Coin wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private int RivalWaitTimer;
    private int RivalJumpTimer;
    
    boolean waitOver        = false;
    private boolean dead    = false;
    private boolean attack  = false;
    private boolean jumping = false;
    
   private int ySpeed;
   public Coin(){
          this.getImage().scale(50,50);
    }
   public void act() 
    {   
    runRivalXWaitTimer();              
    if (getX() < 0) {
            getWorld().removeObject(this);
            return;
        } 
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
   }
   @Override 
    public Coin clone() throws CloneNotSupportedException {
          return (Coin) super.clone();
    }
   private void runRivalXWaitTimer()
    {
        if (waitOver == false) {
            RivalWaitTimer = (RivalWaitTimer+1)%10; // adjust '300' as desired
            if (RivalWaitTimer == 0) waitOver = true;
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