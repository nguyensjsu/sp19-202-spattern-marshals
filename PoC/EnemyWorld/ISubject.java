public interface ISubject {
 
	public abstract void attach(IObserver obj);
	public abstract void notifyObservers(int x, int y);
}