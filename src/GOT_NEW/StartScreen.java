

    import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class StartScreen here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class StartScreen extends World
{
    private Sound music;
      
    private PlayButton buttonStart;
    private QuitButton buttonQuit;
    private StartCommand startCmd;
    private QuitCommand quitCmd;
    private String bgImageName;
    // GreenfootSound backgroundMusic;
    /**
     * Constructor for objects of class StartScreen.
     * 
     */
    public StartScreen()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1000, 600, 1);
        music = Sound.getInstance();
        GreenfootImage image = getBackground();
        image.scale(1000, 600);
        setBackground(image);
        Greenfoot.setWorld(this);
         buttonStart = new PlayButton();
        buttonQuit = new QuitButton();
        startCmd = new StartCommand();
        quitCmd = new QuitCommand();
        
        prepare();
    }

    public void act() {
        
    }
    
 
    
    public void stopBackgroundMusic()
    {
       music.pauseBackGround();
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {

           
        
     
        addObject(buttonStart,137,534);
        
        addObject(buttonQuit,794,540);
      
        
       
        buttonStart.setCommand(startCmd);
        buttonQuit.setCommand(quitCmd);

        startCmd.setReceiver(

            new IGameCmdRcvr()
            {
                public void performAction()
                {
                    if(Greenfoot.mouseClicked(buttonStart)){
                         Sound.getInstance().pauseBackGround();
                        Greenfoot.setWorld(new MyWorld());
                    }
                }
            });
            
            
           quitCmd.setReceiver(

            new IGameCmdRcvr()
            {
                public void performAction()
                {
                    if(Greenfoot.mouseClicked(buttonQuit)){
                       
                       System.exit(0);
                    }
                }
            });

 
       
    }
    
    public void stopped()
    {
        music.pauseBackGround();
    }
    public void started()
    {
        music.playBackGroundMusic(); 
    }
}


