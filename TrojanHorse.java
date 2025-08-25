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
    public TrojanHorse(){
        image = new GreenfootImage("trojanhorse.png");
        setImage(image);
        speed = 1;
        maxHp = 150;
        currHp = maxHp;
        name = "Trojan";
        score = 40;
        money = 40;
    }
    public void act()
    {
        move();  
        removeIfDead();
    }
}
