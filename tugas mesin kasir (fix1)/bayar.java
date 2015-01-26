import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class kasir here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class bayar extends Actor
{
    /**
     * Act - do whatever the kasir wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private int Pembayaran;
    public void act() 
    {
        // Add your action code here.
        if(Greenfoot.mouseClicked(this))
        {
            Greenfoot.setWorld(new Pembayaran());
        }
    }    
}
