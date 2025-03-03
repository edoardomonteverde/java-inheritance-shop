// Classe Cuffie, sottoclasse di Prodotti
public class Cuffie extends Prodotto {
    private String colore;
    private boolean wireless;

    // Costruttore
    public Cuffie(String nome, String marca, double prezzo, double iva, String colore, boolean wireless) {
        super(nome, marca, prezzo, iva);
        this.colore = colore;
        this.wireless = wireless;
    }

    // Getters e Setters per gli attributi colore e wireless
    public String getColore() {
        return colore;
    }

    public void setColore(String colore) {
        this.colore = colore;
    }

    public boolean isWireless() {
        return wireless;
    }

    public void setWireless(boolean wireless) {
        this.wireless = wireless;
    }

    @Override
    public String toString() {
        return super.toString() + " | Cuffie | " +
                "colore=" + colore +
                ", wireless=" + wireless;
    }
}









