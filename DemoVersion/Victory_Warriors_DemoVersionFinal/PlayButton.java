public class PlayButton extends Menu implements IGameCmdInvoker
{
    /**
     * Act - do whatever the ButtonStart wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
     IGameCommand newButtonCommand;
    
    public void act() 
    {
        super.act();
        // Add your action code here.
    }
    
    public void click()
    {
        newButtonCommand.executeCommand();
        
    }
    public void setCommand(IGameCommand newCmd)
    {
        this.newButtonCommand = newCmd;
    }
}
