import greenfoot.*; 
/**
 * Write a description of class Sound here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Sound  
{
    // instance variables - replace the example below with your own
    private GreenfootSound gameOverSound;
    private GreenfootSound explosionSound;
    private GreenfootSound powerUpSound;
    private GreenfootSound backgroundMusic;
    private GreenfootSound treasureHunt;
    private GreenfootSound gamemusic;
    private static Sound single_instance = null; 
    public static Sound getInstance() 
    { 
        if (single_instance == null) 
            single_instance = new Sound(); 
  
        return single_instance; 
    } 
    /**
     * Constructor for objects of class Sound
     */
    private Sound()
    {
        try {
            //gameOverSound = new GreenfootSound("GameOver.wav");
            //explosionSound = new GreenfootSound("explosion.wav");
           // treasureHunt=new GreenfootSound("Treasure.wav");Video_Game_Soldiers.mp3
            gamemusic = new GreenfootSound("Level1.mp3");
            backgroundMusic = new GreenfootSound("background.mp3");
            
        } catch(Exception e){}
    }


    public void playGameOver() {
        try {
            gameOverSound.play();
        } catch(Exception e){}
    }

    public void playBackGroundMusic() {
        try {
             backgroundMusic.playLoop();      
        } catch(Exception e){}
    }

    public void playPowerUp() {
        try {
            powerUpSound.play();
        } catch(Exception e){}
    }
    public void treasureMusic()
    {
        try {
            treasureHunt.play();
        } catch(Exception e){}
    }
   public void playgamemusic() {
        try {
           gamemusic.playLoop();
        } catch(Exception e){}
    }
    public void pausegamemusic() {
        try {
           gamemusic.stop();
        } catch(Exception e){}
    }

    public void playExplosion() {
        try {
            explosionSound.play();
        } catch(Exception e){}
    }

    public void pauseBackGround() {
        try {
            backgroundMusic.pause();
        } catch(Exception e){}
    }
}
