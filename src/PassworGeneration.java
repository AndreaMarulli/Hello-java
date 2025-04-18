// CODICE CREATO CONTESTUALMENTE OPPURE PRIMA DICHIARE E POI SI ASSEGNA

import java.util.Scanner;



public class PassworGeneration {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Inserisci il tuo nome");
        String nome = scanner.nextLine();

        System.out.println("Inserisci il tuo cognome");
        String cognome = scanner.nextLine();

        System.out.println("Inserisci il tuo clore preferito ");
        String colorePreferito = scanner.nextLine();

        System.out.println("Inserisci il tuo giorno di nascita ");
        String giornoNascita = scanner.nextLine(); 

        System.out.println("Inserisci il tuo mese di nascita ");
        String meseNascita = scanner.nextLine();

        System.out.println("Inserisci il tuo anno ");
        String anno = scanner.nextLine();
        
        // SOMMA GIORNO MESE e ANNO NEL TERMINAL 
        int sommaNascita = Integer.parseInt(giornoNascita) + Integer.parseInt(meseNascita) + Integer.parseInt(anno);
        String format;
        String risultato = String.format("%s-%s-%s-%d" , nome, cognome, colorePreferito, sommaNascita );

        System.out.println("La password generata è: ");
        System.out.println(risultato);

        scanner.close();
    }
}
 