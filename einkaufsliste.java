
import java.util.Scanner;
import java.util.ArrayList;

public class einkaufsliste {
    public static void main(String[] args) {

        int auswahl = 0;
        int zähler= 0;

       
        String artikel = "";

        String[] einkauflsite = new String[20]; 
        ArrayList<String> liste = new ArrayList<>();

         Scanner scanner = new Scanner(System.in);



            while (auswahl !=5) {
            System.out.println("===Einkaufsliste===");
            System.out.println("1. Artikel hinzufügen");
            System.out.println("2. Artikel entfernen");
            System.out.println("3. Artikel anzeigen");
            System.out.println("4. Alle Artikel anzeigen");
            System.out.println("5. Beenden");

             auswahl = scanner.nextInt();
             scanner.nextLine();

             switch (auswahl){
                
                case 1:
                System.out.println("Geben Sie den Artikel ein, den Sie hinzufügen möchten:");
                artikel = scanner.nextLine();

                    
                        if (artikel.isEmpty()) {
                            System.out.println("Ungültiger Artikel. Bitte geben Sie einen gültigen Artikel ein.");

                        } else if (liste.contains(artikel)) {
                            System.out.println("Artikel ist bereits in der Einkaufsliste vorhanden.");

                        } else {
                            liste.add(artikel);
                                for (int i = 0; i < einkauflsite.length; i++){
                                    if (einkauflsite[i] == null) {
                                        einkauflsite[i] = artikel;
                                        
                                    break;
                                }
                        }

                        
                    }
            
                    break;

                case 2:
                System.out.println("Geben Sie die Nummer des Artikels ein, den Sie entfernen möchten:");
                int nummer = scanner.nextInt();
                    scanner.nextLine();
                    if (nummer >= 1 && nummer <= einkauflsite.length && einkauflsite[nummer - 1] != null) {
                        einkauflsite[nummer - 1] = null;
                        System.out.println("Artikel entfernt.");
                    } else {
                        System.out.println("Ungültige Nummer.");
                    }

                    break; 

                case 3:
                 System.out.println( "Anzahl der Artikel in der Einkaufsliste: ");
                for (int i = 0; i < einkauflsite.length; i++) {
                    if(einkauflsite[i] != null){
                        zähler++;
                        
                    }
                }
                System.out.println(zähler);
                break;

                case 4:
                System.out.println("Alle Artikel in der Einkaufsliste:");
                for (int i = 0; i < einkauflsite.length; i++) {

                    if(einkauflsite[i] != null)
                    System.out.println( i+1 + " " + einkauflsite[i]);
                }
                    break;

                case 5:
                System.out.println("Programm wird beendet.");
                    break;

            }

        }


    }
}
