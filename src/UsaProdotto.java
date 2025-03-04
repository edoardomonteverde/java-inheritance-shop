// Classe Test UsaProdotto
public class UsaProdotto {
    public static void main(String[] args) throws Exception {
       // Creazione di un oggetto Smartphone
       Smartphone smartphone = new Smartphone("Iphone", "Apple", 1199.00, 22.0, "0123456789012", 128);
       System.out.println(smartphone);

       // Creazione di un televisore
        Televisore televisore = new Televisore("Smart TV", "Samsung", 599.99, 22.0, 55, true);
        System.out.println(televisore);
        
        // Creazione di un paio di cuffie
        Cuffie cuffie = new Cuffie("AirPods", "Apple", 199.99, 22.0, "Bianco", true);
        System.out.println(cuffie);
    }
}
