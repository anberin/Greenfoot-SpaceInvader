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
        move();
        if(checkHit()==false && specialCheckHit() == false){
            checkEdge();
        }                          
    }  
    public void move(){
        setLocation(getX(),getY()-15);
    }   
    public boolean specialCheckHit(){
        Mothership aMothership = (Mothership)getOneIntersectingObject(Mothership.class );         
        if ( aMothership != null ){
            getWorld().removeObject(this);
            aMothership.hit();
            return true;
        }
        else {
            return false;
            
        } 
    }
    public boolean checkHit(){
        Grunt aGrunt = (Grunt)getOneIntersectingObject(Grunt.class );         
        if ( aGrunt != null ){
            getWorld().removeObject(this);
            aGrunt.hit();
            return true;
        }
        else {
            return false;
            
        } 
        
    }
    public void checkEdge(){
        if (getY()<10){
            getWorld().removeObject(this);         
        }          
    }
    
}
