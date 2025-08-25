
import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Shoots catapult at enemies. High ROF, low damage, and low cost.
 * 
 * @author Chloe Barlow
 * @version 8/22/25
 */
public class NordVPN extends Towers
{
    /**
     * Act - do whatever the Cannon wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public NordVPN() {    
        lv1Image1 = new GreenfootImage("nordvpn.png");
        lv1Image2 = new GreenfootImage("nordvpn.png");
        lv2Image1 = new GreenfootImage("nordvpn.png");
        lv2Image2 = new GreenfootImage("nordvpn.png");
        setImage(lv1Image1);
        range = 400;   
        ROF = 30;
        newROF = 25;
        projSpeed = 5;
        damage = 5;
        newDamage = 8;
        upgradeCost = 300;
        cost = 200;
    }
    public void act() 
    {
        count++;
        targetClosestEnemy(true);
    }    
}
