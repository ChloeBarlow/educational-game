import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Trojan Horse type virus
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TrojanHorse extends Enemies
{
    /**
     * Act - do whatever the TrojanHorse wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void TrojanHorse(){
        image = new GreenfootImage("trojanhorse.png");
        image.scale(25,25);
        setImage(image);
        speed = 1;
        maxHp = 40;
        currHp = maxHp;
        name = "Trojan";
        score = 20;
        money = 30;
    }
    public void act()
    {
        move();  
        removeIfDead();
    }
}
