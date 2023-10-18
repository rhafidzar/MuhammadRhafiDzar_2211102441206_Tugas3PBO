import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class bird here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class bird extends Player
{
    /**
     * Act - do whatever the bird wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public bird() {
        GreenfootImage birdImage = new GreenfootImage("bird.png");
        birdImage.scale(50,50);
        setImage(birdImage);
    }
    
        private int verticalSpeed = 0;
        private static final int GRAVITY = 1;
        private static final int JUMP_STRENGTH = -10;
        
    public void act()
    {
        verticalSpeed += GRAVITY;
        setLocation(getX(), getY() + verticalSpeed);
        
        if (Greenfoot.isKeyDown("space")) {
            verticalSpeed = JUMP_STRENGTH;
        }
        
        if (verticalSpeed > 10) {
            verticalSpeed = 10;
        }
    }
}