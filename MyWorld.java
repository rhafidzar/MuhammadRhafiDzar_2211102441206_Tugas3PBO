import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        
        bird player1 = new bird();
        this.addObject(player1, 200,200);
        
        fish player2 = new fish();
        this.addObject(player2, 250,250);
        
        cloud object1 = new cloud();
        this.addObject(object1, 600,100);
        
        cloud object2 = new cloud();
        this.addObject(object2, 550,50);
        
        cloud object3 = new cloud();
        this.addObject(object3, 400,75);
        
        cloud object4 = new cloud();
        this.addObject(object4, 600,300);
        
        cloud object5 = new cloud();
        this.addObject(object5, 300,150);
    }
}
