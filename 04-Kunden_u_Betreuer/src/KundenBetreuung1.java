import java.io.IOException;
import java.util.Scanner;

public class KundenBetreuung1 {
    public static void main(String[] args) throws IOException {

        Scanner scanner = new Scanner(System.in);
        //Print Titel
        System.out.println("\n----------------------------------------");
        System.out.println("KundenBetreuung");
        System.out.println("----------------------------------------\n");
        //Arrays für Klassenobjekte erzeugen
        Kunde[] k = new Kunde[5];
        Betreuer[] b = new Betreuer[5];
        //Initialize Kunden in Arrays
        k[0] = new Kunde(1,"Lukas Schneider",0,0);
        k[1] = new Kunde(2,"Hannah Fischer",0,0);
        k[2] = new Kunde(3,"Paul Wagner",0,0);
        //Initialize Betreuer in Arrays
        b[0] = new Betreuer(4,"Sophie Becker",0);
        b[1] = new Betreuer(5,"Jonas Lehmann",0);
        b[2] = new Betreuer(6,"Marie Hoffmann",0);
        //Kunden Betreuer zuweisen
        k[0].setKundenBetreuer(b[0]);
        k[1].setKundenBetreuer(b[1]);
        k[2].setKundenBetreuer(b[2]);
        //KundeErteiltAuftrag
        System.out.println("\tAnwendungsfälle\n");
        System.out.println("\t1.Kunde erteilt Auftrag\n");
        System.out.println("\t2.Kunde bezahlt für den Auftrag\n");
        System.out.println("\t3.Betreuer ermittelt Provision\n");
        System.out.println("\t4.Auftrag wird beendet\n");
        System.out.println("Wählen sie aus: ");
        int userInput = scanner.nextInt();
        switch (userInput){
            case 1:
                Auftrag(k,b);
                break;
            case 2:
                Bezahlung(k,b);
                break;
            case 3:
                Provision(b);
                break;
            case 4:
                break;
            default:
                System.out.println("Ungültige eingabe!");
                break;
        }
    }
}
