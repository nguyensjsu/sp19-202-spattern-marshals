import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.ArrayList;
import java.util.List;
/**
 * Write a description of class ScoreBoard here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ScoreBoardSubject extends Leaf implements IObserver
{
    private String subjectState ;
    private int points = 0;
    private ArrayList<TreasureContext> observer = new ArrayList<>();
    private Player player; 
    private  String scoreValue;
    private MyWorld w;
     public static final float FONT_SIZE = 28.0f;
 
    public void addedToWorld(World world) {
        player = getWorld().getObjects(Player.class).get(0);
        player.attach(this);
    }
    
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
         else if(player.getState().equalsIgnoreCase("Hit enemy")){
             
           points+=2;
        }
    }
       /* sb = new GreenfootImage(board);
        sb.drawImage(new GreenfootImage(label+points, 25, Color.ORANGE,new Color(0,0,0,0)),25,5);
        this.setImage(sb);
        
        w.addObject(this, 425, 100);*/
        incrementScore(points);
     }
     
     public void playerUpdate(String type, RivalX r) {
        if (type.equals("did_hit")) {
            points = points + 2;
            incrementScore(points);
        }
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
        GreenfootImage image = getImage();
        Font font = image.getFont();
            font = font.deriveFont(FONT_SIZE);
            image.setFont(font);
            image.setColor(Color.BLACK);
            image.drawString(Integer.toString(points), 25, 5);
            setImage(image);
    }   
    
    public void incrementScore(int score) { 
       //score++;
       this.getImage().clear();
       this.setImage("Stark by Jie Feng.png");
       Font font = this.getImage().getFont();
        font = font.deriveFont(25.0f);
        this.getImage().setFont(font);
        this.getImage().setColor(Color.BLACK);    
        scoreValue = score != 0 ? Integer.toString(score) : "0";
       this.getImage().drawString(scoreValue,100 , 53);
   }
   public void display()
   {
       w.addObject(this,110,53);
    }
     
     public String getScore()
     {
        return scoreValue != null ? scoreValue : "0";
     }
   
}