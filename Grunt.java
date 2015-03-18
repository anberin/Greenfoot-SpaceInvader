import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Grunt here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Grunt extends Actor
{
    int b=-3;
    public Grunt(){
        getImage().scale(35,35);
    }
    public void act() 
    {
        if (getX()>getWorld().getWidth()-20){
            b=-3;
            setLocation(getX()-5,getY()+20);
        }
        if(getX()<20)b=3;
        setLocation(getX()+b,getY());
    }    
}
