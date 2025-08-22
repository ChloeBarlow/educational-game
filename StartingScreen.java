import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class StartingScreen here.
 * 
 * @author (Liangyi Jinjing) 
 * @version (a version number or a date)
 */
public class StartingScreen extends World
{
    
    //declares instance variables
    private Button startButton;
    private Button instructions;
    private Button info;
    private Text cyberSecurity;
    private Text towerDefense;
    /**
     * Main constructor, sets the layout of the screen
     */
    public StartingScreen()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1000, 600, 1); 
        setBackground(new GreenfootImage("starting_background.jpg"));
        startButton = new Button("START", 40, Color.WHITE);
        instructions = new Button("INSTRUCTIONS", 40, Color.WHITE);
        info = new Button("INFORMATION", 40, Color.WHITE);
        cyberSecurity = new Text("CYBER", 60, Color.WHITE);
        towerDefense = new Text("DEFENSE", 60, Color.WHITE);
        addObject(cyberSecurity, 770, 205);
        addObject(towerDefense, 770, 260);
        addObject(startButton, 770, 350);
        addObject(instructions, 770, 390);
        addObject(info, 770, 430);
    }
    /**
     * Checks if buttons have been click and will respond accordingly
     */
    public void act(){
        
        if(startButton.getClicked() == true){
            Greenfoot.setWorld(new GameWorld());
        }
        if(instructions.getClicked() == true){
            Greenfoot.setWorld(new Instructions());
        }
        if(info.getClicked() == true){
            Greenfoot.setWorld(new Info());
        }
    }
}
