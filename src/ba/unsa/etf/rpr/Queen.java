package ba.unsa.etf.rpr;

public class Queen extends ChessPiece {
    private String pozicija;
    private Color boja;

    public Queen(String pozicija, Color boja){
        super(pozicija, boja);
        this.pozicija = pozicija;
        this.boja = boja;
    }

    @Override
    public String getPosition() {
        return pozicija;
    }

    public void setPosition(String pozicija) {
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
