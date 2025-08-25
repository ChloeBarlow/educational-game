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
    private Text line5;
    private Text line6;
    private Text line7;
    private Text line8;
    private Text line9;
    /**
     * Constructor for objects of class Virus.
     * 
     */
    public Virus(){
        super();
        title = new Text("Viruses", 60, Color.WHITE);
        line1 = new Text("Download Virus: Most common", 20, Color.WHITE);
        line2 = new Text("Usually attached with seemingly harmless files from a sketchy site, downloads a payload onto your", 20, Color.WHITE);
        line3 = new Text("computer to steal data and execute unauthorized commands, most usual way of infection", 20, Color.WHITE);
        line4 = new Text("Keylogger Virus: Variant of Virus",20,Color.WHITE);
        line5 = new Text("Type of virus which instead of outright stealing, record your keystrokes (inputs) to record",20, Color.WHITE);
        line6 = new Text("sensitive data like passwords and credit card numbers, can be installed remotely or disguised",20, Color.WHITE);
        line7 = new Text("Phishing: Method of virus",20, Color.WHITE);
        line8 = new Text("Comes from attempts to steal your data by impersonation of trusted organizations through emails, ",20, Color.WHITE);
        line9 = new Text("phone numbers, and more, usually providing a link or attachment for you to click and download",20, Color.WHITE);
        addObject(title, 500, 100);
        addObject(line1, 500, 170);
        addObject(line2, 500, 200);
        addObject(line3, 500, 230);
        addObject(line4, 500, 270);
        addObject(line5, 500, 300);
        addObject(line6, 500, 330);
        addObject(line7, 500, 365);
        addObject(line8, 500, 395);
        addObject(line9, 500, 425);
    }
}
