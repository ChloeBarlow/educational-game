import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class GameInfo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class GameInfo extends World
{
    private Text title;
    private Text line1;
    private Text line2;
    private Text line3;
    private Text line4;
    private Button backButton;
    private TextBox textBox;
    /**
     * Constructor for objects of class GameInfo.
     * 
     */
    public GameInfo()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1000, 600, 1); 
        setBackground(new GreenfootImage("starting_background.jpg"));
        // Initialize the text box.
        textBox = new TextBox();
        // Add the text box to the world.
        addObject(textBox, 500, 300);
        backButton = new Button("Back", 40, Color.WHITE);
        // Add the back button to the world.
        addObject(backButton, 500, 500);
    }
    public void act(){
        if(backButton.getClicked() == true){
            Greenfoot.setWorld(new Info());
        }
    }
}
