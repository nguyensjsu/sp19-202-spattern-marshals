import greenfoot.*;
/**
 * Write a description of class AttackAudioDecorator here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class AttackAudioDecorator extends AudioDecorator 
{

    /**
     * Constructor for objects of class AttackAudioDecorator
     */
    public AttackAudioDecorator(Actor actor)
    {
        super(actor);
    }

    @Override
    public void decorate() {
        ((Player)decoratedActor).setPlayerReaction(new GreenfootSound("Sword1.mp3"));
    }
    
}
