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
        
        //rivalX = new RivalX();
        
        //rivalX.getImage().setTransparency(0);
        //addObject(rivalX,4000, 3000);
        
        player.attach(rivalR);
        //player.attach(rivalX);
        
        
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
     
    private void spawnRival()
    {
        // add code spawning zombie here
        RivalR new_rivalR;
        new_rivalR = new RivalR();
        new_rivalR.setImage(gifImage.getCurrentImage());
        addObject(new_rivalR,476,260);
        this.player.attach(new_rivalR);
    }
}
