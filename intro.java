import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class intro here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class intro extends World
{
    private int atraso = 0;
    /**
     * Constructor for objects of class intro.
     * 
     */
    public intro()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 445, 1); 
        prepare();
    }

    public void act(){
        if (Greenfoot.isKeyDown("enter")&&(atraso == 0)){
            setBackground(new GreenfootImage("dialogo.png"));
            atraso++;
        }
        else{
            if(!Greenfoot.isKeyDown("enter")){
            atraso = 0;
            }
        }
        if (Greenfoot.isKeyDown("enter")&&(atraso == 0)){
            cenario world = new cenario();
            Greenfoot.setWorld(world);
        }
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
    }
}