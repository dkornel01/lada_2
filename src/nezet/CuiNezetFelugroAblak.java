/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package nezet;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author dobrocsi.kornel
 */
public class CuiNezetFelugroAblak extends nezet{
    

    
    @Override
    protected void nezetbeIr(String msg){
        JOptionPane.showMessageDialog(null, msg, "", 0);
    }
   
    @Override
    public int valasztas(String msg){
        return Integer.parseInt(JOptionPane.showInputDialog(null, msg, "", 0));
    }

}
