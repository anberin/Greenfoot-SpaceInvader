import greenfoot.*;
public class Cannon extends Actor
{
    int count = 0;
    public Cannon(){
        getImage().scale(26,16);
    }
    public void act() 
    {
        count++;
        if(Greenfoot.isKeyDown("a")){
            setLocation(getX()-4,500);            
        }
        if(Greenfoot.isKeyDown("d")){
            setLocation(getX()+4,500);
        }
        if(Greenfoot.isKeyDown("space")&& count%10==0){
            getWorld().addObject(new Laser(),getX(),getY()-12);
            
        }        
    }    
}
