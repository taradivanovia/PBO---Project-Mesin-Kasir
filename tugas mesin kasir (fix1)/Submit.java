import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Submit here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Submit extends Actor
{
    /**
     * Act - do whatever the Submit wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        if (Greenfoot.mouseClicked(this)){
            World W=getWorld();
            ((Transaksi)W).getIsi().simpan();
        }
    }    
}
