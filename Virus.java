import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Virus here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Virus extends GameInfo
{
    private Text title;
    private Text line1;
    private Text line2;
    private Text line3;
    private Text line4;
    /**
     * Constructor for objects of class Virus.
     * 
     */
    public Virus(){
        super();
        title = new Text("Virus", 60, Color.WHITE);
        line1 = new Text("Download Virus: Most common", 20, Color.WHITE);
        line2 = new Text("The objective is to prevent the viruses from reaching your computer", 20, Color.WHITE);
        line3 = new Text("Use the money that you have to begin with to install virus defenders", 20, Color.WHITE);
        line4 = new Text("To install a software, click the icon of the software that you",20,Color.WHITE);
        addObject(title, 500, 100);
        addObject(line1, 500, 150);
        addObject(line2, 500, 180);
        addObject(line3, 500, 210);
        addObject(line4, 500, 240);
    }
}
