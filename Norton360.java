import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Shoots cannonball at enemies. Medium ROF, damage, and cost.
 * 
 * @author Sisi Li
 * @version 1/28/2021
 */
public class Norton360 extends Towers
{
     /**
     * Constructor for cannon. Initializes inherited variables. 
     */
    public Norton360() {    
        //Initialize animation frames
        lv1Image1 = new GreenfootImage("norton.png");
        lv1Image2 = new GreenfootImage("norton.png");
        lv2Image1 = new GreenfootImage("norton.png");
        lv2Image2 = new GreenfootImage("norton.png");
        setImage(lv1Image1);
        //Initialize firing variables
        range = 500;   
        ROF = 20; 
        newROF = 32;
        projSpeed = 7;
        damage = 3;
        newDamage = 5;
        cost = 200;
        upgradeCost = 300;
    }
    /**
     * Fires at enemy
     */
    public void act() 
    {
        count++;
        targetClosestEnemy(true);
    }    
}
