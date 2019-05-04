import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class GameOver here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class GameOver extends Leaf implements IObserver
{
    /**
     * Act - do whatever the GameOver wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
     Player player;
     GreenfootImage image;
     public static final float FONT_SIZE = 48.0f;
     private MyWorld w;
    public GameOver(MyWorld w)
    {
        this.w = w;
    }
    
    public void addedToWorld(World world) {
        player = getWorld().getObjects(Player.class).get(0);
        player.attach(this);
        this.getImage().clear();
        image = new GreenfootImage("gameover.JPG");
    }
    public void act() 
    {
       
      
}
  public void playerUpdate(String type, RivalX rival)
  {
        if (type.equals("dead")) {
            //GreenfootImage image = this.getImage();
            ScoreBoardSubject sc=w.getObjects(ScoreBoardSubject.class).get(0);
           
            Font font = image.getFont();
            font = font.deriveFont(FONT_SIZE);
            image.setFont(font);
            image.setColor(Color.WHITE);
            image.drawString("Game Over", 150, 300);
            image.drawString(" "+ sc.getScore(), 200, 400);
            setImage(image);
            clearScreen();
             //w.addObject (this, w.getWidth()/2,w.getHeight()/2);
           
           Sound.getInstance().playGameOver();
           
           Greenfoot.stop();  
        }
    }
    
    private void clearScreen() {
        for (RivalX r : getWorld().getObjects(RivalX.class))
            getWorld().removeObject(r);
        for (LuckyCharm l : getWorld().getObjects(LuckyCharm.class))
            getWorld().removeObject(l);
        for (Coin c : getWorld().getObjects(Coin.class))
            getWorld().removeObject(c);
    }
    
    public void display()
    {
        w.addObject(this,w.getWidth()/2,w.getHeight()/2);
    }



}