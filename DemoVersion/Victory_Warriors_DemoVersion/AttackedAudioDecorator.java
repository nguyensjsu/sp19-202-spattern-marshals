import greenfoot.*;
/**
 * Write a description of class AttackedAudioDecorator here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class AttackedAudioDecorator extends AudioDecorator
{
    /**
     * Constructor for objects of class AttackedAudioDecorator
     */
    public AttackedAudioDecorator(Actor actor)
    {
        super(actor);
    }
    
    @Override
    public void decorate() {
        ((Player)decoratedActor).setPlayerReaction(new GreenfootSound("sword.mp3"));
    }
}
