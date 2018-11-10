package ba.unsa.etf.rpr;


abstract public class ChessPiece {
    private String pozicija;
    private Color boja;

    public ChessPiece(String pozicija, Color boja) {
        if(pozicija.charAt(0) < 'A' || pozicija.charAt(0) > 'H' || pozicija.charAt(1) < '1' || pozicija.charAt(1) > '8') throw new IllegalChessMoveException("Tekst");
        this.pozicija = pozicija;
        this.boja = boja;
    }

    public enum Color{BLACK, WHITE}
    public String getPosition(){ return pozicija;}
    public Color getColor(){return boja;}
    public void move(String position){
        String tmp = position.toUpperCase();
        if(tmp.charAt(0) < 'A' || tmp.charAt(0) > 'H' || tmp.charAt(1) < '1' || tmp.charAt(1) > '8'){
            this.pozicija = tmp;
        }
        else{
            throw new IllegalChessMoveException("tekst");
        }
    }

}
