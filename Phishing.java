import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * A type of enemy
 * 
 * @author Chloe Barlow, Richie Shin
 * @version 8/22/25
 */
public class Phishing extends Enemies
{
    /**
     * Main constructors, sets image, speed, and Hp of phishing attack
     */
    public Phishing(){
        image = new GreenfootImage("phishing.png");
        setImage(image);
        speed = 3;
        maxHp = 15;
        currHp = maxHp;
        name = "Phishing";
        score = 20;
        money = 20;
    }
    /**
     * Act - Moves phishing attack and removes it if it died
     */
    public void act() 
    {
        move();
        removeIfDead();
    }    
}
