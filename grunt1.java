import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class grunt1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class grunt1 extends Grunt
{
     int b=-3;
    public grunt1(){
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
