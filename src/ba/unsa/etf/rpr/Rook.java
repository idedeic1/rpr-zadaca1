package ba.unsa.etf.rpr;

public class Rook extends ChessPiece {
    private String pozicija;
    private Color boja;

    public Rook(String pozicija, Color boja){
        super(pozicija, boja);
        this.pozicija = pozicija;
        this.boja = boja;
    }

    @Override
    public String getPosition() {
        return pozicija;
    }

    public void setPozicija(String pozicija) {
        this.pozicija = pozicija;
    }
    @Override
    public Color getColor() {
        return boja;
    }

    public void setColor(Color boja) {
        this.boja = boja;
    }
}
