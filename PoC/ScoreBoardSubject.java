import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.ArrayList;
import java.util.List;
/**
 * Write a description of class ScoreBoard here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ScoreBoardSubject extends Actor
{
    private String subjectState ;
    private int points = 0;
    private ArrayList<TreasureContext> observer = new ArrayList<>();
    private List<Hero> hero; 
    private GreenfootImage board;
    private GreenfootImage sb;
    private String label = "Score:  ";
    
    public ScoreBoardSubject(){
        int boardWidth = 150;
        int boardHeight = 30;
        int boardTransparency = 125;
        
        //Draw background
        board = new GreenfootImage(boardWidth,boardHeight);
        board.setColor(Color.BLACK);
        board.setTransparency(boardTransparency);
        board.fillRect(0,0,boardWidth,boardHeight);
        this.setImage(board);
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
        System.out.println("The ScoreBoard Points are "+points);
    }
    public void update(){
        hero = ((TreasureContext) getWorld()).getObjects(Hero.class);
        if (hero.get(0).getState().equalsIgnoreCase("gains lucky power")){
           points+=2;
           System.out.println("Adding 2 points "+points);
        }
        else if(hero.get(0).getState().equalsIgnoreCase("touch snake")){
            if(points > 0) {
            points-=2;
            System.out.println("Reduce 2 points "+points);
           }
        }
        sb = new GreenfootImage(board);
        sb.drawImage(new GreenfootImage(label + points, 25, Color.ORANGE,new Color(0,0,0,0)),25,5);
        this.setImage(sb);
     }
    /**
     * Act - do whatever the ScoreBoard wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
       
    }    
}