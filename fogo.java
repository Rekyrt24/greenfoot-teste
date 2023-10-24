import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class fogo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class fogo extends Actor
{
    /**
     * Act - do whatever the fogo wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        moveAtaque();
    }
    public void moveAtaque(){
    double angle = Math.toRadians(getRotation());
    int x = (int) Math.round(getX() - Math.cos(angle));
    int y = (int) Math.round(getY() + Math.sin(angle));
    
    setLocation(x, y);
}
}
