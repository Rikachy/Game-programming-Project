import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class GameLogo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class GameLogo extends Actor
{
    /**
     * Act - do whatever the GameLogo wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        //gentle floating animation
        setLocation(getX(), getY() + (int)(Math.sin(System.currentTimeMillis() / 200.0) * 2));

        //if mouse is clicked - goes to new world
        if (Greenfoot.mouseClicked(null)){
            DinoWorld worldTest = new DinoWorld();
            Greenfoot.setWorld(worldTest);
        }
    }

    }

