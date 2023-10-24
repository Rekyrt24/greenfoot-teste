import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class naruto here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class mega extends Actor
{
    private int tempo = 0;
    GifImage mega = new GifImage("megarobo.gif");
    public int speed=1;
    /**
     * Act - do whatever the naruto wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        setImage(mega.getCurrentImage());
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
    getWorld().addObject(new tiro(), getX() +50, getY() -30);
    tempo++;
    }
    else{
    if (!Greenfoot.isKeyDown("f")){tempo=0;}
    }
    }
}
