import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class GameOver here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class GameOver extends Actor
{
    /**
     * Act - do whatever the GameOver wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private static final double scrollSpeed = 2;
    private static  int picHeight ;
    private GreenfootImage bgImage, bgBase;
    private int scrollPosition = 0;
    
    public GameOver(String image)
    {
        setImage(new GreenfootImage(image));
        bgImage = this.getImage();
         
        
        picHeight=bgImage.getHeight();
        bgBase = new GreenfootImage(this.getImage().getWidth(),picHeight);
         bgBase.drawImage(bgImage, 200, 0);
    }
    public void act() 
    {
        // Add your action code here.
         /*System.out.println("Scroll");
        scrollPosition -= scrollSpeed;
        while(scrollSpeed > 0 && scrollPosition < -picHeight) scrollPosition += picHeight;
       
   while(scrollSpeed < 0 && scrollPosition > 0) scrollPosition -= picHeight;
   paint(scrollPosition);*/
   
  // f
    
      
}

public void Scroll()
{
      int scrollAmt = 2; // cells to scroll per act cycle (adjust as needed)
GreenfootImage bg = new GreenfootImage(getImage());
getImage().drawImage(bg, 0, scrollAmt); // scroll image down
getImage().drawImage(bg, 0, scrollAmt-getImage().getHeight());
}

public void paint(int position)
{
      
         GreenfootImage bg = this.getImage();
        //bg.mirrorHorizontally();
        bg.drawImage(bgBase, 200, position);
        bg.drawImage(bgImage,200, position + picHeight);
     
}
}