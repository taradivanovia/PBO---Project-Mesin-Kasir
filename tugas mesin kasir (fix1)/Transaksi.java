import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.*;
/**
 * Write a description of class W1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Transaksi extends World
{
    public isi isi;
    public Submit submit;
    public isi total;
    /**
     * Constructor for objects of class W1.
     * 
     */
    public Transaksi()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1000, 533, 1); 
        
        prepare();
    }
    
    public void prepare()
    {
        bayar bayar = new bayar();
        addObject(bayar, 820, 550);

        kueTok kueTok = new kueTok();
        addObject(kueTok, 100, 330);
        lemper lemper = new lemper();
        addObject(lemper, 290, 330);
        lumpur lumpur = new lumpur();
        addObject(lumpur, 480, 330);
        Onde Onde = new Onde();
        addObject(Onde, 100, 500);
        rotiKukus rotiKukus = new rotiKukus();
        addObject(rotiKukus, 290, 500);
        Serabi Serabi = new Serabi();
        addObject(Serabi, 480, 500);

        isi = new isi();
        addObject(isi,200,130);

        submit = new Submit();
        addObject(submit, 525, 168);

        total = new isi();
        addObject(total,750,350);
        total.warna=Color.white;

        isi.setLocation(188, 75);
        bayar.setLocation(925, 85);
        kueTok.setLocation(119, 259);
        submit.setLocation(529, 142);
        lemper.setLocation(305, 258);
        lumpur.setLocation(482, 262);
        submit.setLocation(526, 122);
        Onde.setLocation(122, 435);
        rotiKukus.setLocation(307, 431);
        Serabi.setLocation(486, 430);

        lumpur.setLocation(484, 258);
        Serabi.setLocation(490, 429);
        bayar.setLocation(924, 332);
        bayar.setLocation(934, 471);
        judul judul = new judul();
        addObject(judul, 819, 486);
        bayar.setLocation(934, 470);
        bayar.setLocation(939, 397);
        judul.setLocation(769, 483);
        isi.setLocation(225, 71);
        judul.setLocation(803, 55);
    }    
    
    public isi getIsi(){return isi;}
    public isi getTotal(){return total;}
}
