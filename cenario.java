import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class cenario here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class cenario extends World
{
    private GreenfootSound bgMusic = new GreenfootSound("metalslug.mp3");
    
    public void started(){
    bgMusic.playLoop();
    }
    
    public void stopped(){
    bgMusic.pause();
    }
    
    /**
     * Constructor for objects of class cenario.
     * 
     */
    public cenario()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 540, 1); 
        prepare();
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        jack jack = new jack();
        addObject(jack,152,402);
        maluco maluco = new maluco();
        addObject(maluco,660,372);
        maluco.setLocation(665,392);
        removeObject(maluco);
        planta planta = new planta();
        addObject(planta,608,373);
        monkey monkey = new monkey();
        addObject(monkey,196,172);
        removeObject(monkey);
        babymonkey babymonkey = new babymonkey();
        addObject(babymonkey,213,193);
        removeObject(babymonkey);
        removeObject(jack);
        megarobo megarobo = new megarobo();
        addObject(megarobo,204,387);
        Counter counter = new Counter();
        addObject(counter,180,126);
        counter2 counter2 = new counter2();
        addObject(counter2,619,147);
    }
}
