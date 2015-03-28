import greenfoot.*;
public class Cannon extends Actor
{
    
    int gunReloadTimer;
    int delayCounter;
    public Cannon(){
        getImage().scale(26,16);
        gunReloadTimer = 47;
        delayCounter = 0;
    }

    public void act() 
    {
        checkKeys();
        checkEdge();
        delayCounter++;
        

    }    

    public void checkKeys(){
        if(Greenfoot.isKeyDown("a")){
            setLocation(getX()-4,500);            
        }
        if(Greenfoot.isKeyDown("d")){
            setLocation(getX()+4,500);
        }
        if(Greenfoot.isKeyDown("space")){
            shoot();         
        }          
    }
    public void hit(){
        Space theSpaceWorld = (Space) getWorld();      
        theSpaceWorld.gameStatus();
        getWorld().removeObject(this);
        
    }
    
    public void checkEdge(){
        if(getX()<=50){
            setLocation(50,500);
        }
        if(getX()>=750){
            setLocation(750,500);
        }
        
    }

    public void shoot(){
        if(delayCounter>=gunReloadTimer){
            getWorld().addObject(new Laser(),getX(),getY()-12);
            Greenfoot.playSound("lasersound.wav");
            delayCounter = 0;
        }
    }

}
