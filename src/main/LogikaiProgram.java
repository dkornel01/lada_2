/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package main;

import java.nio.file.Paths;
import model.newpackage.Lada;
import nezet.CuiNezet;


public class LogikaiProgram {


    public static void main(String[] args) {
        run();
    }

    private static void run() {
       Lada lad1=new Lada("arany: ","én rejtem");
       Lada lad2=new Lada("ezüst: ","nem én rejtem", true);
       Lada lad3=new Lada("bronz: ","az arany hazudik");
       CuiNezet cui=new CuiNezet();
       cui.feladatMegjelenito("Csak 1 igaz!");
       cui.leirasMegjelenit(lad1.getAnyag()+lad1.getFelirat());
       cui.leirasMegjelenit(lad2.getAnyag()+lad2.getFelirat());
       cui.leirasMegjelenit(lad3.getAnyag()+lad3.getFelirat());
       int elso=cui.valasztas("melyik (0..2):0");
       if (elso==0){
           cui.valaszatott("nem talált, a kincset nem az aranya rejti");
       }
       else if (elso==1){
           cui.valaszatott("talált, a kincset ezüst rejtette rejti");
       }
       else {
           cui.valaszatott("nem talált, a kincset nem az bronz rejti");
       }
    }
    
}
