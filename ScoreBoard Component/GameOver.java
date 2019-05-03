import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)


public class GameOver extends Actor implements IGameOverObserver
{
    
    public GameOver() 
    {
        //setImage(new GreenfootImage("Game Over", 48, Color.WHITE, Color.BLACK));
    }    
   
    public void act() 
    {
       
      
}
  public void gameOverUpdate(MyWorld w)
  {
      
        System.out.println("Observer added");
        GreenfootImage image = this.getImage();

       
        Font font = image.getFont();
        font = font.deriveFont(FONT_SIZE);
        image.setFont(font);
        image.setColor(Color.WHITE);
        image.drawString("Game Over", 150, 300);
        //image.drawString(prefix + scoreValue, 150, 300);
        setImage(image);
       
         w.addObject (this, w.getWidth()/2,w.getHeight()/2);
       // music.playGameOver();
       Sound.getInstance().playGameOver();
        // End program
        Greenfoot.stop();  
    }


}
