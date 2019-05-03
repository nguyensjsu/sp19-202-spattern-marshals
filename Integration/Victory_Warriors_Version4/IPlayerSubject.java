/**
 * Write a description of class ISubject here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public interface IPlayerSubject  
{
    void attach(IObserver observer);
    void removeObserver(IObserver observer);
}
