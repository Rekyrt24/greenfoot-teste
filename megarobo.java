import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class naruto here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class megarobo extends Actor
{
    GreenfootSound som = new GreenfootSound("bolapretason.mp3");
    private int sTimer=0;
    private int tempo = 0;
    GifImage naruto = new GifImage("megarobo.gif");
    public int speed=1;
    /**
     * Act - do whatever the naruto wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        setImage(naruto.getCurrentImage());
        moviment();
    }
    public void moviment(){
    if (Greenfoot.isKeyDown("w")){
    this.setLocation(this.getX(), this.getY() - speed);
    }
    if (Greenfoot.isKeyDown("s")){
    this.setLocation(this.getX(), this.getY() + speed);
    }
    if (Greenfoot.isKeyDown("a")){
    this.setLocation(this.getX() - speed,this.getY());
    }
    if  (Greenfoot.isKeyDown("d")){
    this.setLocation(this.getX() + speed,this.getY());
    }
     else if (Greenfoot.isKeyDown("f") && (tempo==0)){
    sTimer++;
    som.play();
    getWorld().addObject(new bolapreta(), getX() +50, getY() -20);
    tempo++;
    }
    else{
    if (!Greenfoot.isKeyDown("f")){tempo=0;}
    }
    }
}
