import greenfoot.*;
/**
 * Write a description of class RivalAudioDecorator here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class RivalAttackAudioDecorator  extends AudioDecorator
{
    // instance variables - replace the example below with your own
    private int x;

    /**
     * Constructor for objects of class RivalAudioDecorator
     */
    public RivalAttackAudioDecorator(Actor actor)
    {
        super(actor);
    }

    @Override
    public void decorate() {
        //((RivalX)decoratedActor).setPlayerReaction(new GreenfootSound("dying2.mp3"));
        GreenfootSound attack_sound = new GreenfootSound("enemy_sward.mp3");
        attack_sound.setVolume(40);
        attack_sound.play();
    }
}
