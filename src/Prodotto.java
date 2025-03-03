
/* Nome repo: java-inheritance-shop Nel progetto java-inheritance-shop creare la classe Prodotto che gestisce i prodotti dello shop.
Un prodotto è caratterizzato da:
codice (numero intero)
nome
marca
prezzo
iva
Usate opportunamente i livelli di accesso (public, private), i costruttori, i metodi getter e setter ed eventuali altri metodi di “utilità” per fare in modo che:
il codice prodotto sia accessibile solo in lettura
gli altri attributi siano accessibili sia in lettura che in scrittura
Lo shop gestisce diversi tipi di prodotto:
Smarphone, caratterizzati anche dal codice IMEI e dalla quantità di memoria
Televisori, caratterizzati dalle dimensioni e dalla proprietà di essere smart oppure no
Cuffie, caratterizzate dal colore e se sono wireless o cablate
Utilizzate l’ereditarietà per riutilizzare il codice di Prodotto nella stesura delle classi che gestiscono i vari sotto tipi di prodotto.
Buon lavoro! */

import java.util.Random;

// Classe base Prodotto
public class Prodotto {

    private final int codice;
    private String nome;
    private String marca;
    private double prezzo;
    private double iva;


// Costruttore che inizializza gli attributi di Prodotto
    public Prodotto ( String nome, String marca, double prezzo, double iva ) {
        this.codice = generaCodice();
        this.nome = nome;
        this.marca = marca;
        this.prezzo = prezzo;
        this.iva = iva;
}

// Metodo per generare un numero casuale tra 1000 e 9999

    private int generaCodice() {
        Random ran = new Random();
        return 1000 + ran.nextInt(9000);
    }

// Metodo per calcolare l'iva e aggiungerla al prezzo

    public double aggiungiIva () {
        return prezzo + (prezzo * iva / 100);
    }

    @Override
    public String toString() {
        return "Prodotto | Codice=" + codice
         + ", nome=" + nome
         + ", marca=" + marca
         + ", prezzo=" + prezzo
         + ", iva=" + iva;
    }

// Getter per il codice

    public int getCodice (){
        return codice;
    }

// Getters e Setters per nome, marca, prezzo, iva
    
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getPrezzo() {
        return prezzo;
    }

    public void setPrezzo(double prezzo) {
        this.prezzo = prezzo;
    }

    public double getIva() {
        return iva;
    }

    public void setIva(double iva) {
        this.iva = iva;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

}
