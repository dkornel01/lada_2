
package nezet;

import java.util.Scanner;


public class CuiNezet {
    private static final String Sep=System.lineSeparator();
    private static final Scanner scr=new Scanner(System.in);
    
    private void konzolraIr(String msg){
        System.out.println(msg);
    }
    public void leirasMegjelenit(String msg){
        konzolraIr(msg+Sep);
    }
    public void feladatMegjelenito(String msg){
        konzolraIr(msg+ Sep);
    }
    public int valasztas(String msg){
        konzolraIr(msg);
        return scr.nextInt();
    }
    public void valaszatott(String msg){
        konzolraIr(msg);
    }
}
