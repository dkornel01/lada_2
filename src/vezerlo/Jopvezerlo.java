/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vezerlo;

import model.newpackage.Feladat;
import model.newpackage.Lada;
import nezet.CuiNezetFelugroAblak;

/**
 *
 * @author dobrocsi.kornel
 */
public class Jopvezerlo extends vezerlo{
    private CuiNezetFelugroAblak Jop;;
    
    public Jopvezerlo(CuiNezetFelugroAblak Jop, Feladat fel) {
        super(fel);
        this.Jop = Jop;
        this.fel = super.getModell();
        mutat();
        
    }
     protected int valasztasKezelo(){
        int valasztas = Jop.valasztas("melyik (0..2): ");
        return valasztas;
    }
    
    @Override
    public void mutat(){
        Jop.leirasMegjelenito("Csak 1 igaz!");
        Jop.feladatMegjelenito(feladatOsszeallito());
        int valasztas = valasztasKezelo();
        Jop.eredmenyMegjelenito(eredmenyOsszeallito(valasztas));
    }

}
