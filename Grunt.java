import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Grunt here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Grunt extends Actor
{
    int b=-1;
    int count = 0;
    int gunReloadTimer;
    int delayCounter;
    
    int removecount = 0;
    
    GreenfootImage image1;
    GreenfootImage image2;
    GreenfootImage image3;
    public Grunt(){
        getImage().scale(35,35);
        image1 = new GreenfootImage("spaceinvaderalien1.png");
        image1.scale(35,35);
        image2 = new GreenfootImage("spaceinvaderalien2.png");
        image2.scale(35,35);
        image3 = new GreenfootImage("deathanimation.png");
        image3.scale(35,35);
        
        gunReloadTimer = 999;
        delayCounter = 0;
    }
    public void act() 
    {
        count= (count+1)%47;
        delayCounter++;
        shoot();
        removecount++;
        move(); 
              
    }    
    public void hit(){        
        Space theSpaceWorld = (Space) getWorld();        
        theSpaceWorld.increaseScore();         
        setImage(image3);
        getWorld().removeObject(this);
            
        
        
    }
    public void shoot(){
        if(delayCounter>=gunReloadTimer){
            getWorld().addObject(new enemyLaser(),getX(),getY()+2);
            delayCounter = 0;
        }
        
    }
    public void move(){
         setLocation(getX()+b,getY());
        if (getX()>700){
            b=-1;
            setLocation(getX()+b,getY()+20);
        }
        if(getX()<100){
            b=1;
            setLocation(getX()+b,getY()+20);
        }
        if(count%4==0){
            setImage(image1);
            
        }
        if(count/4==1){
            setImage(image2);
        }       
        
    }
}
