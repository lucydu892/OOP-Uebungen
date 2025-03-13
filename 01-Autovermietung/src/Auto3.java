import java.util.Scanner;

public class Auto3 {
    public static void main(String[] args) {

        Fahrzeug a1 = new Fahrzeug("GI-JP 111", "Renault", "Rot", 6.2F, 90, 32500, 60, 32);
        Fahrzeug a2 = new Fahrzeug("GI-VH-200", "VW", "Schwarz", 7.5F, 75, 65000, 50, 40);

        Kunde k1 = new Kunde(1,"Sarah", "Christen");

        //Bildschirmdialog
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nHerzlich Willkommen " + k1.getKundenVorname() + " " + k1.getKundenNachame() + "!\n");
        System.out.println("Unser Verfügbare Autos...\n");
        System.out.println("-" + a1.getMarke() + " " + a1.getKennzeichen() + " (" + a1.getFarbe()+")\n");
        System.out.println("-" + a2.getMarke() + " " + a2.getKennzeichen() + " (" + a2.getFarbe()+")\n");
        //Buchung erstellen
        System.out.print("\nGeben Sie nun das gewünschte Kennzeich vom Auto ein: ");
        String ausgewaehlteKennzeichen = scanner.nextLine();
        System.out.println("Wie viele Tage wollen Sie das Auto buchen? ");
        int anzahlTage = scanner.nextInt();
        k1.buchen(1, ausgewaehlteKennzeichen,anzahlTage);
        //Print Buchung
        System.out.println("\nIhre Buchung: \n" + "Kundennummer: " + k1.getKundenNr() + "\nName: " + k1.getKundenVorname() + " " + k1.getKundenNachame());
        System.out.println(ausgewaehlteKennzeichen + " " + anzahlTage + " Tage");
    }
    /*static boolean checkKennzeichen(String ausgewaelhteKennzeichen) { //
        boolean status = false;
        String input = ausgewaelhteKennzeichen.toLowerCase();
        if (input == "GI-JP 111" && input == "GI-VH-200"){ //
            status = true;
        } else {
            System.out.println("Ihre Eingabe stimmt nicht überein oder hat ein Schreibfehler.");
        }
        return status;
    }*/
}
