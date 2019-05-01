/**
 * Write a description of class IGameCommand here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public interface IGameCommand  
{
    // instance variables - replace the example below with your own
    public void executeCommand();
    public void setReceiver(IGameCmdRcvr newReceiver);
}

