import greenfoot.*; 
/**
 * Write a description of class Generator here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Generator
{
    // instance variables - replace the example below with your own
    private int x;
    private int RivalSpawnTimer;
    GifImage gifImage = new GifImage("RivalR.gif");
    //BattleField world = (BattleField)getWorld();

    /**
     * Constructor for objects of class Generator
     */
    public Generator()
    {
        RivalSpawnTimer = 0;
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
        //addObject(new_rivalX,476,260);
        //world.getPlayer().attach(new_rivalX);
    }
}
