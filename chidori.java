import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class chidori here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class chidori extends Actor
{
    /**
     * Act - do whatever the chidori wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        moveAtaque();
    }
    public void moveAtaque(){
    double angle = Math.toRadians(getRotation());
    int y = (int) Math.round(getY() + Math.sin(angle));
    int x = (int) Math.round(getX() + Math.cos(angle));
    
    setLocation(x, y);
}
}
