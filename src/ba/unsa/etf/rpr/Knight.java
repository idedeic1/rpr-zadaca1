package ba.unsa.etf.rpr;

public class Knight extends ChessPiece {
    private String pozicija;
    private Color boja;

    public Knight(String pozicija, Color boja, String pozicija1, Color boja1) {
        super(pozicija, boja);
        this.pozicija = pozicija1;
        this.boja = boja1;
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
