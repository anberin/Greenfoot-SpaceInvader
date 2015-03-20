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
        getImage().scale(3,15);        
    }
    public void act() 
    {
         if (getY()<10){
            getImage().setTransparency(0);          
        } 
        setLocation(getX(),getY()-4);
        Grunt aGrunt = (Grunt)getOneIntersectingObject(Grunt.class );         
        if ( aGrunt == null ) {
        }
        else {
            getWorld().removeObject(aGrunt);
            getWorld().removeObject(this);            
        }     
    }    
}
