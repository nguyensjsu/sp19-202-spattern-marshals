import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{
    private ScoreBoard sb;
    public LuckyPower coin1;
    public LuckyPower coin2;
    public NegativePower snake1;
    public NegativePower snake2;
    
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1000, 600, 1); 
        
        prepare();
    }

    public void updateScore()
    {
        sb.changeScore();
    }
    public void reduceScore()
    {
        sb.deleteScore();
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        sb = new ScoreBoard();
        addObject(sb,150,30);
        Warrior warrior = new Warrior();
        addObject(warrior,27,277);
        Enemy enemy = new Enemy();
        addObject(enemy,511,275);
        Enemy enemy2 = new Enemy();
        addObject(enemy2,386,155);
        Enemy enemy3 = new Enemy();
        addObject(enemy3,443,275);
        enemy.setLocation(387,339);
        enemy.setLocation(389,331);
        coin1 = new Coin();
        addObject(coin1,40,10);
        coin2 = new Coin();
        addObject(coin2,30,10);
        snake1 = new Snake();
        addObject(snake1,70,50);
        snake2 = new Snake();
        addObject(snake2,60,50);

        enemy2.setLocation(953,216);
        enemy3.setLocation(918,282);
        enemy.setLocation(971,349);
        warrior.setLocation(19,337);
        snake1.setLocation(399,529);
        snake2.setLocation(655,531);
        coin1.setLocation(131,137);
        coin2.setLocation(243,139);
        PlayerPic playerPic = new PlayerPic();
        addObject(playerPic,413,221);

        
        playerPic.setLocation(36,74);
    }
}
