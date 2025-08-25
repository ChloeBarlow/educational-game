import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Info here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Info extends World
{

    /**
     * Constructor for objects of class Info.
     * 
     */
    private Text title;
    private Button option1;
    private Button option2;
    private Button backButton;
    private TextBox textBox;
    private World antiVirus;
    private World virus;
    public Info()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1000, 600, 1); 
        setBackground(new GreenfootImage("starting_background.jpg"));
        textBox = new TextBox();
        // Add the text box to the world.
        addObject(textBox, 500, 300);
        title = new Text("INFORMATION", 60, Color.WHITE);
        option1 = new Button("Antiviruses", 80, Color.WHITE);
        option2 = new Button("Viruses", 80, Color.WHITE);
        addObject(title, 500, 100);
        addObject(option1, 500, 250);
        addObject(option2, 500, 350);
        backButton = new Button("Back", 40, Color.WHITE);
        addObject(backButton, 500, 500);
    }
    public void act(){
        if(backButton.getClicked() == true){
            Greenfoot.setWorld(new StartingScreen());
        }
        if(option1.getClicked() == true){
            Greenfoot.setWorld(new AntiVirus());
        }
        if(option2.getClicked() == true){
            Greenfoot.setWorld(new Virus());
        }
    }
}
