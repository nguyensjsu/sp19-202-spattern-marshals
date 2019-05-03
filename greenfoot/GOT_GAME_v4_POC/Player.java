import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.List;
import java.util.ArrayList;
/**
 * Write a description of class Hero here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Player extends Actor implements IPlayerSubject, IPowerObserver
{
    GifImage gifw = new GifImage("walk.gif");
    GifImage gifa = new GifImage("attack.gif");
    GreenfootImage gifi = new GreenfootImage("Idle.png");
    GreenfootSound playerReaction;
    GreenfootSound walkSound = new GreenfootSound("footsteps2.wav");
    GreenfootSound jumpSound = new GreenfootSound("jump.wav");
    AttackAudioDecorator attackAudioDecorator = new AttackAudioDecorator(this);
    AttackedAudioDecorator attackedAudioDecorator = new AttackedAudioDecorator(this);
    HealthBar healthBar;
    private List<IObserver> observers = new ArrayList<IObserver>();
    private int ySpeed;
    private int apexTimer;
    private int progressTimer = 0;
    private IPlayerState currentState;
    private IPlayerState deadState;
    private IPlayerState normalState;
    private IPlayerState superState;
    private int plWidth = 150;
    private int plHeight = 200;
    private boolean gameEnd = false;
    public Player() {
        walkSound.setVolume(40);
        jumpSound.setVolume(40);
        normalState = new PlayerNormalState(this);
        deadState = new PlayerDeadState(this);
        superState = new PlayerSuperState(this);
        currentState = superState;
    }
    /**
     * Act - do whatever the Hero wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        //addObservers();
        gifi.scale(plWidth,plHeight);
        setImage(gifi);
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
                Greenfoot.getKey(); // clears any key pressed during jump
           }
        }
        else // on ground
        {
            if ("up".equals(Greenfoot.getKey())) // jump key detected
            {
                jumpSound.play();
                ySpeed = -25; // add jump speed
                setLocation(getX(), getY()+ySpeed); // leave ground
                apexTimer = 100;  // set apex timer (adjust value to suit)
            }
            RivalX r = getRivalWithinBound(10);
            if (r != null) { 
                notifyObservers("got_hit", r);
                attackedAudioDecorator.decorate();
                playerReaction.play();
            }
        }
        
        if (Greenfoot.isKeyDown("left")) {
            gifi.scale(plWidth,plHeight);
            setImage(gifi);
            MyWorld world = (MyWorld) getWorld();
            RivalX r = getRivalWithinBound(10);
            if (r != null) { 
                notifyObservers("got_hit", r);
                attackedAudioDecorator.decorate();
                playerReaction.play();
            }
        }
        else if (Greenfoot.isKeyDown("right")) {
            progressTimer++;
            gifw.resizeImages(3 * plWidth,2 * plHeight);
            setImage(gifw.getCurrentImage());
            setLocation(getX(), getY() - 50);
            MyWorld world = (MyWorld) getWorld();
            world.scroll();
            walkSound.play();
            GameProgress gameProgress = getWorld().getObjects(GameProgress.class).get(0);
            GreenfootImage progressImage = gameProgress.getImage();
            int width = progressImage.getWidth();
            if (progressTimer % 100 == 0 && !gameEnd) {
                progressImage.scale(width + 50, progressImage.getHeight());
                gameProgress.setLocation(gameProgress.getX() + 25, gameProgress.getY());
                if (progressTimer == 800) {
                    gameEnd = true;
                    //notify for treasure
                }
            }
            RivalX r = getRivalWithinBound(10);
            if (r != null) { 
                notifyObservers("got_hit", r);
                attackedAudioDecorator.decorate();
                playerReaction.play();
            }
        }
        else if (Greenfoot.isKeyDown("x")) {
            gifa.resizeImages(3 * plWidth,2 * plHeight);
            setImage(gifa.getCurrentImage());
            setLocation(getX(), getY());
            attackAudioDecorator.decorate();
            playerReaction.play();
            RivalX r = getRivalWithinBound(20);
            if (r != null) {
                notifyObservers("did_hit", r);
            }
        }
        else {
            walkSound.stop();
            if (playerReaction != null && playerReaction.isPlaying())
                playerReaction.stop();
        }
    }
    
    private RivalX getRivalWithinBound(int n) {
        List<RivalX> rivals= getWorld().getObjects(RivalX.class);
        for (RivalX r : rivals) {
            int dist = getX() - r.getX();
            if (Math.abs(dist) < n) {
                return r;
            }
        }
        return null;
    }
    
    private void addObservers() {
        healthBar = getWorld().getObjects(HealthBar.class).get(0);
        if (!observers.contains(healthBar))
            observers.add(healthBar);
        List<RivalX> rivals = getWorld().getObjects(RivalX.class);
        for (RivalX r : rivals) {
            if (!observers.contains(r)) {
                observers.add(r);
            }
        }
    }
    
    private void notifyObservers(String type, RivalX r) {
        for(IObserver observer : observers) {
            observer.playerUpdate(type, r);
        }
    }
    
    public void setPlayerReaction(GreenfootSound sound) {
        if (playerReaction != null) {
            String pr = playerReaction.toString();
            String file = pr.substring(pr.indexOf(":"), pr.indexOf(".mp3"));
            String snd = sound.toString();
            String sndFile = snd.substring(snd.indexOf(":"), snd.indexOf(".mp3"));
            if (!sndFile.equals(file)) {
                playerReaction = sound;
                playerReaction.setVolume(40);
            }
        }
        else {
            playerReaction = sound;
            playerReaction.setVolume(40);
        }
    }
    
    public void attach(IObserver observer) {
        observers.add(observer);
    }
    
    public void removeObserver(IObserver observer) {
    
    }
    
    public void notifyOnTouch(String touched) {
        if (touched.equals("lucky")) {
            notifyObservers("lucky", null);
        }
    }
    
    public IPlayerState getState() {
        return this.currentState;
    }
    
    public void setState(IPlayerState state) {
        this.currentState = state;
        updatePlayerSize();
    }
    
    private void updatePlayerSize() {
        if (this.currentState instanceof PlayerSuperState) {
            plWidth = 150;
            plHeight = 200;
        } else if (this.currentState instanceof PlayerNormalState) {
            plWidth = 100;
            plHeight = 135;
        }else if (this.currentState instanceof PlayerDeadState) {
            //Game End Screen - TODO
        }
    }
    
    
    public IPlayerState getDeadState() { return deadState; }
    public IPlayerState getNormalState() { return normalState; }
    public IPlayerState getSuperState() { return superState; }
}