import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Cloud here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Cloud extends Leaf implements Cloneable,Component

{
    /**
     * Act - do whatever the Cloud wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
       
    private MyWorld w;
    private static int random=100;
    
    public Cloud(MyWorld w)
    {
       // World world = getWorld();
        // Add your action code here.
        this.w=w;
       
    }
  

/*  public void act()
{
{
            move(Greenfoot.getRandomNumber(10));// You can insert any number there, i just chose ten
 }
}*/

 @Override 
      public Cloud clone() throws CloneNotSupportedException {
          return (Cloud) super.clone();
      }
public void act(){
    //int y=Greenfoot.getRandomNumber(2);
    //if(y==1)
  if(Greenfoot.isKeyDown("right"))
        {
            
            move(-4);
             // ww  = getWorld().getWidth();
             // wh = 
             
        }
         if(Greenfoot.isKeyDown("left"))
        {
            
            move(-4);
        }
        else{
            move(-2);
        }
        
     
        /*if(getX()==0)
        {
            this.setLocation(getWorld().getWidth()-1,Greenfoot.getRandomNumber(170)+30);
        }
         if(getY()==0)
        {
            this.setLocation(getWorld().getHeight()-1,Greenfoot.getRandomNumber(170)+30);
        }*/
        if(isAtEdge())
        {
            int x = getX();
int y = getY();
int ww = getWorld().getWidth();
int wh = getWorld().getHeight();
if (getX() == 0) setLocation(w.getBackground().getWidth()-2, getY());
if (getX() == w.getBackground().getWidth()-1) setLocation(1, getY());
if (getY() == 0) setLocation(getX(), w.getBackground().getHeight()-2);
if (getY() == w.getBackground().getHeight()-1) setLocation(getX(), 1);

        }

//else
//move(2);
}
public void display()
{
    //System.out.println(random);
    
    w.addObject(this,random,Greenfoot.getRandomNumber(120)+5);
    random+=Greenfoot.getRandomNumber(50)+100;
    
    
     
}
}
