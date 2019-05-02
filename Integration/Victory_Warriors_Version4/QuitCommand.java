
/**
 * Write a description of class PlayCommand here.
 * 
 * @author Rucha Apte
 * @version (a version number or a date)
 */

public class QuitCommand implements IGameCommand
{
    IGameCmdRcvr playReceiver;
    
    public void setReceiver(IGameCmdRcvr newRec)
    {
        this.playReceiver = newRec;
        
    }
    public void executeCommand()
    {
        playReceiver.performAction();
        
    }
}