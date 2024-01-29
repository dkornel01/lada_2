package nezet;

public abstract class nezet {
    protected static final String Sep=System.lineSeparator();
    protected abstract void nezetbeIr(String msg);
    protected abstract int valasztas(String msg);
    
    public void valaszatott(String msg){
        nezetbeIr(msg);
    }
     public void leirasMegjelenit(String msg){
        nezetbeIr(msg+Sep);
    }
    public void feladatMegjelenito(String msg){
        nezetbeIr(msg+ Sep);
    }
}
