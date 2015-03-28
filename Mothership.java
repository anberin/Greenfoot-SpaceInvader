import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Mothership extends Actor
{
     int b=3;
    
    
    public Mothership(){
        getImage().scale(60,26);
    }
    public void act() 
    {
        // Add your action code here.
        move();           
         
               
    }    
    public void hit(){
        Space theSpaceWorld = (Space) getWorld();        
        theSpaceWorld.increaseScore();       
        getWorld().removeObject(this); 
                
    }
    
    public void move(){
        setLocation(getX()+b,getY());
        if (getX()>700){
            setLocation(100,50);
        }
              
               
        
    }
}
