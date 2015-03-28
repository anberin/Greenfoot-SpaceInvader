import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Laser here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class enemyLaser extends Actor
{
    public enemyLaser(){
        getImage().scale(3,15);        
    }
    public void act() 
    {
        move();
        if(checkHit()==false){
            checkEdge();
        }                          
    }  
    public void move(){
        setLocation(getX(),getY()+1);
    }
    public boolean checkHit(){
        Cannon aCannon = (Cannon)getOneIntersectingObject(Cannon.class );         
        if ( aCannon != null ){
            getWorld().removeObject(this);
            aCannon.hit();
            return true;
        }
        else {
            return false;
            
        } 
        
    }
    public void checkEdge(){
        if (getY()>500){
            getWorld().removeObject(this);         
        }          
        
    }
    
}
