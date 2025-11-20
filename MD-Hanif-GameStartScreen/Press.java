import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Press here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Press extends Actor
{
    /**
     * Act - do whatever the Press wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        setLocation(getX(), getY() + (int)(Math.sin(System.currentTimeMillis() / 250.0) * 2));
    }
}
