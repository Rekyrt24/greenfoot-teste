import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class introdu��o here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class introdu��o extends World
{
    public int temp = 50;
    public int temp1 = 50;
    public int temp2 = 50;
    /**
     * Constructor for objects of class introdu��o.
     * 
     */
    public introdu��o()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 445, 1); 
        prepare();
    }

    public void act(){
        temp--;
        //Di�logo robo
        if(Greenfoot.isKeyDown("enter") && (temp < 1)){
            setBackground(new GreenfootImage("dialogo1.png"));
            temp1--;
        }
        //Di�logo planta
        if (Greenfoot.isKeyDown("enter") && (temp1 < 1)){
            setBackground(new GreenfootImage("dialogo2.png"));
            temp2--;
        }
        //Iniciar o jogo
        if (Greenfoot.isKeyDown("enter") && (temp2 < 1)){
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

