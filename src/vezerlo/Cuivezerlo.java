/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vezerlo;

import model.newpackage.Feladat;
import model.newpackage.Lada;
import nezet.CuiNezet;


public class Cuivezerlo extends vezerlo{
    private CuiNezet cui;

    public Cuivezerlo(CuiNezet cui, Feladat fel) {
        this.cui = cui;
        this.fel = fel;
        vez();
    }
    public void vez(){
       cui.leirasMegjelenit("csak 1 Igaz");
       Lada[] ladak=fel.getLadak();
       Feladat_Osszealito(ladak,cui);
       int valasztas=cui.valasztas("melyik {0..2}: ");
       String str=Kincs(ladak, valasztas);
       cui.leirasMegjelenit(str);
    }

    
}
