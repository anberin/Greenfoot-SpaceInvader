import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.Color;


public class GameOver  extends Actor
{
    GifImage gifImage = new GifImage("GameOver.gif");

    public GameOver()
    {
        
    }
    public void act(){
        setImage(gifImage.getCurrentImage());
        
    }
    

    
}
