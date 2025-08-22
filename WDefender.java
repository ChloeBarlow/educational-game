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
        lv1Image1 = new GreenfootImage("wdefender_lv1_01.png");
        lv1Image2 = new GreenfootImage("wdefender_lv1_02.png");
        lv2Image1 = new GreenfootImage("wdefender_lv2_01.jpg");
        //no proper second img
        lv2Image2 = new GreenfootImage("wdefender_lv2_01.jpg");
        lv1Image1.scale(25,25);
        lv1Image2.scale(25,25);
        lv1Image1.scale(25,25);
        lv2Image2.scale(25,25);
        setImage(lv1Image1);
        //Initialize firing variables. 
        range = 200;   
        ROF = 20;
        newROF = 15;
        projSpeed = 7;
        damage = 1;
        newDamage = 2;
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
