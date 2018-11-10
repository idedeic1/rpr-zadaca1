package ba.unsa.etf.rpr;


abstract public class ChessPiece {
    private String pozicija;
    private Color boja;
    private boolean daLiJeValidnaPozicija(String pozicija){

        String tmp = pozicija.toUpperCase();
        if(tmp.length() > 2) return false;
        if(tmp.charAt(0) < 'A') return false;
        if(tmp.charAt(0) > 'H') return false;
        if(tmp.charAt(1) < '1') return false;
        if(tmp.charAt(1) > '8') return false;
        return true;
    }

    public ChessPiece(String pozicija, Color boja) {
         if(daLiJeValidnaPozicija(pozicija)){
             this.pozicija = pozicija;
             this.boja = boja;
         }
        //else throw new IllegalArgumentException();
    }

    public enum Color{BLACK, WHITE}
    public String getPosition(){ return pozicija;}
    public Color getColor(){return boja;}
    public void move(String position) {

        if(daLiJeValidnaPozicija(position))
            this.pozicija = position;
        //else throw new IllegalArgumentException();

    }


}
