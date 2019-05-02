import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class GameOver here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class GameOver extends Actor implements IGameOverObserver
{
    /**
     * Act - do whatever the GameOver wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
   
     public static final float FONT_SIZE = 48.0f;
    public GameOver()
    {
        
    }
    public void act() 
    {
       
      
}
  public void gameOverUpdate(MyWorld w)
  {
      
        
        GreenfootImage image = this.getImage();
        ScoreBoardSubject sc=w.getObjects(ScoreBoardSubject.class).get(0);
       
        Font font = image.getFont();
        font = font.deriveFont(FONT_SIZE);
        image.setFont(font);
        image.setColor(Color.WHITE);
        image.drawString("Game Over", 150, 300);
        image.drawString(" "+ sc.getScore(), 200, 400);
        setImage(image);
       
         w.addObject (this, w.getWidth()/2,w.getHeight()/2);
       
       Sound.getInstance().playGameOver();
       
       Greenfoot.stop();  
    }



}