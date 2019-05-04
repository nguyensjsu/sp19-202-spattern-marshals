import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class LevelComplete here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class LevelComplete extends Leaf implements IObserver
{
    //private int CompleteLevelTimer;
     public static final float FONT_SIZE = 48.0f;
     Player player;
     GreenfootImage image;
     private MyWorld w;
     public void addedToWorld(World world) {
        player = getWorld().getObjects(Player.class).get(0);
        player.attach(this);
        this.getImage().clear();
        image = new GreenfootImage("level_complete_2.png");
    }
    
    public LevelComplete(MyWorld w)
    {
        this.w = w;
        //setImage(new GreenfootImage(imageFilename));
    }
      /**
     * Act - do whatever the LevelComplete wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
      
    }   
    
    public void playerUpdate(String type, RivalX rival)
  {
      
        if (type.equals("level_complete")) {
            //GreenfootImage image = this.getImage();
            ScoreBoardSubject sc=w.getObjects(ScoreBoardSubject.class).get(0);
            image.scale(563,563);
            Font font = image.getFont();
            font = font.deriveFont(FONT_SIZE);
            image.setFont(font);
            image.setColor(Color.YELLOW);
           
            image.drawString("Summer ", 200, 200);
            image.drawString("is  Here ", 200, 250);
            setImage(image);
           
            //w.addObject (this, w.getWidth()/2,w.getHeight()/2);
           
           Sound.getInstance().playWinGame();
           clearScreen();
           //Greenfoot.stop();  
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
