package ba.unsa.etf.rpr;

public class Knight extends ChessPiece {
    private String pozicija;
    private Color boja;

    public Knight(String pozicija, Color boja) {
        super(pozicija, boja);
        this.pozicija = pozicija;
        this.boja = boja;
    }

    @Override
    public String getPosition() {
        return pozicija;
    }

    public void setPosition(String position) {
        pozicija = position;
    }

    @Override
    public Color getColor() {
        return boja;
    }

    public void setColor(Color color) {
        this.boja = color;
    }
}
