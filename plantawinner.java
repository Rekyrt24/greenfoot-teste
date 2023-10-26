import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class plantawinner here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class plantawinner extends World
{
    public int timer2 = 30;
    /**
     * Constructor for objects of class plantawinner.
     * 
     */
    public plantawinner()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 451, 1); 
    }
    public void act(){
    timer2--;
        if(Greenfoot.isKeyDown("enter") && (timer2 < 1)){
        setBackground(new GreenfootImage("creditos.png"));
    }
}
}
