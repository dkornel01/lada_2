/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vezerlo;

import model.newpackage.Feladat;
import model.newpackage.Lada;
import nezet.CuiNezet;
import nezet.CuiNezetFelugroAblak;

/**
 *
 * @author dobrocsi.kornel
 */
public abstract class vezerlo {
     private Feladat modell;
    private Lada[] ladak;

    public Vezerlo(Feladat modell) {
        this.modell = modell;
        this.ladak = modell.getLadak();
    }

    public abstract void mutat();
    
    public Feladat getModell() {
        return modell;
    }
    
    protected String feladatOsszeallito() {
        String str = "";
        for (Lada lada : ladak) {
            String anyag = lada.getAnyag() + ": ";
            String felirat = lada.getFelirat();
            str += anyag + felirat + "\n";
        }
        return str;
    }

    protected String eredmenyOsszeallito(int valasztas) {
        Lada lada = ladak[valasztas];
        String str = "";
        if(lada.isKincs()){
            str = "talált, a kincset a(z) ";
        }else{
            str = "nem talált, a kincset nem a(z) ";
        }
        return str + lada.getAnyag() + " rejti ";
    }
}
