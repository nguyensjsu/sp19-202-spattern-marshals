import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class ScoreBoard here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ScoreBoard extends Composite
{
    private MyWorld w;
     public static final float FONT_SIZE = 48.0f;
    public static final int WIDTH = 500;
    public static final int HEIGHT = 300;
     
    private int score = 0; 
   private int scoreCount = 0;
   private String scoreValue = "";
    public ScoreBoard(MyWorld w)
    {
        this.w=w;
    }
    
     public ScoreBoard(int score, String mess, String desc)
    {
        makeImage (mess, desc, score);
    }
    

    /**
     * Make the score board image.
     */
    private void makeImage(String title, String prefix, int score)
    {
        GameOver gm=new GameOver("gameover.JPG");
        //MyWorld w = (MyWorld) getWorld();
        //System.out.println(w);
        //System.out.println(gm);
        //w.addObject(gm, 450, 300);
        GreenfootImage image = gm.getImage();

       /* image.setColor(new Color(165, 42, 42, 160));
        image.fillRect(0, 0, WIDTH, HEIGHT);
        image.setColor(new Color(0, 0,255, 100));
        image.fillRect(5, 5, WIDTH-10, HEIGHT-10);*/
        Font font = image.getFont();
        font = font.deriveFont(FONT_SIZE);
        image.setFont(font);
        image.setColor(Color.WHITE);
        image.drawString(title, 200, 300);
        image.drawString(prefix + score, 200, 400);
        setImage(image);
 
    }
   
   public void act() {
        this.setLocation(118,53);
       scoreCount++;
       if (scoreCount % 20 == 0) {
           incrementScore();
       }
   }
 
   private void incrementScore() { 
       score++;
       this.getImage().clear();
       this.setImage("Stark by Jie Feng.png");
       Font font = this.getImage().getFont();
        font = font.deriveFont(40.0f);
        this.getImage().setFont(font);
        this.getImage().setColor(Color.BLACK);    
       scoreValue = Integer.toString(score);
       this.getImage().drawString(scoreValue,100 , 53);
   }
    public void display()
    {
        w.addObject(this,110,53);
    }
}
