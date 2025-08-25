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
    private Text line10;
    private Text line11;
    private Text line12;
    /**
     * Constructor for objects of class Virus.
     * 
     */
    public Virus(){
        super();
        title = new Text("Viruses", 60, Color.WHITE);
        line1 = new Text("Download Virus: Most common", 17, Color.WHITE);
        line2 = new Text("Usually attached with seemingly harmless files from a sketchy site, downloads a payload onto your", 17, Color.WHITE);
        line3 = new Text("computer to steal data and execute unauthorized commands, most usual way of infection", 17, Color.WHITE);
        line4 = new Text("Keylogger Virus: Variant of Virus",17,Color.WHITE);
        line5 = new Text("Type of virus which instead of outright stealing, record your keystrokes (inputs) to record",17, Color.WHITE);
        line6 = new Text("sensitive data like passwords and credit card numbers, can be installed remotely or disguised",17, Color.WHITE);
        line7 = new Text("Phishing: Method of virus",17, Color.WHITE);
        line8 = new Text("Comes from attempts to steal your data by impersonation of trusted organizations through emails, ",17, Color.WHITE);
        line9 = new Text("phone numbers, and more, usually providing a link or attachment for you to click and download",17, Color.WHITE);
        line10 = new Text("Trojan Horse: Variant of Virus",17, Color.WHITE);
        line11 = new Text("Type of virus that disguises itself as a legitimate and trustworthy software to trick people into installing",17, Color.WHITE);
        line12 = new Text("it, and can install things like keyloggers and steal sensitive information like phishing attacks",17, Color.WHITE);
        addObject(title, 500, 100);
        addObject(line1, 500, 150);
        addObject(line2, 500, 175);
        addObject(line3, 500, 200);
        addObject(line4, 500, 235);
        addObject(line5, 500, 260);
        addObject(line6, 500, 285);
        addObject(line7, 500, 320);
        addObject(line8, 500, 345);
        addObject(line9, 500, 370);
        addObject(line10, 500, 405);
        addObject(line11, 500, 430);
        addObject(line12, 500, 455);
    }
}
