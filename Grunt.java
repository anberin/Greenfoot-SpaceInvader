import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Grunt here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Grunt extends Actor
{
    int b=-2;
    int count = 0;
    public Grunt(){
        getImage().scale(35,35);
    }
    public void act() 
    {
        if (getX()>700){
            b=-2;
            setLocation(getX()+b,getY()+20);
        }
        if(getX()<100){
            b=2;
            setLocation(getX()+b,getY()+20);
        }
        if(count%10==0){
            setImage("spaceinvaderalien2.png");
            getImage().scale(35,35);
            count++;
        }
        else{
            setImage("spaceinvaderalien1.png");
            getImage().scale(35,35);
            count++;
        }
        
        
        setLocation(getX()+b,getY());
    }    
}
