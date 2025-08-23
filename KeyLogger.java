import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * A type of enemy
 * 
 * @author (Cassidy Li) 
 * @version (01/28/21)
 */
public class KeyLogger extends Enemies
{
    /**
     * Main constructors, sets image, speed, and Hp of crossbow man
     */
    public KeyLogger(){
        image = new GreenfootImage("keylogger.png");
        setImage(image);
        speed = 1;
        maxHp = 10;
        currHp = maxHp;
        name = "KeyLogger";
        score = 15;
        money = 10;
    }
    /**
     * Act - Moves sword man and removes it if it died
     */
    public void act() 
    {
        move();
        removeIfDead();
    }    
}
