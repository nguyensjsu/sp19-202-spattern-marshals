import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Frame here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Frame extends Player
{
    /**
     * Act - do whatever the Frame wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private BackGround myWorld;
    private Leaf leaf;
    private Hero p;
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
       
        y+=200;
        drawGround(y);
        drawPlayer();
        
    }
    
    void drawGround(int y){
        
        WarGround wg=new WarGround();
       
            Ground gr=new Ground();
            Ground g1=new Ground();
            Ground g2=new Ground();
            Ground g3=new Ground();
            Ground g4=new Ground();
           // Ground g5=new Ground();
           // Ground g6=new Ground();
            //Ground g7=new Ground();
           wg.addSubComponent(gr);
           wg.addSubComponent(g1);
           wg.addSubComponent(g2);
           wg.addSubComponent(g3);
           wg.addSubComponent(g4);
           //wg.addSubComponent(g5);
           //wg.addSubComponent(g6);
           //wg.addSubComponent(g7);
           
           System.out.println(myWorld);
           myWorld.addObject(wg,0,y);
          
        
  
        }
        
        void drawWater(int y){
                Stream s=new Stream();
                
                Water w=new Water();
                Boat b=new Boat();
                Boat1 b1=new Boat1();
                Boat b2=new Boat();
                 Boat1 b3=new Boat1();
                  Boat b4=new Boat();
                  Boat1 b5=new Boat1();
               
                
                s.addSubComponent(w);
                s.addSubComponent(b);
                s.addSubComponent(b1);
                s.addSubComponent(b2);
                s.addSubComponent(b3);
                s.addSubComponent(b4);
                s.addSubComponent(b5);
                
            
                
                myWorld.addObject(s,0,y);
                
        }
        
        public void drawPlayer(){
            
            p = new Hero();
        //p.attachObserver(myWorld);
        p.getImage().scale(60,60);
        myWorld.addObject( p, 600, 650);
            
        }
       
        
}
