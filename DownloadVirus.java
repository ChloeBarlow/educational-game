import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * A type of enemy
 * 
 * @author Chloe Barlow, Richie Shin
 * @version 8/22/25
 */
public class DownloadVirus extends Enemies
{
    /**
     * Main constructors, sets image, speed, and Hp of the download virus
     */

    public DownloadVirus(){
        image = new GreenfootImage("downloadVirus.png");
        setImage(image);
        speed = 2;
        maxHp = 35;
        currHp = maxHp;
        name = "DownloadVirus";
        score = 20;
        money = 30;
    }
    /**
     * Act - moves virus and removes it if it died
     */
    public void act() 
    {
        move();  
        removeIfDead();
    }    
}
