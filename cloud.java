import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class cloud here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class cloud extends Actor
{
    /**
     * Act - do whatever the cloud wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public cloud() {
        GreenfootImage cloudImage = new GreenfootImage("cloud.png");
        cloudImage.scale(100,75);
        setImage(cloudImage);
        
    }
       private int speed = 2;
        private boolean isVisible = true;

    public void act() {
        if (isVisible) {
            setLocation(getX() - speed, getY());

            
            if (getX() <= 0) {
                isVisible = false;
            }
        } else {
            setLocation(getWorld().getWidth(), Greenfoot.getRandomNumber(getWorld().getHeight())); // Munculkan kembali di ujung kanan
            isVisible = true;
        }
    }
}
