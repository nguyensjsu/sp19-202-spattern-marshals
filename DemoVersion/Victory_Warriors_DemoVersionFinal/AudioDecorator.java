import greenfoot.*;
/**
 * Write a description of class AudioDecorator here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public abstract class AudioDecorator implements Decorator
{
    protected Actor decoratedActor;
    
    public AudioDecorator(Actor actor) {
        this.decoratedActor = actor;
    }
}
