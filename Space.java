import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Space here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Space extends World
{

    /**
     * Constructor for objects of class Space.
     * 
     */
    public Space()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 600, 1); 
        
        for (int x=200; x<601; x+=50){
            for( int y=100; y<250; y+=50){
                addObject(new Grunt(),x,y);
            }
        }
        
             
        addObject(new Mothership(),400, 50);
        addObject(new Cannon(), 400,500);
    }
}
