import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Square here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Square extends Actor
{
    private int rotationSpeed = 4; 
    /**
     * Act - do whatever the Square wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    
    {
                // Get the current rotation of the object
        int currentRotation = getRotation();

        // Increment the rotation by the rotationSpeed
        int newRotation = currentRotation + rotationSpeed;

        // Set the new rotation
        setRotation(newRotation);
    }
}
