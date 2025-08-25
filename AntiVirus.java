import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class AntiVirus here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class AntiVirus extends GameInfo
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
     * Constructor for objects of class AntiVirus.
     * 
     */
    public AntiVirus(){
        super();
        title = new Text("ANTIVIRUS", 60, Color.WHITE);
        line1 = new Text("WDefender: Microsoft's built in defender that utilizes real time protection against malware", 20, Color.WHITE);
        line2 = new Text("by detecting and blocking it", 20, Color.WHITE);
        line3 = new Text("WDefender is a basic software, cheap but low protection overall", 20, Color.WHITE);
        line4 = new Text("Norton360: 3rd Party (Outside) antivirus, includes vpn and cloud backup with a more advanced",20,Color.WHITE);
        line5 = new Text("approach, more premium features such as blocking webcam hijacks",20, Color.WHITE);
        line6 = new Text("Norton360 is a compromise software, costs more but can dish out more against those pesky viruses",20, Color.WHITE);
        line7 = new Text("NordVPN: 3rd party antivirus, protection via Threat Protection feature that blocks malicious",20, Color.WHITE);
        line8 = new Text("websites and files while also scanning downloaded files, also encrypts your ip address and traffic",20, Color.WHITE);
        line9 = new Text("NordVPN is a costly software, but packs the most punch out of all of them",20, Color.WHITE);
        addObject(title, 500, 100);
        addObject(line1, 500, 170);
        addObject(line2, 500, 200);
        addObject(line3, 500, 230);
        addObject(line4, 500, 280);
        addObject(line5, 500, 310);
        addObject(line6, 500, 340);
        addObject(line7, 500, 400);
        addObject(line8, 500, 430);
        addObject(line9, 500, 460);
    }
}
