import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Laser here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Laser extends Actor
{
    public Laser(){
        getImage().scale(30,30);
    }
    public void act() 
    {
        setLocation(getX(),getY()-3);
    }    
}
