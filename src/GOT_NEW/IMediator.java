public interface IMediator {
    public abstract void incrementCoinCount();
    public abstract void powerUp();
    public abstract void lostLife();
    public void endGame ();
    public void displayLevelScore(String msg);
    
}