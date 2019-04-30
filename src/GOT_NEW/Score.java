import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Score here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Score extends Actor
{
    /**
     * Act - do whatever the Score wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    public Score()
    {
        
      
        GreenfootImage image = new GreenfootImage(20, 20);

        //image.setColor(new Color(165, 42, 42, 160));
        //image.fillRect(0, 0, WIDTH, HEIGHT);
        //image.setColor(new Color(255, 255, 255, 100));
        //image.fillRect(5, 5, WIDTH-10, HEIGHT-10);
        Font font = image.getFont();
        font = font.deriveFont(10);
        image.setFont(font);
        image.setColor(Color.WHITE);
        //image.drawString(title, 60, 100);
        //image.drawString(prefix + score, 60, 200);
        setImage(image);
    
    }
    public void act() 
    {
        // Add your action code here.
        
    }    
}
