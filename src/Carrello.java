
import java.util.ArrayList;
import java.util.Scanner;

// Classe Carrello
public class Carrello {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) { // Inizializzo scanner
            ArrayList<Prodotto> carrello = new ArrayList<>(); // Inizializzo arraylist
            
            boolean carrelloAttivo = true; // Creo una variabile che rappresenta lo stato del carrello ed è la condizione del ciclo while e la valorizzo inizialmente true

            // Creo un ciclo while, fino a quando la condizione carrelloAttivo è true permette di inserire prodotti nell'arraylist
            while (carrelloAttivo) {
                System.out.println("Che tipo di prodotto vuoi inserire? (1: Smartphone, 2: Televisore, 3: Cuffie)");
                int scelta = scanner.nextInt();
                scanner.nextLine();

                // Utilizzo la struttura switch per gestire le scelte dell'utente, inizializzare gli oggetti ed aggiungerli all'arraylist
                
                switch (scelta) {
                    case 1 -> {
                        System.out.print("Inserisci il nome: ");
                        String nome = scanner.nextLine();
                        
                        System.out.print("Inserisci la marca: ");
                        String marca = scanner.nextLine();
                        
                        System.out.print("Inserisci il prezzo: ");
                        double prezzo = scanner.nextDouble();
                        
                        System.out.print("Inserisci l'IVA: ");
                        double iva = scanner.nextDouble();
                        scanner.nextLine();
                        
                        System.out.print("Inserisci il codice IMEI: ");
                        String codiceIMEI = scanner.nextLine();
                        
                        System.out.print("Inserisci la memoria (GB): ");
                        int memoria = scanner.nextInt();
                        
                        carrello.add(new Smartphone(nome, marca, prezzo, iva, codiceIMEI, memoria));
                    }
                    case 2 -> {
                        System.out.print("Inserisci il nome: ");
                        String nome = scanner.nextLine();
                        
                        System.out.print("Inserisci la marca: ");
                        String marca = scanner.nextLine();
                        
                        System.out.print("Inserisci il prezzo: ");
                        double prezzo = scanner.nextDouble();
                        
                        System.out.print("Inserisci l'IVA: ");
                        double iva = scanner.nextDouble();
                        
                        System.out.print("Inserisci le dimensioni (pollici): ");
                        int dimensioni = scanner.nextInt();
                        
                        System.out.print("Il televisore è smart? (true/false): ");
                        boolean smart = scanner.nextBoolean();
                        
                        carrello.add(new Televisore(nome, marca, prezzo, iva, dimensioni, smart));
                    }
                    case 3 -> {
                        System.out.print("Inserisci il nome: ");
                        String nome = scanner.nextLine();
                        
                        System.out.print("Inserisci la marca: ");
                        String marca = scanner.nextLine();
                        
                        System.out.print("Inserisci il prezzo: ");
                        double prezzo = scanner.nextDouble();
                        
                        System.out.print("Inserisci l'IVA: ");
                        double iva = scanner.nextDouble();
                        scanner.nextLine();
                        
                        System.out.print("Inserisci il colore: ");
                        String colore = scanner.nextLine();
                        
                        System.out.print("Le cuffie sono wireless? (true/false): ");
                        boolean wireless = scanner.nextBoolean();
                        
                        carrello.add(new Cuffie(nome, marca, prezzo, iva, colore, wireless));
                    }
                    default -> System.out.println("Scelta non valida, riprova.");
                }
                
                // Scelta azioni successive all'aggiunta del prodotto: aggiungi prodotto, stampa, chiudi

                System.out.println("\nScegli un'azione:");
                System.out.println("1: Aggiungi Prodotto | 2: Stampa Carrello | 3: Esci");
                int azione = scanner.nextInt();
                scanner.nextLine();
                
                switch (azione) {
                    case 1 -> System.out.println("Aggiungi un nuovo prodotto.");
                    case 2 -> {
                        System.out.println("\nCarrello:");
                        for (Prodotto prodotto : carrello) {
                            System.out.println(prodotto);
                            
                        }
                    }
                    case 3 -> {
                        carrelloAttivo = false;
                        System.out.println("Uscita dal programma.");
                    }
                    default -> System.out.println("Scelta non valida, riprova.");
                }
            }
        }
    }
}