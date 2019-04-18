// Interface for composite pattern
public interface IDisplayComponent {
    void display() ;
    IDisplayComponent getChild(int i);
    void addSubComponent(IDisplayComponent c);
    void removeComponent(IDisplayComponent c);   
}