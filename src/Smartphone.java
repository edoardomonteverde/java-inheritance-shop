// Classe Smartphone, sottoclasse di Prodotti
public class Smartphone extends Prodotto {
    private String codiceIMEI;
    private int memoria;  

    // Costruttore per classe Smartphone

    public Smartphone(String nome, String marca, double prezzo, double iva, String codiceIMEI, int memoria) {
        super(nome, marca, prezzo, iva);
        this.codiceIMEI = codiceIMEI;
        this.memoria = memoria;
    }

    // Getters e Setters per gli attributi: codice IMEI e memoria

    public String getCodiceIMEI() {
        return codiceIMEI;
    }

    public void setCodiceIMEI(String codiceIMEI) {
        this.codiceIMEI = codiceIMEI;
    }

    public int getMemoria() {
        return memoria;
    }

    public void setMemoria(int memoria) {
        this.memoria = memoria;
    }
    
    @Override
    public String toString() {
        return super.toString()
         + " | Smartphone | codiceIMEI=" + codiceIMEI +
        ", memoria=" + memoria;

    }
}




