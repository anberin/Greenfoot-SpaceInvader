import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Space here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Space extends World
{

    /**
     * Constructor for objects of class Space.
     * 
     */
    int count=152;
    int spawn=0;
    private Score theScore;
    private GameOver aGameOver;
    public boolean checkMotherShip = false;
    private Lives lives;
    
    public Space()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 600, 1); 
        
        for (int x=200; x<601; x+=50){
            for( int y=100; y<250; y+=50){
                addObject(new Grunt(),x,y);
            }
        }
        
        lives = new Lives("Lives: ", 3);
        addObject(lives, 628, 520);
        
        theScore = new Score("Score: ");
        addObject(theScore, 420,520);   
        addObject(new Mothership(), 100,50);
        
        addObject(new Cannon(), 400,500);
    }
    public void act() {  
        count++;
        gameStatus();        
    }
    public void gameStatus(){
        if (numberOfObjects()<=2) 
        {
            addObject(new GameOver(),400,300);
            Greenfoot.playSound("gameover.wav");
            
            gameOver();
        }   
    }    
    
    public static void gameOver() {
        Greenfoot.delay(500);          
        Greenfoot.stop();
        
    }
    public void increaseScore(){
        theScore.add(100);
    }
    public void removeLife() {
        lives.removeOne();
    }
    
}
