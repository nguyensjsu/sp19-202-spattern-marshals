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
    int health = 9;
    public HealthBar() {
        image = new GreenfootImage("HighlightRow90.png");
        image.scale(450, 140);
        setImage(image);
    }
    public void act() 
    {
        if (lastHurt > 0)
            lastHurt--;
    }
    
    public void playerUpdate(String type, RivalX rival) {
        if (type.equals("got_hit") && lastHurt == 0) {
            //image.scale(image.getWidth() - 50, image.getHeight());
            health--;
            updateHealthBar(health);
            blink();
            lastHurt = 100;
        }
    }
    
    private void updateHealthBar(int health) {
        switch(health) {
            case 8:
                image = new GreenfootImage("HighlightRow80.png");
                image.scale(450, 140);
                setImage(image);
                break;
            case 7:
                image = new GreenfootImage("HighlightRow70.png");
                image.scale(450, 140);
                setImage(image);
                break;
            case 6:
                image = new GreenfootImage("HighlightRow60.png");
                image.scale(450, 140);
                setImage(image);
                break;
            case 5:
                image = new GreenfootImage("HighlightRow50.png");
                image.scale(450, 140);
                setImage(image);
                break;
            case 4:
                image = new GreenfootImage("HighlightRow40.png");
                image.scale(450, 140);
                setImage(image);
                break;
            case 3:
                image = new GreenfootImage("HighlightRow30.png");
                image.scale(450, 140);
                setImage(image);
                break;
            case 2:
                image = new GreenfootImage("HighlightRow20.png");
                image.scale(450, 140);
                setImage(image);
                break;
            case 1:
                image = new GreenfootImage("HighlightRow10.png");
                image.scale(450, 140);
                setImage(image);
                break;
            case 0:
                image = new GreenfootImage("HighlightRow0.png");
                image.scale(450, 140);
                setImage(image);
                break;
            default:
                break;
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
