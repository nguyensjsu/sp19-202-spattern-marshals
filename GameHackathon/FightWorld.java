import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class FightWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class FightWorld extends World
{

    /**
     * Constructor for objects of class FightWorld.
     * 
     */
    public FightWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1450, 900, 1); 
        prepare();
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {

        XerxesR xerxesR = new XerxesR();
        addObject(xerxesR,1168,421);
        xerxesR.setLocation(1160,446);
        removeObject(xerxesR);

        Rival rival = new Rival();
        addObject(rival,337,122);
        Rival rival2 = new Rival();
        addObject(rival2,562,121);
        Rival rival3 = new Rival();
        addObject(rival3,838,120);
        Rival rival4 = new Rival();
        addObject(rival4,1110,136);
        rival3.setLocation(784,107);
        rival3.setLocation(812,108);
        rival4.setLocation(1079,122);
        Rival rival5 = new Rival();
        addObject(rival5,486,302);
        Rival rival6 = new Rival();
        addObject(rival6,977,321);
        Rival rival7 = new Rival();
        addObject(rival7,743,424);
        Xerxes xerxes = new Xerxes();
        addObject(xerxes,138,283);
        Xerxes xerxes2 = new Xerxes();
        addObject(xerxes2,145,475);
        Xerxes xerxes3 = new Xerxes();
        addObject(xerxes3,1124,457);
        removeObject(xerxes3);
        rival.setLocation(239,105);
        rival4.setLocation(1145,103);
        rival3.setLocation(853,122);
        rival2.setLocation(557,100);
        xerxes.setLocation(140,283);
        removeObject(xerxes);
        removeObject(xerxes2);
        removeObject(rival);
        rival5.setLocation(495,301);
        removeObject(rival5);
        rival2.setLocation(554,97);
        removeObject(rival2);
        rival3.setLocation(857,106);
        removeObject(rival3);
        rival4.setLocation(1137,94);
        removeObject(rival4);
        rival6.setLocation(969,317);
        removeObject(rival6);
        rival7.setLocation(674,105);
        rival7.setLocation(674,132);
        Rival rival8 = new Rival();
        addObject(rival8,1055,242);
        Rival rival9 = new Rival();
        addObject(rival9,422,256);

        rival7.setLocation(673,182);
        rival7.setLocation(672,197);
        rival8.setLocation(990,204);
        NinjaR ninjaR = new NinjaR();
        addObject(ninjaR,1208,358);
        NinjaL ninjaL = new NinjaL();
        addObject(ninjaL,154,424);
        ninjaR.setLocation(1265,387);
        rival8.setLocation(1074,251);
        rival7.setLocation(834,188);
        rival7.setLocation(831,205);
        rival7.setLocation(790,226);
        rival9.setLocation(449,252);
        ninjaR.setLocation(1229,315);
        BlackPower blackPower = new BlackPower();
        addObject(blackPower,1229,315);
        NegativePower negativePower = new NegativePower();
        addObject(negativePower,248,301);
        negativePower.setLocation(248,301);
        negativePower.setLocation(241,305);
        negativePower.setLocation(269,323);
        ninjaR.setLocation(1195,283);
        ninjaR.setLocation(1311,371);
        blackPower.setLocation(1238,288);
        blackPower.setLocation(1238,289);
        blackPower.setLocation(1253,293);
        ninjaR.setLocation(1293,369);
        ninjaR.setLocation(1320,387);
    }
}
