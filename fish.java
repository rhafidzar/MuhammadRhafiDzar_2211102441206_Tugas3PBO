import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class fish here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class fish extends Player
{
    /**
     * Act - do whatever the fish wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    public fish() {
        GreenfootImage fishImage = new GreenfootImage("fish.png");
        fishImage.scale(100,50);
        setImage(fishImage);
    }
    
        private int verticalSpeed = 0;
        private static final int GRAVITY = 1;
        private static final int JUMP_STRENGTH = -10;
        
    public void act()
    {   
        verticalSpeed += GRAVITY;
        setLocation(getX(), getY() + verticalSpeed);
        
        if (Greenfoot.isKeyDown("enter")) {
            verticalSpeed = JUMP_STRENGTH;
        }
        
        if (verticalSpeed > 10) {
            verticalSpeed = 10;
        }
    }
}
