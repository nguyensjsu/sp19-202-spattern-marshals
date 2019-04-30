/**
 * Write a description of class IScoreSubject here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public interface IScoreSubject  
{
    /**
     * Register a AddCard Observer
     * @param obj Observer Object
     */
    void registerObserver(IScoreObserver obj ) ;

    /**
     * Removing Observer
     * @param obj AddCard Observer to Remove
     */
    void removeObserver(IScoreObserver obj ) ;

    /**
     * Broadcast Event to Observers
     */
    void notifyAddCardObserver() ;

}
