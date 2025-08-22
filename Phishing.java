import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * A type of enemy
 * 
 * @author (Cassidy Li) 
 * @version (01/28/21)
 */
public class Phishing extends Enemies
{
    /**
     * Main constructors, sets image, speed, and Hp of sword man
     */
    public Phishing(){
        image = new GreenfootImage("knight.png");
        setImage(image);
        speed = 1;
        maxHp = 30;
        currHp = maxHp;
        name = "Phishing";
        score = 10;
        money = 5;
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
