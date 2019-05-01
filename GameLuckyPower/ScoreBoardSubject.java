import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.ArrayList;
import java.util.List;
/**
 * Write a description of class ScoreBoard here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ScoreBoardSubject extends Leaf 
{
    private String subjectState ;
    private int points = 0;
    private ArrayList<TreasureContext> observer = new ArrayList<>();
    private Player player; 
    private static String scoreValue;
    private MyWorld w;
    public static final float FONT_SIZE = 48.0f;
    public ScoreBoardSubject(MyWorld w){
        this.w=w;    
    }
    public String getState(){
        return subjectState;
    }
    public void setState(String subjectState){
        this.subjectState = subjectState;
        notifyObservers();
    }
    public void notifyObservers(){
        for (TreasureContext obj : observer)
        { 
            obj.update();
        }
    }
    public void attach(TreasureContext obj)
    {
        observer.add(obj);
    }
    public void detach(TreasureContext obj)
    {
        observer.remove(obj);
    }
    public void showState(){
       // System.out.println("The ScoreBoard Points are "+points);
    }
    public void update(Player player){
      if (player.getState().equalsIgnoreCase("gains lucky power")){
           points+=2;
        }
      else if(player.getState().equalsIgnoreCase("touch snake")){
            if(points > 0) {
            points-=2;
           }
        } 
       /* sb = new GreenfootImage(board);
        sb.drawImage(new GreenfootImage(label+points, 25, Color.ORANGE,new Color(0,0,0,0)),25,5);
        this.setImage(sb);
        
        w.addObject(this, 425, 100);*/
        incrementScore(points);
     }
    /**
     * Act - do whatever the ScoreBoard wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
       /*sb = new GreenfootImage(board);
        sb.drawImage(new GreenfootImage(label + points+1, 25, Color.ORANGE,new Color(0,0,0,0)),25,5);
        this.setImage(sb);*/
    }       
    public void incrementScore(int score) { 
       //score++;
       this.getImage().clear();
       this.setImage("Stark by Jie Feng.png");
       Font font = this.getImage().getFont();
        font = font.deriveFont(40.0f);
        this.getImage().setFont(font);
        this.getImage().setColor(Color.BLACK);    
       String scoreValue = Integer.toString(score);
       this.getImage().drawString(scoreValue,100 , 53);
   }
   public void display()
   {
       w.addObject(this,110,53);
    }
   public ScoreBoardSubject(int score, String mess, String desc)
    {
        makeImage (mess, desc);
    }
   private void makeImage(String title, String prefix)
   {
        GameOver gm=new GameOver("gameover.JPG");
        GreenfootImage image = gm.getImage();
        Font font = image.getFont();
        font = font.deriveFont(FONT_SIZE);
        image.setFont(font);
        image.setColor(Color.WHITE);
        image.drawString(title, 150, 250);
        //image.drawString(prefix + scoreValue, 150, 300);
        setImage(image);
    }
}