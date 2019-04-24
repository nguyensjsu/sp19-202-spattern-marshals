import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.ArrayList;

/**
 * Write a description of class ScoreBoard here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ScoreBoardSubject extends Actor
{
    private String subjectState ;
    private ArrayList<GameWorld> observer = new ArrayList<>();
    public String getState(){
        return subjectState;
    }
    public void setState(String subjectState){
        this.subjectState = subjectState;
        notifyObservers();
    }
    public void notifyObservers(){
        for (GameWorld obj : observer)
        { 
            obj.update();
        }
    }
    public void attach(GameWorld obj)
    {
        observer.add(obj);
    }
    public void detach(GameWorld obj)
    {
        observer.remove(obj);
    }
    public void showState(){
        System.out.println("The ScoreBoard Points are "+subjectState);
    }
    /**
     * Act - do whatever the ScoreBoard wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
    }    
}
