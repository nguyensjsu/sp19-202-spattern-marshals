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
    private GreenfootSound backgroundMusic;
    private GreenfootSound gamemusic,winGameMusic;
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
            gameOverSound = new GreenfootSound("game-of-thrones-goodbye-brother.mp3");           
            gamemusic = new GreenfootSound("Level1.mp3");
            backgroundMusic = new GreenfootSound("background.mp3");
            winGameMusic=new GreenfootSound("TheKingInTheNorthRingtone.mp3");
            
        } catch(Exception e){}
    }
     
    public void playWinGame()
    {
        try {
            gameOverSound.play();
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

    
    public void pauseBackGround() {
        try {
            backgroundMusic.pause();
        } catch(Exception e){}
    }
     public void pauseGameOver() {
        try {
            gameOverSound.stop();
        } catch(Exception e){}
    }
}
