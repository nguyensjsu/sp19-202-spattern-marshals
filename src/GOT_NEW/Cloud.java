import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Cloud here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Cloud extends Composite  implements Cloneable

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
            
            move(-2);
             // ww  = getWorld().getWidth();
             // wh = 
             
        }
         else if(Greenfoot.isKeyDown("left"))
        {
            
            move(2);
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
if (x == 0) setLocation(ww-2, y);
if (x == ww-1) setLocation(1, y);
if (y == 0) setLocation(x, wh-2);
if (y == wh-1) setLocation(x, 1);
        }

//else
//move(2);
}
public void display()
{
    System.out.println(random);
    w.addObject(this,random,Greenfoot.getRandomNumber(90)+15);
    random+=Greenfoot.getRandomNumber(50)+100;
    
    
     
}
}
