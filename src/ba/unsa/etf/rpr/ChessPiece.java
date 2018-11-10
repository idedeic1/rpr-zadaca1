package ba.unsa.etf.rpr;



abstract public class ChessPiece {
    private String pozicija;
    private Color boja;

    public ChessPiece(String pozicija, Color boja) {
        this.pozicija = pozicija;
        this.boja = boja;
    }

    public enum Color{BLACK, WHITE};
    public String getPosition(){ return pozicija;}
    public Color getColor(){return boja;}
    public void move(String position){}

}
