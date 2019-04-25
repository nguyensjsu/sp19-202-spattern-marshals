import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class BattleField here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class BattleField extends World
{

    RivalR rivalR;
    Player player;
    RivalX rivalX;
    GifImage gifImage = new GifImage("RivalR.gif");
    private int RivalSpawnTimer;
   
    /**
     * Constructor for objects of class BattleField.
     * 
     */
    public BattleField()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(565, 390, 1, false); 
        prepare();
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {

        rivalR = new RivalR();
        rivalR.setImage(gifImage.getCurrentImage());
        addObject(rivalR,476,260);
        
        player = new Player();
        addObject(player,64,303);
        
        rivalX = new RivalX();
        
        rivalX.getImage().setTransparency(0);
        addObject(rivalX,4000, 3000);
        
        player.attach(rivalX);
        player.attach(rivalR);
        
        
        
        //player.startWalk(player.getX()+1, player.getY());
        
    }
    
    protected void removeStaticRival()
    {
        player.detach(rivalR);
        rivalR.getImage().setTransparency(0);
    }
    
    public void act() 
    {
        runZombieSpawnTimer();
    }
    
    private void runZombieSpawnTimer()
    {
        RivalSpawnTimer = (RivalSpawnTimer+1)%180; // adjust '300' as desired
        if (RivalSpawnTimer == 0) spawnRival();
    }
     
    public void spawnRival()
    {
        // add code spawning zombie here
        RivalX new_rivalX;
        new_rivalX = new RivalX();
        new_rivalX.setImage(gifImage.getCurrentImage());
        addObject(new_rivalX,476,260);
        this.player.attach(new_rivalX);
    }
    
    public void RivalWalk(int n){
        
        if(n%2 ==0){
            rivalR.getImage().setTransparency(100);
        }
        
    }
}
