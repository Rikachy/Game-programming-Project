import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class MyWorld extends World
{

    /**
     * Constructor for objects of class MyWorld.
     */
    public MyWorld()
    {
        super(800, 500, 1);
        prepare();
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Square square = new Square();
        addObject(square,382,245);
        GameLogo gameLogo = new GameLogo();
        addObject(gameLogo,409,84);
        Press press = new Press();
        addObject(press,363,391);
        square.setLocation(509,333);
        press.setLocation(377,380);
        square.setLocation(370,228);
        press.setLocation(495,334);
        press.setLocation(410,398);
        square.setLocation(376,233);
        square.setLocation(454,321);
        square.setLocation(380,337);
        square.setLocation(391,293);
        square.setLocation(427,376);
        press.setLocation(399,467);
        press.setLocation(376,337);
        press.setLocation(411,434);
        press.setLocation(497,325);
        square.setLocation(350,393);
        press.setLocation(422,403);
        press.setLocation(401,395);
        press.setLocation(588,327);
        square.setLocation(227,402);
        square.setLocation(341,271);
        square.setLocation(423,261);
        square.setLocation(471,357);
        square.setLocation(375,368);
        square.setLocation(382,181);
        square.setLocation(416,251);
        square.setLocation(404,229);
        square.setLocation(393,210);
        square.setLocation(452,329);
        press.setLocation(418,389);
        press.setLocation(408,398);
        press.setLocation(403,398);
        square.setLocation(392,181);
        square.setLocation(386,280);
        square.setLocation(390,257);
        square.setLocation(390,240);
        square.setLocation(395,215);
    }
}
