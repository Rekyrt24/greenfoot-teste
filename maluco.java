import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class sasuke here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class maluco extends Actor
{
    private int tempo = 0;
    GifImage sasuke = new GifImage("maluco.gif");
    public int speed=1;
    /**
     * Act - do whatever the sasuke wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        setImage(sasuke.getCurrentImage());
        movimento();
    }
    public void movimento(){
    if (Greenfoot.isKeyDown("up")){
    this.setLocation(this.getX(), this.getY() - speed);
    }
    if (Greenfoot.isKeyDown("down")){
    this.setLocation(this.getX(), this.getY() + speed);
    }
    if (Greenfoot.isKeyDown("left")){
    this.setLocation(this.getX() - speed,this.getY());
    }
    if  (Greenfoot.isKeyDown("right")){
    this.setLocation(this.getX() + speed,this.getY());
    }
     else if (Greenfoot.isKeyDown("l") && (tempo==0)){
    getWorld().addObject(new fogo(), getX() - 130, getY() +10);
    tempo++;
    }
    else{
    if (!Greenfoot.isKeyDown("l")){tempo=0;}
    }
}
    }

