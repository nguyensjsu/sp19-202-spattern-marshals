import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Frame here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Frame extends Actor
{
    /**
     * Act - do whatever the Frame wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private BackGround myWorld;
    private Leaf leaf;
    public void act() 
    {
        // Add your action code here.
    }  
    
    
    public void loadTerrains() {    
          myWorld =  (BackGround)getWorld();
        leaf = new Leaf();

        int y = 0;
      
       
        drawGround(0);
        y+=400;
        drawWater(y);
        
        
    }
    
    void drawGround(int y){
        
        WarGround wg=new WarGround();
       
            Ground gr=new Ground();
            Ground g1=new Ground();
            //Ground g2=new Ground();
           wg.addSubComponent(gr);
           wg.addSubComponent(g1);
           //wg.addSubComponent(g2);
           System.out.println(myWorld);
           myWorld.addObject(wg,0,y);
          
        
  
        }
        
        void drawWater(int y){
                Stream s=new Stream();
                Water w=new Water();
                s.addSubComponent(w);
                myWorld.addObject(s,0,y);
                
        }
        
}
