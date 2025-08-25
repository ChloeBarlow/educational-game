import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.List;
/**
 * Basic virus defense. Low ROF, high damage, and high cost.
 * 
 * @author Sisi Li
 * @version 1/28/2021
 */
public class WDefender extends Towers
{
    /**
     * Contructor for crossbow. Initializes inherited variables.
     */
    public WDefender() {  
        //Initialize animation frames
        lv1Image1 = new GreenfootImage("wdefender.png");
        lv1Image2 = new GreenfootImage("wdefender.png");
        lv2Image1 = new GreenfootImage("wdefender.png");
        lv2Image2 = new GreenfootImage("wdefender.png");
        setImage(lv1Image1);
        //Initialize firing variables. 
        range = 200;   
        ROF = 20;
        newROF = 15;
        projSpeed = 7;
        damage = 2;
        newDamage = 3;
        cost = 100;
        upgradeCost = 150;
    }
    /**
     * Fires at enemy
     */
    public void act() 
    {
        count++;
        targetClosestEnemy(false);
    }
}
