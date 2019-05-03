import greenfoot.*;
/**
 * Write a description of class RivalAudioDecorator here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class RivalAudioDecorator  extends AudioDecorator
{
    // instance variables - replace the example below with your own
    private int x;

    /**
     * Constructor for objects of class RivalAudioDecorator
     */
    public RivalAudioDecorator(Actor actor)
    {
        super(actor);
    }

    @Override
    public void decorate() {
        //((RivalX)decoratedActor).setPlayerReaction(new GreenfootSound("dying2.mp3"));
        GreenfootSound dying_sound = new GreenfootSound("dying2.mp3");
        dying_sound.setVolume(40);
        dying_sound.play();
    }
}
