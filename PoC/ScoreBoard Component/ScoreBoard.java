
import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
//import java.awt.*;

public class ScoreBoard extends Actor
{
    private int score = 0;
    private GreenfootImage board;
    private GreenfootImage sb;
    private String label = "Score:  ";
    public ScoreBoard()
    {
        //GreenfootImage img = new GreenfootImage(100,30);
        //img.drawString("Score: " + score, 10, 25);
        //setImage(img);
        super();
        int boardWidth = 150;
        int boardHeight = 30;
        int boardTransparency = 125;
        
        //Draw background
        board = new GreenfootImage(boardWidth,boardHeight);
        board.setColor(Color.BLACK);
        board.setTransparency(boardTransparency);
        board.fillRect(0,0,boardWidth,boardHeight);
        this.setImage(board);
        
        //Draw scoreboard
        update();
        
    }
    public void update()
    {
      sb = new GreenfootImage(board);
      sb.drawImage(new GreenfootImage(label + score, 25, Color.ORANGE,new Color(0,0,0,0)),25,5);
      this.setImage(sb);  
    }
    public void changeScore()
    {
        score = score + 2;
        //GreenfootImage img = getImage();
        //img.clear();
        //img.drawString("Score: " + score, 10, 25);
        update();
        
    } 
    public void deleteScore()
    {
        score = score - 2;
        //GreenfootImage img = getImage();
        //img.clear();
        //img.drawString("Score: " + score, 10, 25);
        update();
        
    }
}
