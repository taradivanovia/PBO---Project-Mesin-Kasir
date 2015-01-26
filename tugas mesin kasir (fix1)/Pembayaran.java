import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class W2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Pembayaran extends World
{

    /**
     * Constructor for objects of class Pembayaran.
     * 
     */
    public Pembayaran()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1000, 533, 1); 

        prepare();
    }

    /**
     * Prepare the world for the start of the program. That is: create the initial
     * objects and add them to the world.
     */
    private void prepare()
    {
        satu satu = new satu();
        addObject(satu, 107, 275);
        satu.setLocation(101, 268);
        tiga tiga = new tiga();
        addObject(tiga, 312, 276);
        tiga.setLocation(299, 271);
        empat empat = new empat();
        addObject(empat, 108, 351);
        empat.setLocation(102, 347);
        lima lima = new lima();
        addObject(lima, 203, 352);
        lima.setLocation(196, 348);
        tiga.setLocation(286, 271);
        enam enam = new enam();
        addObject(enam, 297, 355);
        enam.setLocation(288, 349);
        dua dua = new dua();
        addObject(dua, 201, 274);
        dua.setLocation(194, 270);
        delapan delapan = new delapan();
        addObject(delapan, 106, 432);
        delapan.setLocation(104, 425);
        sembilan sembilan = new sembilan();
        addObject(sembilan, 308, 435);
        sembilan.setLocation(289, 427);
        delapan.setLocation(197, 428);
        nol nol = new nol();
        addObject(nol, 204, 510);
        nol.setLocation(198, 505);
        tujuh tujuh = new tujuh();
        addObject(tujuh, 112, 431);
        tujuh.setLocation(106, 424);
    }
}
