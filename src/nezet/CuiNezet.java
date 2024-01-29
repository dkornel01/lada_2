
package nezet;

import java.util.Scanner;


public class CuiNezet extends nezet{
    private static final String Sep=System.lineSeparator();
    private static final Scanner scr=new Scanner(System.in);
    
    @Override
    protected void nezetbeIr(String msg){
        System.out.println(msg);
    }
    @Override
    public int valasztas(String msg){
        nezetbeIr(msg);
        return scr.nextInt();
    }
}
