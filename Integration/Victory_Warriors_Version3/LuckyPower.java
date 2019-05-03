import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.*;
/**
 * Write a description of class LuckyPower here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class LuckyPower extends Actor

{ 
   public List<Player> player;
   public List<HealthBar> healthbar;
   protected int CompleteLevelTimer;
   private int RivalSpawnTimer;
   private int rivalCount = 0;
   Random rand = new Random();
   int num_of_rivals = 2;
   int max_num_of_rivals = 4;
   int max_num_of_charm = 3;
   int num_of_charm = 1;
   MyWorld world ;
   Coin coin;
   Coin coinprime;
   LuckyCharm luckyCharm;
   LuckyCharm charmprime;
   
   /**
     * Act - do whatever the LuckyPower wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
  public void act() 
    {
      // if(Greenfoot.isKeyDown("right"))
      // {
         // if(this.getX()+this.getImage().getWidth() < getWorld().getWidth())
                // this.setLocation(this.getX() - 2,this.getY());
      // }
      world = (MyWorld)getWorld();
      //wait(rand.nextInt(10) * 1000);
      int current_rivals = world.getObjects(Coin.class).size();
      //int current_charm = world.getObjects(LuckyCharm.class).size();
      if ( current_rivals < max_num_of_rivals) {
            runRivalSpawnTimer();
            num_of_rivals +=1;
        }   
    }  
  public void createRivals(int x,MyWorld w) {
       this.world =w;
        try{ 
            coinprime  =  w.coinPrime;
            Coin coin1 = coinprime.clone();
       }
        catch (CloneNotSupportedException ex) {
            System.out.println("Caught exception");
        }
    }
  private void runRivalSpawnTimer()
    {
        RivalSpawnTimer = (RivalSpawnTimer+1)%300; // adjust '300' as desired
        if (RivalSpawnTimer == 0) {
                spawnRival();
        }
    } 
  public void spawnRival()
    {
        
        /*MyWorld world = (MyWorld)getWorld();
        RivalX new_rivalX;
        new_rivalX = new RivalX();
        new_rivalX.setImage(gifImage.getCurrentImage());
        world.addObject(new_rivalX,790 + rand.nextInt(300),465);
        //this.getPlayer().attach(new_rivalX);*/
        try{
        Coin newCoin=world.coinPrime.clone();
        Coin newCoin1=world.coinPrime.clone();
        //new_rivalX.setImage(gifImage.getCurrentImage());
        world.addObject(newCoin,790,rand.nextInt(100)+220);
        world.addObject(newCoin1,690,225);
        }
        catch (CloneNotSupportedException ex) {
            System.out.println("Caught exception");
        }
    }
}
