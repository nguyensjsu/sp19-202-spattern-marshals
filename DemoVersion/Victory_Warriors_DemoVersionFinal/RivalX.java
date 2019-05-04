import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class RivalX here.
 * 
 * @author Priya Yadav
 * @version (a version number or a date)
 */
public class RivalX extends RivalController implements IObserver,Cloneable
{
    GifImage gifStandImage  = new GifImage("RivalR.gif");
    GifImage gifWalkImage   = new GifImage("RivalX.gif");
    GifImage gifAttackImage = new GifImage("RivalX_attack.gif");
    

    int jumpHeight          = 0;
    MyWorld world           = (MyWorld)getWorld();
    
    private int RivalWaitTimer;
    private int RivalJumpTimer;
    
    boolean waitOver        = false;
    private boolean dead    = false;
    private boolean attack  = false;
    private boolean jumping = false;
    
    private int ySpeed;
    private int apexTimer;
    private Player player;
    // dying sound
    RivalAudioDecorator rivalAudioDecorator = new RivalAudioDecorator(this);
    // Attacking sound
    RivalAttackAudioDecorator rivalAttackAudioDecorator = new RivalAttackAudioDecorator(this);
    
    public void addedToWorld(World world) {
        player = getWorld().getObjects(Player.class).get(0);
        player.attach(this);
    }
    
    /**
     * Act - do whatever the RivalX wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        
        runRivalXWaitTimer();
        
        //runRivalXJumpTimer();
        
        if (getX() < 0) {
            getWorld().removeObject(this);
            return;
        } else if (waitOver == false) {
            // if waiting trimer then set the waiting image
            setImage(gifStandImage.getCurrentImage());
        } else {
            
           player = ((MyWorld) getWorld()).getObjects(Player.class).get(0);

            int Player_x = player.getX();
            int Player_y = player.getY();
            int x = getX();
            int y = getY();
            /*
            int groundLevel = -60 + getWorld().getHeight() - getImage().getHeight()/2;
            boolean onGround = (getY() == groundLevel);
            if (!onGround) // in middle of jump
            {
                if (ySpeed == 0 && apexTimer > 0) 
                    apexTimer = apexTimer - 50; // run apex timer
                if (ySpeed == 0 && apexTimer > 0) return; // apex timer still running
                ySpeed++; // adds gravity effect
                setLocation(getX(), getY()+ySpeed); // fall (rising slower or falling faster)
                if (getY()>=groundLevel) // has landed (reached ground level)
                {
                    setLocation(getX(), groundLevel); // set on ground
                    //Greenfoot.getKey(); // clears any key pressed during jump
               }
            }
            */
            if (isDead()){
                rivalAudioDecorator.decorate();
                getWorld().removeObject(this);
                return;
            }
            // If near to the the player then change to attacking state
            if ((Player_x + 60) >= x && (Player_x - 10) <= x) {
                if (attack == false) {
                    rivalAttackAudioDecorator.decorate();
                    attack = true;
                }
                
                //Set Attacking image
                setImage(gifAttackImage.getCurrentImage());
            } else {
                
                //Set Walking image
                setImage(gifWalkImage.getCurrentImage());
            }
            setLocation(getX()-2, getY()+ySpeed); 

        }
    }  
    
    
    private void runRivalXWaitTimer()
    {
        if (waitOver == false) {
            RivalWaitTimer = (RivalWaitTimer+1)%10; // adjust '300' as desired
            if (RivalWaitTimer == 0) waitOver = true;
        }
    }
    
    /*
    private void runRivalXJumpTimer()
    {
        
        if (waitOver == true && jumping == false) {
               ySpeed = -4; // add jump speed
                setLocation(getX(), getY()+ySpeed); // leave ground
                apexTimer = 100;  // set apex timer (adjust value to suit)
        }
    }
    */
    
    public boolean isDead() {
        return this.dead;
    }
    
    public void playerUpdate(String type, RivalX rival) {
        if (type.equals("did_hit") && this == rival) {
            //this.setImage(new GreenfootImage ("ahhhh.png"));
            dead=true;
        }
    }
    
    @Override 
    public RivalX clone() throws CloneNotSupportedException {
          return (RivalX) super.clone();
    }
    
    
}
