// Classe Televisore, Sottoclasse di Prodotto
public class Televisore extends Prodotto {
    private int dimensioni;
    private boolean smart;

    // Costruttore

    public Televisore( String nome, String marca, double prezzo, double iva, int dimensioni, boolean smart) {
        super( nome, marca, prezzo, iva);
        this.dimensioni = dimensioni;
        this.smart = smart;
    }

    // Getters e Setters per attributo dimensioni e smart

    public int getDimensioni() {
        return dimensioni;
    }

    public void setDimensioni(int dimensioni) {
        this.dimensioni = dimensioni;
    }

    public boolean isSmart() {
        return smart;
    }

    public void setSmart(boolean smart) {
        this.smart = smart;
    }

    @Override
    public String toString() {
        return super.toString() + " | Televisore | " +
                "dimensioni=" + dimensioni +
                ", smart=" + smart;
    }

}
