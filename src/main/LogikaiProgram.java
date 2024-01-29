/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package main;

import java.nio.file.Paths;
import java.util.ArrayList;
import model.newpackage.Feladat;
import model.newpackage.Lada;
import nezet.CuiNezet;
import nezet.CuiNezetFelugroAblak;
import vezerlo.Cuivezerlo;
import vezerlo.Jopvezerlo;


public class LogikaiProgram {

    public static void main(String[] args) {
        new LogikaiProgram().run();
    }

    private void run() {
       CuiNezet cui=new CuiNezet();
       Feladat fel=new Feladat();
       //Cuivezerlo vezerlo=new Cuivezerlo(cui,fel);
       CuiNezetFelugroAblak jop=new  CuiNezetFelugroAblak();
       Jopvezerlo vez=new Jopvezerlo(jop, fel);
    }
    
}
