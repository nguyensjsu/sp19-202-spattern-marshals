import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class HealthBar here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class HealthBar extends Actor implements IObserver
{
    /**
     * Act - do whatever the HealthBar wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    GreenfootImage image;
    int lastHurt = 0;
    public HealthBar() {
        image = new GreenfootImage("health.png");
        image.scale(300, 120);
        setImage(image);
    }
    public void act() 
    {
        if (lastHurt > 0)
            lastHurt--;
    }
    
    public void playerUpdate(String type) {
        if (type.equals("got_hit") && lastHurt == 0 && image.getWidth() > 50) {
            image.scale(image.getWidth() - 50, image.getHeight());
            blink();
            lastHurt = 100;
        }
    }
    
    private void blink() {
        Thread thread = new Thread(){
        public void run(){
          
            int t = getWorld().getObjects(Player.class).get(0).getImage().getTransparency();
           for (int cnt=0;cnt<4;cnt++) {
               GreenfootImage i = getWorld().getObjects(Player.class).get(0).getImage();;
               t = i.getTransparency();
               i.setTransparency(0);
               Greenfoot.delay(10);
               i.setTransparency(t);
               Greenfoot.delay(10);
            }
            getWorld().getObjects(Player.class).get(0).getImage().setTransparency(t);
        }
      };
      thread.start();
    }
}
